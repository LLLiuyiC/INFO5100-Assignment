package Assignment4.Q2;

abstract class Moody {
    protected abstract String getMood();
    protected  abstract void expressFeelings();
    public  void queryMood(){

        System.out.println("I feel" + " " +getMood()+" " +"today!\n");

    }


}
