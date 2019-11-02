package Assignment7;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class assignment {
    private  static String path="/Users/liuyichen/IdeaProjects/assignment2/src/Assignment7/";

    public static  void main(String[] args) throws  Exception{

        Q1("beforereverse");
         Q2("encoded");
        String fn = "lines";
        String fn2="line2";
        String[] fns = new String[2];
        fns[0] = fn;
        fns[1] = fn2;

        Q3(fns);
    }

    public  static  void  Q1(String fn) throws IOException {  //fn is the name of txt file before reverse
       // String fn="beforereverse";
        String str=readFromFile(fn);
        String reverseStr =  reverse(str);
        String fileName = "afterreverse";
        createTXT(fileName);
        writeTxt(reverseStr,fileName);

    }
    public  static  void  Q2(String fn) throws IOException {//fn is the name of encoded file
        //String fn="encoded";
        String str = readFromFile(fn);
        String decodedStr = decoded(str);
        String fileName ="decoded";
        createTXT(fileName);
        writeTxt(decodedStr,fileName);


    }
    public  static  void  Q3(String[] fns) throws IOException{//fns is the group of files'name
        int i=0;
        while(i<fns.length){
            LineCountsHelp(fns[i]);
            i++;

        }

    }
    public  static  void LineCountsHelp(String s) throws  IOException{
        try{
            String fileName = path+s+".txt";

        File file =new File(fileName);
        FileInputStream  fis = new FileInputStream(file);

        int count = LineCount(fis);
        System.out.println("File name: "+s+" line:"+count+".");
        }catch (Exception e){System.out.println("the file "+s+" does not exist");}
    }

    public static  int LineCount(FileInputStream fis){
        int count=0;
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()){
            count++;
            scanner.nextLine();
        }
        return count;

    }


    public static String decoded(String s){
        if(s.length()==0)return s;
        int nums=0;
        Stack<String> stack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        stack.push("");
        String string[] = s.split("");
        for(int i=0;i<string.length;i++){
            char c = string[i].charAt(0);
            if('0'<=c &&c <='9' ){
                nums =nums *10;
                nums += c-48;
            }

            else if(c=='['){
                numStack.push(nums);
                nums=0;
                stack.push("");
            }
            else if(c==']'){
                String str = stack.pop();
                StringBuilder sb = new StringBuilder();
                int count = numStack.pop();
                while (count>0){
                    sb.append(str);
                    count--;
                }
                stack.push(stack.pop()+sb.toString());
            }else{
                stack.push(stack.pop()+c);
            }

        }

        return  stack.peek();
    }

    public static String readFromFile(String fn) throws IOException {
        String str="";
        fn = path+fn+".txt";
        File  file=new File(fn);
        FileInputStream fis= new FileInputStream(file);
        while(true){
            int x= fis.read();
            if(x==-1) break;;
            char c = (char) x;
            str +=String.valueOf(c);
        }
        return str;
    }

    public static void createTXT(String fn) throws IOException {
        //String path="/Users/liuyichen/IdeaProjects/assignment2/src/Assignment7/";
        fn =  path +fn +".txt";
        File filename = new File(fn);
        if(!filename.exists()){
            filename.createNewFile();}
    }

    public static void writeTxt(String str,String fn) throws IOException {
        fn =  path +fn +".txt";
        FileOutputStream fos =new FileOutputStream(fn);
        fos.write(str.getBytes());
        fos.close();

    }

    public static String reverse(String s){
        s.trim();
        String str ="";
        String[] r = s.split("\\.");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<r.length;i++){

            String[] temp = r[i].split(" ");
            int k=0;
            stack.push(".");
            stack.push(temp[k]);
            k++;
            while(k<temp.length){
                stack.push(" ");
                stack.push(temp[k]);
                k++;

            }
        }
        while(!stack.isEmpty()){
            str +=stack.pop();
        }
        return str;
    }


}

