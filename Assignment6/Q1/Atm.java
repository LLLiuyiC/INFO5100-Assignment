package Assignment6.Q1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Atm {
    private  double availableAmountInMachine;
    private  double transactionFee;
    private List<String> userData;
    private int count;
    private double rate;
    private HashMap<String,User> userTransaction;
    public  Atm(double availableAmountInMachine,double transactionFee){
        this.availableAmountInMachine =availableAmountInMachine;
        this.transactionFee =transactionFee;
       List<String> userData = new ArrayList<String>();
       HashMap<String,User> userTransaction = new HashMap<>();
        this.userData =userData;
        this.userTransaction = new HashMap<>();
        count=0;
        rate=0.1;
    }
    public  void setAvailableAmountInMachine(double availableAmountInMachine){
        this.availableAmountInMachine=availableAmountInMachine;
    }
    public double getAvailableAmountInMachine(){
        return availableAmountInMachine;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public List<String> getUserData() {
        return userData;
    }

    public void setUserData(List<String> userData) {
        this.userData = userData;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public HashMap<String, User> getUserTransaction() {
        return userTransaction;
    }

    public void setUserTransaction(HashMap<String, User> userTransaction) {
        this.userTransaction = userTransaction;
    }

    public void createUser(String str){
        String s[] = str.split("&");
        User user = new User(s[0],Integer.parseInt(s[1]),s[2],s[3],s[4]);
        userData.add(str);

        userTransaction.put(s[4],user);
        boolean test = userTransaction.containsValue(user);

        return;
    }
    public boolean login(String str){
        String[] s= str.split("&");
        for(int i=0;i<userData.size();i++){
            String[] ud =userData.get(i).split("&");
            if(ud[4].equals(s[0])){
                if(ud[5].equals(s[1])){
                    return true;
                }

            }
        }
        return false;
    }
    public User locateUser(String str){
        User user =userTransaction.get(str);

        System.out.println(userTransaction.isEmpty());

        return user;
    }

    public boolean checkInformation(String str){
        String[] s= str.split("&");
        for(int i=0;i<userData.size();i++){
            String[] ud =userData.get(i).split("&");
            if(ud[4].equals(s[0])){
                if(ud[0].equals(s[1])&&ud[1].equals(s[2])&&ud[3].equals(s[3])){
                    return true;
                }
        }}
            return  false;
    }

    public void resetPassword(String s,String accountnumber) {
        for (int i = 0; i < userData.size(); i++) {
            String[] ud = userData.get(i).split("&");
            if (ud[4].equals(accountnumber)) {
                userData.set(i,ud[0]+"&"+ud[1]+"&"+ud[2]+"&"+ud[3]+"&"+ud[4]+"&"+s);
                System.out.println(ud[0]+"&"+ud[1]+"&"+ud[2]+"&"+ud[3]+"&"+ud[4]+"&"+s);
                return;
            }

        }
    }
    public void addAccount(String str) {
        String s[] = str.split("&");
        User user = new User(s[0],Integer.parseInt(s[1]),s[2],s[3],s[4]);
        userData.add(str);

        userTransaction.put(s[4],user);
        boolean test = userTransaction.containsValue(user);

        return;


    }
    public void  calculateAaim(double amount,int operate){
        if(operate==0){
            if(amount>availableAmountInMachine){
                System.out.println("the available balance in machine is not enough!");
                return;
            }
            availableAmountInMachine = availableAmountInMachine-amount;
            System.out.println("the   availableAmountInMachine is"+availableAmountInMachine);
            return;
        }
        availableAmountInMachine +=amount;
        System.out.println("the   availableAmountInMachine is"+availableAmountInMachine);
        return;

    }

    public void  calculateFee(double amount){
        transactionFee += amount*rate;
        System.out.println("the   transactionFee is"+transactionFee);
        return;
    }


}
