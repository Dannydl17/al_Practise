package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumMajorDiagonalTest {

    @Test
    public void testThatNumbersOfMajorDiagonalCanBeSumTest(){
        double[][] m = {
                {1, 2, 3, 4.0},
                {5, 6.5, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        double result = SumMajorDiagonal.canReturnTheSumOfMajorDiagonal(m);
        assertEquals(34.5, result);

    }
}
