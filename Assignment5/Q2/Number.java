package Assignment5.Q2;

import java.util.InputMismatchException;

public class Number {

    public int count(int x,int y){

        examinCount(x,y);
        int q = x/y;
        return q;

    }

    public  void examinCount(int x,int y)  throws  ArithmeticException,InputMismatchException{
        try{int q = x/y;}
        catch (ArithmeticException ae){
            System.out.println("y should not be 0");
            throw ae;
        }
        catch (InputMismatchException ime){
            System.out.println("input data should be integer");
            throw ime;
        }
    }





}
