package Assignment7;

public class SumValue {

    public static int totalSum=0;
    public static Object LOCK = new Object();
    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){

        for(int i=0;i<arr.length;i++){
        arr[i] = (int) (Math.random()*10);} //produce random numbers between 0-9


    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr) throws InterruptedException {
        Thread thread1 = new Cal(0,999999,arr);
        Thread thread2 = new Cal(1000000,1999999,arr);
        Thread thread3 = new Cal(2000000,2999999,arr);
        Thread thread4 = new Cal(3000000,3999999,arr);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }



    static class Cal extends Thread {
        private int start;
        private  int end;
        private  int[] arr;
        //private  int sum;

        public Cal(int start,int end,int[] arr){
            this.start=start;
            this.end=end;
            this.arr=arr;
        }
        @Override
        public void run(){
          synchronized (LOCK){
            int i=start;
            int j=end;
            while(i<=j){
                totalSum +=arr[i];
                i++;
            }}

        }

    }


}


