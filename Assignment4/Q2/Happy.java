package Assignment4.Q2;

public class Happy extends Moody {


    @Override
    protected  String getMood() {
        return  "happy";
    };
    @Override
    public  void  expressFeelings(){
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    public  String toString(){
        return "Subject laughs a lot";
    };


}