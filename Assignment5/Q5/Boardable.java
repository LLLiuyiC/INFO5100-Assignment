package Assignment5.Q5;

import java.text.ParseException;

public interface Boardable {
    public  void setBoardStart(int month,int day,int year);
    public  void  setBoardEnd(int month,int day,int year);
    public  boolean boarding(int month,int day,int year) throws ParseException;
}
