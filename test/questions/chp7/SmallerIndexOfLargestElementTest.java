package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallerIndexOfLargestElementTest {

    @Test
    public void testThatSmallerIndexOfLargestElementCanBeReturnTest(){
        int[] nums = {1, 5, 3, 4, 7, 2};
        int expected = SmallerIndexOfLargestElement.canReturnSmallerIndexOfLargestElement(nums);
        assertEquals(4, expected);
    }
}
