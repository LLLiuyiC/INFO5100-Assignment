package Assignment4.Q2;

public class Sad extends Moody {

    @Override
    protected  String getMood(){
        return  "sad";
    };
    @Override
    public  void  expressFeelings(){
        System.out.println("'Wah''boo hoo''weep''sob''weep'");
    }

    public  String toString(){
        return "Subject cries a lot";
    };

}
