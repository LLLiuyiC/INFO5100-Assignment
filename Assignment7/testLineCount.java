package Assignment7;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class testLineCount {

    @Test
    public void lineCountTest() throws FileNotFoundException {
        String path="/Users/liuyichen/IdeaProjects/assignment2/src/Assignment7/";
        String fileName="testLineCount";
        fileName = path+fileName+".txt";
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        int n=assignment.LineCount(fis);
        assertEquals(n,4);


    }
}
