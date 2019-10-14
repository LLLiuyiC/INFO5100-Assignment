package Assignment5.Q3;

abstract class Employee {
    private String Name;
    private  int paymentPerhour;
    public Employee(String name,int paymentPerhour){
        this.Name = name;
        this.paymentPerhour = paymentPerhour;

    }
    public abstract int calculateSalary();
    public String getName(){
        return  Name;
    }
    public  void setName(String name){
        this.Name = name;
    }
    public  int getPaymentPerhour(){
        return  paymentPerhour;
    }
    public void setPaymentPerhour(int paymentPerhour){
        this.paymentPerhour = paymentPerhour;
    }
}
