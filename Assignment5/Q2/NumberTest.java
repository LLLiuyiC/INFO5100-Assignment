package Assignment5.Q2;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest {






    @Test
    public void countTest() {
        Number num = new Number();
        int a = 9;
        int b = 2;
        int q = num.count(a,b);
        assertEquals(4,q);
    }




}
