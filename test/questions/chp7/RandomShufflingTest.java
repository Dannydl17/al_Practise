package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomShufflingTest {

    @Test
    public void testThatNumberCanRandomlyShuffleTest(){
        int[] nums = {1, 5, 3, 4, 7, 2};
        int[]actual = RandomShuffling.canReturnRandomShuffling(nums);
        int[] expected = {3, 7, 2, 1, 5, 4};
        assertArrayEquals(expected, actual);
    }
}
