package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterDisplayTest {

    @Test
    public void testThatCharacterCanBeDisplayTest(){
        char ch1 = 1;
        char ch2 = 'Z';
        int numberPerLine = 10;
        CharacterDisplay.printChars(ch1, ch2, numberPerLine);
        assertEquals();
    }
}
