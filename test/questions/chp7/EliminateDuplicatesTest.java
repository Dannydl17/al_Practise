package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static questions.chp7.NumberOccurrence.canCompareAndChangeElementWithTheSameValueToZero;
import static questions.chp7.NumberOccurrence.canSortArray;

public class EliminateDuplicatesTest {

    @Test
    public void testThatElementsOfTheSameTypeCanBeChangeToZeroTest(){
        int [] nums = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] expected = EliminateDuplicates.canReplaceZeroWithDuplicateElement(nums);
        int[] actual = {1, 2, 3, 0, 0, 6, 0, 4, 5, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatANewElementsOfAnArrayCanBeReturnTest(){
        int[] num = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] expected = EliminateDuplicates.canReplaceZeroWithDuplicateElement(num);
        int[] actual = {1, 2, 3, 0, 0, 6, 0, 4, 5, 0};
        assertArrayEquals(expected, actual);

        int[] nums = EliminateDuplicates.canReturnNewElementOfArrayWithOutZero(actual);
        int[] newArray = {1, 2, 3, 6, 4, 5};
        assertArrayEquals(newArray, nums);
    }
}
