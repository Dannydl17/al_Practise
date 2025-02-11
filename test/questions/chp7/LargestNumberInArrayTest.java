package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberInArrayTest {

    @Test
    public void testThatArrayCanReturnTheLargestNumberTest(){
        int[] nums = {34, 100, 500, 1000, 70000};
        int expected = LargestNumberInArray.canReturnLargestNumberInArray(nums);
        assertEquals(70000, expected);
    }
}
