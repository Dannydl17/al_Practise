package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testThanWordsCanReturnTheCommonPrefixTest(){
        String firstWord = "Welcome to C++";
        String secondWord = "Welcome to Programming";
        String expected = LongestCommonPrefix.canReturnCommonPrefix(firstWord, secondWord);
        assertEquals("Welcome to ", expected);
    }

    @Test
    public void testThanWordsCanReturnAnEmptyStringInCommonPrefixTest(){
        String firstWord = "Atlanta";
        String secondWord = "Macon";
        String expected = LongestCommonPrefix.canReturnEmptyStringInCommonPrefix(firstWord, secondWord);
        assertEquals(firstWord + " and " + secondWord + " have no common Prefix", expected);
    }
}
