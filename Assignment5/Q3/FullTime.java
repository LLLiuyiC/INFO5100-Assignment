package Assignment5.Q3;

public class FullTime extends Employee{
    public FullTime(String name,int paymentPerHour){
        super(name,paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        int salary = 8*getPaymentPerhour();
        return salary;
    }
}
