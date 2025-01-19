package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfLettersOccurrenceTest {

    @Test
    public void testThatNumberOfLettersOccurrenceCanReturnTheNumberOfLetterTest(){
        String word = "Welcome";
        char letter = 'e';
        int result = NumberOfLettersOccurrence.canCountNumberOfOccurrence(word, letter);
        assertEquals(2, result);
    }
}
