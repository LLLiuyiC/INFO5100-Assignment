package Assignment4.Q2;

public class PsychiatristObject {
    public  void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.queryMood();
        moody.expressFeelings();

    }
    public  void  observe(Moody moody){
        System.out.println("Observation:"+moody.toString()+"\n");
    }
}
