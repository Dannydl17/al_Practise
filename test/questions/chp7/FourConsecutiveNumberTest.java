package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourConsecutiveNumberTest {

    @Test
    public void testThatAnArrayHasFourConsecutiveNumberTest(){
        int[] num = {3, 4, 5, 5, 5, 5, 4, 5};
        int actual = FourConsecutiveNumber.isConsecutiveFour(num);
        assertEquals(4, actual);
    }
}
