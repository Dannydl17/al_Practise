package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusAndFahrenheitTest {

    @Test
    public void testThatCelsiusToFahrenheitCanBeCalculatedTest(){
        double nums = 40.0;
        double result = CelsiusAndFahrenheit.celsiusToFahrenheit(nums);
        assertEquals(104.0, result);
    }

    @Test
    public void testThatFahrenheitToCelsiusCanBeCalculatedTest(){
        double nums = 120.0;
        double result = CelsiusAndFahrenheit.fahrenheitToCelsius(nums);
        assertEquals(48.88888888888889, result);
    }
}
