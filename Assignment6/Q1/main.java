package Assignment6.Q1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public  static void main(String[] args){
        Atm atm= new Atm(10000,0);
        operation(atm);}


      public static void operation(Atm atm) {
          Scanner scanner = new Scanner(System.in);

          while(true){
              System.out.println("NEW USER|| CURRENT USER||FORGOT THE PASSWORD||ADD||EXIT");
              String line = scanner.nextLine();
          if (line.equals("CURRENT USER")) {
              User user = login(atm,scanner);
              if(user==null){
                  continue;
              }

              transactionOperation(atm,user);

              }

          if (line.equals("NEW USER")) {
              createUser(atm,scanner);
          }
          if(line.equals("FORGOT THE PASSWORD")){
              resetPassword(atm,scanner);
          }
              if (line.equals("ADD")) {
                  addAccount(atm,scanner);
              }
           if(line.equals("EXIT")){break;} }
    }
      public static  void createUser(Atm atm,Scanner scanner){
       System.out.println("Let's create a new account!");
        String str ="";
        System.out.println("Please input your name:");
        str += scanner.nextLine()+"&";

        System.out.println("Please input your age:");
        str += scanner.nextLine()+"&";
          System.out.println("Please input your address:");
          str += scanner.nextLine()+"&";
          System.out.println("Please input your phoneNumber:");
          str += scanner.nextLine()+"&";

          SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//get the Account number automatically
          String count = String.valueOf(atm.getCount());//count can guarantee the Account number be unique
          atm.setCount(atm.getCount()+1);
          count = String.format("%06d",Integer.parseInt(count));
          Date date = new Date();
          String accountNumber = sdf.format(date.getTime())+count;
          System.out.println("Your account numberis:"+accountNumber);
          str += accountNumber+"&";
          System.out.println(str);
          System.out.println("Please set your password:");
          str += scanner.nextLine();
          atm.createUser(str);


      }

    public static  User login(Atm atm,Scanner scanner){
        String str = "";
        System.out.println("please input your account number:");
       String accountnumber = scanner.nextLine();
        str += accountnumber+"&";
        System.out.println("please input your password:");
        str += scanner.nextLine();
        if(!atm.login(str)){
            System.out.println("the password/account number is wrong!please input again!");
            return null;
        }else {
            System.out.println("login successfully!");
            User user = atm.locateUser(accountnumber);
            System.out.println(user==null);
            return user;
        }
    }

    public static  void resetPassword(Atm atm,Scanner scanner){
        String str = "";
        System.out.println("please input your account number:");
        str += scanner.nextLine()+"&";
        System.out.println("please input your name:");
        str += scanner.nextLine()+"&";
        System.out.println("please input your age:");
        str +=scanner.nextLine()+"&";
        System.out.println("please input your phone number");
        str +=scanner.nextLine();
        if(!atm.checkInformation(str)){
            System.out.println("the information is wrong!please try again!");
            return;
        }else {
            String accountnumber =  str.split("&")[0];
            resetPasswordHelper(atm,scanner,accountnumber);
        }
    }
    public static  void resetPasswordHelper(Atm atm,Scanner scanner,String accountnumber){
        System.out.println("please input the new password:");
        String s = scanner.nextLine();
        atm.resetPassword(s,accountnumber);
        System.out.println("reset successfully!");

    }

    public static  void addAccount(Atm atm,Scanner scanner){
        String str = "";
        //System.out.println("please input information:");
        str="l&11&qqq&111&1234567&111";
        atm.addAccount(str);
        str="l&11&qqq&111&7654321&222";
        atm.addAccount(str);
        System.out.println("add successfully");
    }

    public static  void transactionOperation(Atm atm,User user){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("AVAILABLEBALANCE|WITHDRAWAL|DEPOSIT|RECENTTRANSACTIONS|CHANGEPASSWORD|EXIT");
            String line = scanner.nextLine();
            if(line.equals("AVAILABLEBALANCE")){
                user.findAvailableBalance();
            }
            if(line.equals("WITHDRAWAL")){
                System.out.println("input the amount of money you want to withdraw:");
                double amount = Double.parseDouble(scanner.nextLine()) ;
                user.withdrawOperation(amount,atm);
            }
            if(line.equals("DEPOSIT")){
                System.out.println("input the amount of money you want to deposit:");
                double amount = Double.parseDouble(scanner.nextLine()) ;
                user.depositOperation(amount,atm);
            }
            if(line.equals("RECENTTRANSACTIONS")){
                user.findRecentTransactions();
            }
            if(line.equals("CHANGEPASSWORD")){
                resetPasswordHelper(atm,scanner,user.getBankAccountNumber());
            }
            if(line.equals("EXIT")){
               break;
            }
    }

    }






}