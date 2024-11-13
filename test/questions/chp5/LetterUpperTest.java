package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterUpperTest {

    @Test
    public void testThatLetterUpperCanCountUpperCaseLetterTest(){
        String words = "Welcome to Java";
        int count = LetterUpper.canCountUpperCaseLetter(words);
        assertEquals(2, count);
    }

    @Test
    public void testThatLetterUpperCanCountLowerCaseLetterTest(){
        String words = "Welcome to Java";
        int count = LetterUpper.canCountLowerCaseLetter(words);
        assertEquals(11, count);
    }
}
