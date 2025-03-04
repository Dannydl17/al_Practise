package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testThatANumberCanBeReverseStartingFromTheFirstNumberEnteredTest(){
        int[] numb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = ReverseNumber.canReverseNumberGotten(numb);
        assertEquals(10, expected[0]);
        assertEquals(9, expected[1]);
        assertEquals(8, expected[2]);
        assertEquals(7, expected[3]);
        assertEquals(6, expected[4]);
        assertEquals(5, expected[5]);
        assertEquals(4, expected[6]);
        assertEquals(3, expected[7]);
        assertEquals(2, expected[8]);
        assertEquals(1, expected[9]);
        assertEquals(10, expected.length);
    }
}
