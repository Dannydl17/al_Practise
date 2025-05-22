package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocateLargestNumberTest {

    @Test
    public  void testThatAllLargestNumberCanBeReturnTest(){
        double[][] nums = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };

        double[] allLargestNumber = LocateLargestNumber.canReturnAllTheLargestNumber(nums);
        assertEquals(35.0, allLargestNumber[0]);
        assertEquals(45.0, allLargestNumber[1]);
        assertEquals(44.0, allLargestNumber[2]);
        assertEquals(3, allLargestNumber.length);
    }

    @Test
    public void testThatLargestNumberCanBeReturnTest(){
        double[][] nums = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };

        double[] allLargestNumber = LocateLargestNumber.canReturnAllTheLargestNumber(nums);
        assertEquals(35.0, allLargestNumber[0]);
        assertEquals(45.0, allLargestNumber[1]);
        assertEquals(44.0, allLargestNumber[2]);
        assertEquals(3, allLargestNumber.length);

        double largestNumber = LocateLargestNumber.canReturnLargestNumber(allLargestNumber);
        assertEquals(45.0, largestNumber);
    }

    @Test
    public void testThatLargestNumberCanBeLocatedThroughRowIndexAndColumnTest(){
        double[][] nums = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        int[] rowIndexNdColumnIndex = LocateLargestNumber.locateLargest(nums);
        assertEquals(1, rowIndexNdColumnIndex[0]);
        assertEquals(2, rowIndexNdColumnIndex[1]);
        assertEquals(2, rowIndexNdColumnIndex.length);
    }
}
