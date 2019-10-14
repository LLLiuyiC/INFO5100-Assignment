package Assignment5.Q4;

public class MyIndexOutOfBoundException {
    private int lowerBound;
    private int upperBound;
    private int index;

    public MyIndexOutOfBoundException(int lowerBound,int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    public   void  setIndex(int i) throws indexOutOfBoundException{
        if(i<lowerBound || i> upperBound){
            System.out.println("Error Message: Index: "+i+",but Lower bount: "+lowerBound+",Upper bound: "+upperBound);
            throw  new indexOutOfBoundException();

        }
        this.index = i;
    }
    public  int getIndex(){
        return  index;
    }

    class indexOutOfBoundException extends Exception{


    }




}
