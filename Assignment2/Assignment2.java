import java.math.BigDecimal;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public static double salaryGreaterThanFiveThousand(Employee[] employees) {
        // @TODO
        int length = employees.length;
        double sum = 0;
        for(int i = 0;i<length;i++){
            double salary = employees[i].getSalary();
            if ( salary >5000){
                sum += salary;
            }
        }

        return sum;
    }


    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public static  void fizzBuzz(Employee employee) {
        // @TODO
        int id = employee.getId();
        if(id%3 == 0 && !(id%5 ==0)){
            System.out.println("Fizz");
        }
        if(id%5 == 0 && !(id%3 ==0)){
            System.out.println("Buzz");
        }
        if(id%3 == 0 && id%5 ==0){
            System.out.println("FizzBuzz");
        }
    }


    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public static double calculateTax(Employee employee) {
        // @TODO
        double salary = employee.getSalary();
        BigDecimal salary1 = new BigDecimal(Double.toString(salary));
        double tax = 0;
        if(salary <= 2500){
            BigDecimal mul = new BigDecimal(Double.toString(0.1));
            tax = salary1.multiply(mul).doubleValue();
        }
        else if(salary <= 5000){
            BigDecimal mul = new BigDecimal(Double.toString(0.25));
            tax = salary1.multiply(mul).doubleValue();
            }
        else {
            BigDecimal mul = new BigDecimal(Double.toString(0.35));
            tax = salary1.multiply(mul).doubleValue();
        }

        return tax;
    }


    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public static void swap(Employee firstEmployee, Employee secondEmployee) {
        // @TODO
        double salary1 = firstEmployee.getSalary();
        double salary2 = secondEmployee.getSalary();
        firstEmployee.setSalary(salary2);
        secondEmployee.setSalary(salary1);
    }


    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public static int employeesAgeGreaterThan50(Employee[] employees) {
        // @TODO
        int length = employees.length;
        int num = 0;
        for(int i = 0;i<length;i++){
            if(employees[i].getAge() >50){
                num ++;
            }
        }
        return num;
    }


    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public static void reverseFirstName(Employee employee) {
        // @TODO
        String name = employee.getFirstName();
        String reverseName = "";
        char[] nameList =name.toCharArray();
        int length = name.length();
        for(int i=length -1;i >=0;i--){
            reverseName += nameList[i];
        }
        employee.setFirstName(reverseName);
    }


    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public static void isContainDigit(Employee employee) {
        // @TODO
        String name = employee.getFirstName();
        Boolean isContainDigit = false;
        int length = name.length();
        for (int i =0;i<length;i++){
            if (name.charAt(i) >= 48 && name.charAt(i) <=57){
                isContainDigit = true;
            }
        }
        System.out.println(isContainDigit);
    }


    /*
       Write a method to raise an employee's salary to three times of his/her original salary.
       Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
       DO NOT change the input in this method.
       Try to add a new method in Employee class: public void raiseSalary(double byPercent)
       Call this new method.
    */
    public static void tripleSalary(Employee employee) {
        // @TODO
        employee.raiseSalary(3);
    }


    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public static Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        // @TODO
        int length = employeesStr.length;
        for(int i=0;i<length;i++){
            String[] emp = employeesStr[i].split(",");
            int id = Integer.parseInt(emp[0]);
            String firstName = emp[1];
            int age = Integer.parseInt(emp[2]);
            double salary = Double.parseDouble(emp[3]);
            employees[i] = new Employee(id,firstName,age,salary);

        }
        return employees;
    }
}