package Assignment8.sis;

public class Student {
    private String name;
    private  String ID;
    private  String gender;
   // private  int count;

    public  Student(String name,String ID,String gender){
        this.gender=gender;
        this.ID=ID;
        this.name=name;
       // this.count = count;
    }

    public String getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
