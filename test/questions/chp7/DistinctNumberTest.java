package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctNumberTest {

    @Test
    public void testThatDistinctNumberCanReturnNumberNdZeroTest(){
        int[] nums = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] actual = DistinctNumber.canReturnNumberNdZero(nums);
        int[] expected = {1, 2, 3, 6, 4, 5, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatDistinctNumberCanReturnDistinctNumbersWithOutZeroTest(){
        int[] nums = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] actual = DistinctNumber.canReturnNumberNdZero(nums);
        int[] expected = {1, 2, 3, 6, 4, 5, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);

        int[] disNum = DistinctNumber.canReturnDistinctNumbersWithOutZero(actual);
        int[] newExpNum = {1, 2, 3, 6, 4, 5};
        assertArrayEquals(disNum, newExpNum);
    }

    @Test
    public void testThatDistinctNumberCanReturnTheNumberOfDistinctNumbersTest(){
        int[] nums = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] actual = DistinctNumber.canReturnNumberNdZero(nums);
        int[] expected = {1, 2, 3, 6, 4, 5, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);

        int[] disNum = DistinctNumber.canReturnDistinctNumbersWithOutZero(actual);
        int[] newExpNum = {1, 2, 3, 6, 4, 5};
        assertArrayEquals(disNum, newExpNum);

        int numberOfDis = DistinctNumber.canCountNumberOfDistNumb(disNum);
        assertEquals(6, numberOfDis);
    }
}
