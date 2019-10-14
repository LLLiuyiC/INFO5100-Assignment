package Assignment5.Q5;

public class Pet {
    private String petName;
    private String ownerName;
    private  String color;
    protected  int sex;

    public  static final int MALE(){
        return 1;
    }
    public  static final int FEMALE(){
        return 2;
    }
    public  static final int SPAYED(){
        return 3;
    }
    public  static final int NEUTERED(){
        return 4;
    }

    public Pet(String name,String ownerName, String color){
        this.color = color;
        this.ownerName = ownerName;
        this.petName = name;
    }
    public  String getPetName(){
        return petName;
    }
    public  String getOwnerName(){
        return  ownerName;
    }
    public  String getColor(){
        return  color;
    }
    public  void  setSex(int sexid){
        if(sexid == 1 ||sexid == 2 ||sexid == 3 ||sexid == 4 ){
        this.sex = sexid;}
        else {
            throw  new IllegalArgumentException("the sex should be integer between 1 and 4!");
        }
    }
    public String getSex(){
        if(sex ==1){return "MALE";}
        else if (sex ==2) {return "FEMALE";}
        else if (sex ==3) {return "SPAYED";}
        else { return "NEUTERED";}

    }
    public String toString(){
        String str ="";
        str = petName+" owned by "+ownerName+"\n"+"Color: "+color+"\n"+"Sex:"+getSex();

        return  str;
    }
}
