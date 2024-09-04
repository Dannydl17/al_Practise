package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeFactorizationTest {

    @Test
    public void testThatPrimeFactorizationCanCalculateAndGetTheResultTest(){
        int number = 120;
        int[] result = PrimeFactorization.calculatePrimeFactorizationOne(number);
        assertArrayEquals(result, PrimeFactorization.calculatePrimeFactorizationOne(120));
    }
}
