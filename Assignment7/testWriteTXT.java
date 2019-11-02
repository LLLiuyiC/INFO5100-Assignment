package Assignment7;
import org.junit.Test;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

import static org.junit.Assert.*;

public class testWriteTXT {

    @Test
    public void writeTXTtest() throws Exception{
        String path="/Users/liuyichen/IdeaProjects/assignment2/src/Assignment7/";


        String filename="testWriteTXT";
        String toWrite = "to write something.";
        assignment.writeTxt(toWrite,filename);



        String result="";
        filename = path+filename+".txt";
        File file=new File(filename);
        FileInputStream fis= new FileInputStream(file);
        while(true){
            int x= fis.read();
            if(x==-1) break;;
            char c = (char) x;
            result +=String.valueOf(c);
        }

        assertEquals("to write something.",result);



    }

}
