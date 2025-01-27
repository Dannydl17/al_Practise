package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicPrimeTest {

    @Test
    public void testThatPalindromicPrimeCanCheckForAPalindromeTest(){
        int number = 101;
        int result = PalindromicPrime.palindromeNumber(number);
        assertEquals(101, result);
    }
}
