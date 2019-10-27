package Assignment6.Q1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private  String name;
    private  int age;
    private  String address;
    private  String phoneNumber;
    private  String bankAccountNumber;
    private double balance;
    private List<String> transaction;

    public User(String name,int age,String address,String phoneNumber,String bankAccountNumber){
        this.address = address;
        this.age =age;
        this.bankAccountNumber = bankAccountNumber;
        this.name = name;
        this.phoneNumber =phoneNumber;

        this.balance=0;
        List<String> transaction= new ArrayList<>();
        this.transaction = transaction;

    }

    public void  setName(String name){
        this.name =name;
    }
    public  String getName(){
        return  name;
    }

    public  void setAge(int age){
        this.age=age;
    }
    public  int getAge(){
        return  age;
    }
    public  void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;

    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public  void  setBankAccountNumber(String bankAccountNumber){
        this.bankAccountNumber= bankAccountNumber;
    }
    public String getBankAccountNumber(){
        return bankAccountNumber;
    }




    public void setTransaction(List<String> transaction) {
        this.transaction = transaction;
    }

    public List<String> getTransaction() {
        return transaction;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void findAvailableBalance(){
        System.out.println("the available balance is"+balance);
        return;
    }
    public  void withdrawOperation(double amount,Atm atm){
        if(amount>balance){
            System.out.println("the available balance is not enough!");
            return ;
        }
        balance = balance-amount*(1+atm.getRate());
        String str = "0&"+String.valueOf(amount);
        transaction.add(str);
        atm.calculateAaim(amount,0);    //update the availableAmountInMachine
        atm.calculateFee(amount);              //while withdraw ,user should pay for the traction fee.the amount equal to amount*rate.

        return ;
    }
    public  void depositOperation(double amount,Atm atm){

        balance += amount;
        String str = "1&"+String.valueOf(amount);
        transaction.add(str);
        atm.calculateAaim(amount,1); //update the availableAmountInMachine
        return ;
    }
    public  void findRecentTransactions(){
        if(transaction==null){
            System.out.println("there is no recent transaction record");
            return;
        }
        String operation ="";
        int length = transaction.size();
        for(int i=0;i<Math.min(10,length);i++){
            if(transaction.get(length-1-i).split("&")[0].equals("0")){
                operation ="withdraw";
            }else{operation="deposit";}
            System.out.println(i+"."+operation+"-"+transaction.get(length-1-i).split("&")[1]);

        }
    }

}
