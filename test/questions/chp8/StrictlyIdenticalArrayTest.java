package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrictlyIdenticalArrayTest {

    @Test
    public void testThatResponseTrueCanBeReturnIfTheArrayAreIdenticalTest(){
        int[][] m1 = {
                {51, 22, 25},
                {6, 1, 4},
                {24, 54, 6}
        };

        int[][] m2 = {
                {51, 22, 25},
                {6, 1, 4},
                {24, 54, 6}
        };

        boolean result = StrictlyIdenticalArray.canReturnEqualsElements(m1, m2);
        assertTrue(result);
    }

    @Test
    public void testThatResponseFalseCanBeReturnIfTheArrayAreNotIdenticalTest(){
        int[][] m1 = {
                {51, 25, 22},
                {6, 1, 4},
                {24, 54, 6}
        };

        int[][] m2 = {
                {51, 22, 25},
                {6, 1, 4},
                {24, 54, 6}
        };

        boolean result = StrictlyIdenticalArray.canReturnEqualsElements(m1, m2);
        assertFalse(result);
    }
}
