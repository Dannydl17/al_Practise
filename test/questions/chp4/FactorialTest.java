package questions.chp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testThatFactorialCanBeCalculatedTest(){
        int number = 5;
        int result = Factorial.canCalculateFactorial(number);
        assertEquals(120, result);
    }
}
