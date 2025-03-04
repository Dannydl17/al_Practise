package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOccurrenceTest {


    @Test
    public void testThatAnArrayCanBeSortedTest(){
        int[] num = {2, 5, 6, 5, 4, 3, 23, 43, 2};
        int[] actual = NumberOccurrence.canSortArray(num);
        int[] expected = {2, 2, 3, 4, 5, 5, 6, 23, 43};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatElementsWithTheSameValueCanBeChangeToZero(){
        int[] num = {2, 5, 6, 5, 4, 3, 23, 43, 2};
        int[] result = NumberOccurrence.canSortArray(num);
        int[] actual = NumberOccurrence.canCompareAndChangeElementWithTheSameValueToZero(result);
        int[] expected = {2, 0, 3, 4, 5, 0, 6, 23, 43};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testThatANewElementsOfAnArrayCanBeReturnTest(){
        int[] num = {2, 5, 6, 5, 4, 3, 23, 43, 2};
        int[] result = NumberOccurrence.canSortArray(num);
        int[] actual = NumberOccurrence.canCompareAndChangeElementWithTheSameValueToZero(result);
        int[] expected = {2, 0, 3, 4, 5, 0, 6, 23, 43};
        assertArrayEquals(expected, actual);

        int[] nums = NumberOccurrence.canReturnNewElementOfArrayWithOutZero(actual);
        int[] newArray = {2, 3, 4, 5, 6, 23, 43};
        assertArrayEquals(newArray, nums);
    }


    @Test
    public void testThatTheNumberOfTimeANumberIsReadCanBeCountedTest(){
        int[] num = {2, 5, 6, 5, 4, 3, 23, 43, 2};
        int[] actual = NumberOccurrence.canCountOccurringNumber(num);
        assertEquals(2, actual[0]);
        assertEquals(1, actual[1]);
        assertEquals(1, actual[2]);
        assertEquals(2, actual[3]);
        assertEquals(1, actual[4]);
        assertEquals(1, actual[5]);
        assertEquals(1, actual[6]);
        assertEquals(7, actual.length);
    }
}
