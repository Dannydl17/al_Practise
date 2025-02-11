package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummingElementArrayTest {

    @Test
    public void testThatAnArrayCanBeSummedAndReturnTheSummedValueTest(){
        int[] nums = {7, 8, 9, 10, 11, 12, 13};
        int expected = SummingElementArray.canAddAnArrayElement(nums);
        assertEquals(70, expected);
    }
}
