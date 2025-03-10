package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestElementTest {

    @Test
    public void testThatSmallestElementsCanBeFoundTest(){
        double[] nums = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};
        double expected = SmallestElement.canFindSmallestElements(nums);
        assertEquals(1.5, expected);
    }
}
