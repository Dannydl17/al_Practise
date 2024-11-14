package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountConsonantNdVowelTest {

    @Test
    public void testThatVowelsCanBeCountedTest(){
        String words = "Programming is fun";
        int count = CountConsonantNdVowel.canCountNumberOfVowels(words);
        assertEquals(5, count);
    }

    @Test
    public void testThatConsonantCanBeCountedTest(){
        String words = "Programming is fun";
        int count = CountConsonantNdVowel.canCountNumberOfConsonant(words);
        assertEquals(11, count);
    }
}
