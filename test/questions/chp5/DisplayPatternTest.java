package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayPatternTest {

    @Test
    public void testThatAPatternCanBeDisplayTest(){
        DisplayPatterns displayPatterns = new DisplayPatterns();
        int number = displayPatterns.printingPatterns(6);
        assertEquals(6, number);
    }
}
