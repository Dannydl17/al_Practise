package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PentagonalNumberTest {

    @Test
    public void testThatPentagonalNumberCanBeCalculatedTest(){
        int number = 6;
        int num  = PentagonalNumber.getPentagonalNumber(number);
        assertEquals(51, num);
    }

    @Test
    public void testThatPentagonalNumberCanReturnAListOfPentagonalNumberTest(){
        int number = 100;
        int[] num  = PentagonalNumber.canReturnListOfPentagonalNumber(number);
        int[]expected ={1,5,12,22,35,51,70,92};
        assertArrayEquals(expected, num);
    }
}
