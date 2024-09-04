package questions.chp5;

import org.junit.jupiter.api.Test;

public class PrimeFactorizationTest {

    @Test
    public void testThatPrimeFactorizationCanCalculateAndGetTheResultTest(){
        int number = 120;
        int result = PrimeFactorization.calculatePrimeFactorization(number);
    }
}
