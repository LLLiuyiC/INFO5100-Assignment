package Assignment7;
import org.junit.Test;
import static org.junit.Assert.*;

public class testDecoded {

    @Test
    public void decodedTest(){
        String str="2[abc]3[cd]ef";

        String result = assignment.decoded(str);

        assertEquals("abcabccdcdcdef",result);
    }
}
