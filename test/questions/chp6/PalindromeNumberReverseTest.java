package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberReverseTest {

    @Test
    public void testThatNumberCanBeReverseTest(){
        int number = 456;
        int reverseN = ReverseNumberAndPalindrome.canReverseNumber(number);
        assertEquals(654, reverseN);
    }

    @Test
    public void testThatNumberCanBeAPalindromeNumberTest(){
        int number = 456;
        boolean isPalindrome = ReverseNumberAndPalindrome.isPalindrome(number);
        assertFalse(isPalindrome);
    }
}
