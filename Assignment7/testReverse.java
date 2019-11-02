package Assignment7;
import org.junit.Test;
import static org.junit.Assert.*;

public class testReverse {

    @Test
    public void  reverseTest(){
        String str ="to reverse this sentence";
        String result = assignment.reverse(str);
        assertEquals("sentence this reverse to.",result);

    }
}
