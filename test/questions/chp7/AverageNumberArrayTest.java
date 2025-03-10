package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageNumberArrayTest {

    @Test
    public void testThatAnAverageCanBeCalculatedTest(){
        int[] nums ={(int) 5.5, (int) 4.5, (int) 3.0, (int) 2.2, (int) 6.8, (int) 7.7, (int) 9.1};
        int results = AverageNumberArray.canCalculateAnAverageNumber(nums);
        assertEquals(4, results);
    }

    @Test
    public void testThatAnAverageCanBeCalculatedDoubleTest(){
        double[] nums ={5.5, 4.5, 3.0, 2.2, 6.8, 7.7, 9.1};
        double results = AverageNumberArray.canCalculateAnAverageNumberDouble(nums);
        assertEquals(4.142857142857143, results);
    }
}
