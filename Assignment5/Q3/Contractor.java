package Assignment5.Q3;

public class Contractor extends  Employee {
    private  int workingHours;
    public Contractor(String name,int paymentPerHour,int workingHours){
        super(name,paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        int salary = workingHours *getPaymentPerhour();
        return salary;
    }
}
