package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {

    @Test
    public void testThatCountLettersCanCountTheNumberOfLettersTest(){
        String words = "DannyBoy123";
        int result = CountLetters.countLetters(words);
        assertEquals(8, result);
    }
}
