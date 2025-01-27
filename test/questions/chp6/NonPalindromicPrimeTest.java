package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonPalindromicPrimeTest {

    @Test
    public void testThatNonPalindromicPrimeCanCheckForANonPalindromicNumberTest(){
        int number = 389;
        int result = NonPalindromicPrime.nonPalindromeNumber(number);
        assertEquals(389, result);
    }
}
