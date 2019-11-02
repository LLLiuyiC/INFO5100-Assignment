package Assignment7;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class testReadFromFile {

    @Test
    public void readFromfileTest() throws IOException {
        String str = "testReadFromFile";
        String result =assignment.readFromFile(str);
        assertEquals("It's true.",result);
    }
}
