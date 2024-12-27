package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitTest {

    @Test
    public void testThatNumbersPassedCanBeSummedTogetherTest(){
        long number = 234;
        int result = SumDigit.sumDigits(number);
        assertEquals(9, result);
    }
}
