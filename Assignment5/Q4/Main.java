package Assignment5.Q4;

public class Main {

    public static void main(String[] args) throws MyIndexOutOfBoundException.indexOutOfBoundException{


        try {
            MyIndexOutOfBoundException mio = new MyIndexOutOfBoundException(0,9);
            mio.setIndex(-1);
        }catch (MyIndexOutOfBoundException.indexOutOfBoundException io){
            throw io;
        }



    }
}
