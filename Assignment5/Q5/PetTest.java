package Assignment5.Q5;

import org.junit.Test;
import static org.junit.Assert.*;

public class PetTest {
    @Test
    public  void  pet(){
        Pet pet = new Pet("Spot","Mary","Color and White");
        pet.setSex(1);
        String str = pet.toString();
        assertEquals("Spot",pet.getPetName());
        assertEquals("Mary",pet.getOwnerName());
        assertEquals("Color and White",pet.getColor());
        assertEquals("MALE",pet.getSex());
        assertEquals("Spot owned by Mary\nColor: Color and White\nSex:MALE",str);
    }
}
