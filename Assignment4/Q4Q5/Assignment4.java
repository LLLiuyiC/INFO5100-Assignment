package Assignment4.Q4Q5;

public class Assignment4 {

    public  static void main(String[] args) {

        int[][] A = new int[2][3];
        A[0][0] = 1;
        A[0][1] = 0;
        A[0][2] = 0;
        A[1][0] = -1;
        A[1][1] = 0;
        A[1][2] = 3;


        int[][] B = new int[3][3];
        B[0][0] = 7;
        B[0][1] = 0;
        B[0][2] = 0;
        B[1][0] = 0;
        B[1][1] = 0;
        B[1][2] = 0;
        B[2][0] = 0;
        B[2][1] = 0;
        B[2][2] = 1;

        Assignment4 ass = new Assignment4();
        int[][] C = ass.matricsMultiply(A, B);

        System.out.print("AB = \n");

        for (int i = 0; i < A.length; i++) {

            System.out.print("|");
            for (int j = 0; j < A[0].length; j++) {
                System.out.print("  " + A[i][j]);
                if (j != A[0].length - 1) {
                    System.out.print(",  ");
                }
            }
            System.out.println(" |\n");
           }
        System.out.println("X");

        for (int i = 0; i < B.length; i++) {

            System.out.print("|");
            for (int j = 0; j < B[0].length; j++) {
                System.out.print("  " + B[i][j]);
                if (j != B[0].length - 1) {
                    System.out.print(",  ");
                }
            }
            System.out.println(" |\n");
        }

        System.out.println("=\n");

        for (int i = 0; i < C.length; i++) {

            System.out.print("|");
            for (int j = 0; j < C[0].length; j++) {
                System.out.print("  " + C[i][j]);
                if (j != C[0].length - 1) {
                    System.out.print(",  ");
                }
            }
            System.out.println(" |\n");
        }

            String str1 = "IDID";
            testQ5(str1);
            String str2 = "III";
            testQ5(str2);
             String str3 = "DDI";
             testQ5(str3);




        }

        public static void testQ5(String str){
            Assignment4 ass = new Assignment4();
            int[] s = ass.IdPermutation(str);
            System.out.print("Input: "+str +" ");
            System.out.print("Output:[");
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]);
                if(i !=s.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("]");



        }


    //Q4

    public int[][] matricsMultiply(int[][] A,int[][] B){

        int aRowSize = A.length;
        int aColumnSize = A[0].length;
        int bRowSize = B.length;
        int bColumnSize = B[0].length;
        if(aColumnSize != bRowSize){throw new IllegalArgumentException("A's column number must be equal to B's row number!");
        }else{
            int[][] C = new int[aRowSize][bColumnSize];
            for(int i = 0;i<aRowSize;i++){

                for(int j =0;j<bColumnSize;j++){
                    int c =0;
                    for(int k = 0;k<bColumnSize;k++) {
                        c = c + A[i][k] * B[k][j];
                    }
                    C[i][j] = c;
                }

            }
            return C;
        }



    }

    //Q5

    public int[] IdPermutation(String str){
        int N= str.length();
        String[] s =str.split("");

        if(str.length()==1){
            if (s[0].equals("D")) {
                int[] result ={N,N-1};
                return  result;
            }else {
                int[] result ={N-1,N};
                return  result;
            }


        }


        int[] result =new int[N+1];
        int i = 0;
        int max =N;
        int min = 0;
        if (s[0].equals("I")){
            result[i] = min;
            min++;
        }
        if (s[0].equals("D")){
            result[i] = max;
            max --;
        }
        i=0;
        while (i<N-1){
            i++;
            if (s[i-1].equals("I")){
                if(s[i-1].equals(s[i])){
                    result[i] = min;
                    min++;
                }else{
                result[i] = max;
                max --;}

            }
            if (s[i-1].equals("D")){
                if(s[i-1].equals(s[i])){
                    result[i] = max;
                    max--;
                }
                else{
                    result[i] = min;
                    min++;}
            }


        }

        if(s[N-1]!= null && s[N-1].equals("D")){
            result[N] = min;
        }else{
            result[N] = max;
        }


        return result;

    }





}


