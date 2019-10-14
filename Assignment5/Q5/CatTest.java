package Assignment5.Q5;

import org.junit.Test;

import java.text.ParseException;
import  static  org.junit.Assert.*;

public class CatTest {
    @Test
    public   void catTest() throws ParseException {
        Cat c = new Cat("Tom","Bob","black","short");
        c.setSex(3);
        c.setBoardStart(10,2,2019);
        c.setBoardEnd(11,3,2019);
        assertEquals("Tom",c.getPetName());
        assertEquals("Bob",c.getOwnerName());
        assertEquals("black",c.getColor());
        assertEquals("short",c.getHairLength());
        assertEquals("SPAYED",c.getSex());
        assertEquals(true,c.boarding(10,2,2019));
    }
}
