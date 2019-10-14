package Assignment5.Q5;

import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class DogTest {
    @Test
    public   void dogTest() throws ParseException {
        Dog c = new Dog("Spot","Susan","white","medium");
        c.setSex(3);
        c.toString();
        c.setBoardStart(10,2,2019);
        c.setBoardEnd(11,3,2019);
        assertEquals("Spot",c.getPetName());
        assertEquals("Susan",c.getOwnerName());
        assertEquals("white",c.getColor());
        assertEquals("medium",c.getSize());
        assertEquals("SPAYED",c.getSex());
        assertEquals(false,c.boarding(10,1,2019));
    }
}
