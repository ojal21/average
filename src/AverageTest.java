import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AverageTest {
  
    @Test
    void averageTest(){
        Average avg_test=new Average();
        int [] l1={1,5,2,7,8,4,2,10};
        
        //list.length=0
        int [] l2={};

        //min-1
        int k1=-1;
        
        //min+1,max
        int k2=3;
        int k3=8;

        //max+1
        int k4=l1.length+1;
        int tc1=avg_test.average(k1,l1);
        assertEquals(0, tc1);

        int tc2= avg_test.average(k2, l1);
        assertEquals(2, tc2);

        int tc3= avg_test.average(k3, l1);
        assertEquals(4, tc3);

        int tc4=avg_test.average(k4, l1);
        assertEquals(4,tc4);

        int tc5= avg_test.average(k2, l2);
        assertEquals(0, tc5);
        
    }      
}
