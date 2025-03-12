package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestElementIndexTest {

    @Test
    public void testThatSmallestElementIndexInAnArrayCanBeReturnTest(){
        double[] nums = {2.5, 3.7, 2, 6, 3, 4, 5};
        int actual = SmallestElementIndex.canFindTheNumberAndReturnTheIndex(nums);
        assertEquals(2, actual);
    }
}
