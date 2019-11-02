package Assignment7;
import org.junit.Test;
import static org.junit.Assert.*;

public class testSumValue {
    @Test
    public  void  sumValueTest() throws InterruptedException {
    int[] arr =new int[4000000];
    SumValue.generateRandomArray(arr);
    int i=0;
    int testSum=0;
    while (i<4000000){
        testSum +=arr[i];
        i++;
    }
    long totalSum = SumValue.sum(arr);

    assertEquals(testSum,testSum);

    }
}
