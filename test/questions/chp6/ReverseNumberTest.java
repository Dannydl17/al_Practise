package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testThatNumberCanBeReverseTest(){
        int number = 3456;
        int reverseN = ReverseNumber.canReverseNumber(number);
        assertEquals(6543, reverseN);
    }
}
