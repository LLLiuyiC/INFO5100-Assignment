package Assignment5.Q3;

import org.junit.Test;
import  static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void TestContractor(){
        Employee c = new Contractor("Lily",20,3);
        int salary = c.calculateSalary();
        String name = c.getName();
        int pph = c.getPaymentPerhour();
        assertEquals(60,salary);
        assertEquals(20,pph);
        assertEquals("Lily",name);


    }
    @Test
    public void TestFullTime(){
        Employee c = new FullTime("Jane",30);
        int salary = c.calculateSalary();
        String name = c.getName();
        int pph = c.getPaymentPerhour();
        assertEquals(240,salary);
        assertEquals(30,pph);
        assertEquals("Jane",name);
    }
}
