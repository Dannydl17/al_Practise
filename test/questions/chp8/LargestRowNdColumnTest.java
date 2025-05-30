package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRowNdColumnTest {

    @Test
    public void testThatTheLargestNumberCanBeCollectTest(){
        int[][] nums = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 1}
        };

        int[] largestNumber = LargestRowNdColumn.canReturnTheLargestNumber(nums);
        assertEquals(1, largestNumber[0]);
        assertEquals(1, largestNumber.length);
    }

    @Test
    public void testThatMostOnesCanBeCountedNdStoreTheResultTest(){
        int[][] nums = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 1}
        };

        int[] storeResult = LargestRowNdColumn.canCountTheNumberOfMostlyOnes(nums);
        assertEquals(2, storeResult[0]);
        assertEquals(2, storeResult[1]);
        assertEquals(3, storeResult[2]);
        assertEquals(3, storeResult.length);
    }

    @Test
    public void testThatLargestRowNdColumnCanReturnTheIndexWithMostlyOnesTest(){
        int[][] nums = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 1}
        };

        int indexNumber = LargestRowNdColumn.canReturnTheHighestNumberOfCountWithMostlyOnes(nums);
        assertEquals(2, indexNumber);
    }
}
