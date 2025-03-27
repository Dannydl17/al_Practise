package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSortedListTest {

    @Test
    public void testThatTheFirstListCanBeSortedTest(){
        int[] num = { 5, 1, 5, 16, 61, 111};
        int[] actual = TwoSortedList.canSortArray(num);
        int[] expected = {1, 5, 5, 16, 61, 111};
        assertArrayEquals(expected, actual);

        int[] nums = TwoSortedList.canCompareAndChangeElementWithTheSameValueToZero(actual);
        int[] expectedA = {1, 5, 0, 16, 61, 111};
        assertArrayEquals(expectedA, nums);

        int[] numb = TwoSortedList.canReturnNewElementOfArrayWithOutZero(nums);
        int[] newExpected = {1, 5, 16, 61, 111};
        assertArrayEquals(newExpected, numb);

    }

    @Test
    public void testThatTheSecondListCanBeSortedTest(){
        int[] num = {4, 2, 4, 5, 6};
        int[] actual = TwoSortedList.canSortArray(num);
        int[] expected = {2, 4, 4, 5, 6};
        assertArrayEquals(expected, actual);

        int[] nums = TwoSortedList.canCompareAndChangeElementWithTheSameValueToZero(actual);
        int[] expectedA = {2, 4, 0, 5, 6};
        assertArrayEquals(expectedA, nums);

        int[] numb = TwoSortedList.canReturnNewElementOfArrayWithOutZero(nums);
        int[] newExpected = {2, 4, 5, 6};
        assertArrayEquals(newExpected, numb);
    }

    @Test
    public void testThatTheArrayCanBeMergeTogetherTest(){
        int[] num = { 5, 1, 5, 16, 61, 111};
        int[] actual = TwoSortedList.canSortArray(num);
        int[] expected = {1, 5, 5, 16, 61, 111};
        assertArrayEquals(expected, actual);

        int[] nums = TwoSortedList.canCompareAndChangeElementWithTheSameValueToZero(actual);
        int[] expectedA = {1, 5, 0, 16, 61, 111};
        assertArrayEquals(expectedA, nums);

        int[] numb = TwoSortedList.canReturnNewElementOfArrayWithOutZero(nums);
        int[] newExpected = {1, 5, 16, 61, 111};
        assertArrayEquals(newExpected, numb);

        int[] numO = {4, 2, 4, 5, 6};
        int[] actualN = TwoSortedList.canSortArray(numO);
        int[] expectedN = {2, 4, 4, 5, 6};
        assertArrayEquals(expectedN, actualN);

        int[] numsO = TwoSortedList.canCompareAndChangeElementWithTheSameValueToZero(actualN);
        int[] expectedAO = {2, 4, 0, 5, 6};
        assertArrayEquals(expectedAO, numsO);

        int[] numbO = TwoSortedList.canReturnNewElementOfArrayWithOutZero(numsO);
        int[] newExpectedO = {2, 4, 5, 6};
        assertArrayEquals(newExpectedO, numbO);

        int[] newArray = TwoSortedList.canMergeAnArray(numb, numbO);
        int[] newArrayEx ={1, 2, 4, 5, 5, 6, 16, 61, 111};
        assertArrayEquals(newArrayEx, newArray);

    }


}
