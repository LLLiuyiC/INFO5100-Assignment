package Assignment6;

import java.util.ArrayList;

public class Q3 {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return  false;
        if((s.length()==0) && (t.length()==0)) return  true;
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list1.add(s.split("")[i].charAt(0));
            list2.add(t.split("")[i].charAt(0));
        }
        int index;

        while(!(list1.size()==0)){
            if(!list2.contains(list1.get(0))){
                return false;
            }else {
               index = list2.indexOf(list1.get(0));

               list1.remove(0);
               list2.remove(index);
            }

        }

        return  true;
    }
    public static void main(String[] args){
        Q3 q = new Q3();
        System.out.println(q.isAnagram("acr","car"));
    }
}
