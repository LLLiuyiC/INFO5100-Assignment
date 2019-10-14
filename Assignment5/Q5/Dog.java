package Assignment5.Q5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable{
    private   String size;
    private Date boardStart;
    private Date boardEnd;

    SimpleDateFormat sf = new SimpleDateFormat("MM-dd-yyyy");
    public Dog(String name, String ownerName,String color,String size){
        super(name,ownerName,color);
        this.size = size;
    }
    public String getSize(){
        return  size;
    }
    public String toString(){
        String str ="";
        str = super.getPetName()+" owned by "+super.getOwnerName()+"\n"+"Color: "+super.getColor()+"\n"+"Sex:"+getSex()+"\nSize: "+size;
        return  str;
    }
    @Override
    public  void setBoardStart(int month,int day,int year){
        String dateInput = String.valueOf(month)+"-"+String.valueOf(day)+"-"+String.valueOf(year);
        try{
            Date date = sf.parse(dateInput);
            boardStart =date;
        }catch (ParseException pe){
            pe.printStackTrace();
        }
    };
    @Override
    public  void  setBoardEnd(int month,int day,int year){
        String dateInput = String.valueOf(month)+"-"+String.valueOf(day)+"-"+String.valueOf(year);
        try{
            Date date = sf.parse(dateInput);
            boardEnd =date;
        }catch (ParseException pe){
            pe.printStackTrace();
        }

    };
    @Override
    public  boolean boarding(int month,int day,int year) throws ParseException{
        String dateInput = String.valueOf(month)+"-"+String.valueOf(day)+"-"+String.valueOf(year);

        Date date = sf.parse(dateInput);
        if(date.compareTo(boardStart)>=0 && date.compareTo(boardEnd)<=0 ){
            return  true;
        }else {
            return false;}


    };
}
