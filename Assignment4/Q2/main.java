package Assignment4.Q2;

public class main {

    public  static void main(String[] args ){
        Happy h = new Happy();
        Sad s = new Sad();
        PsychiatristObject p = new PsychiatristObject();
        p.examine(h);
        p.observe(h);
        p.examine(s);
        p.observe(s);

    }
}
