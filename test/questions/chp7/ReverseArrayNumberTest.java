package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayNumberTest {

    @Test
    public void testThatAnArrayOfNumberCanBeReverseTest(){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        nums = ReverseArrayNumber.canReturnAReverseArray(nums);
        int[] expectedNums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedNums, nums);
    }
}
