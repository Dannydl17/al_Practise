package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberInArrayTest {

    @Test
    public void testThatArrayCanReturnTheLargestNumberTest(){
        int[] nums = {30, 67, 80};
        int expected = LargestNumberInArray.canReturnLargestNumberInArray(nums);
        assertEquals(80, expected);
    }
}
