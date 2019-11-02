package Assignment7;
import org.junit.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class testCreateTXT {

    @Test
    public void  createTXTTest() throws Exception {

         String path="/Users/liuyichen/IdeaProjects/assignment2/src/Assignment7/";

        String fileName="testCreateTXT";
        assignment.createTXT(fileName);
        boolean flag=false;
        String fn = path+fileName+".txt";
        File file =new File(fn);


        if(file.exists()) flag =true;
        assertTrue(flag);




    }
}
