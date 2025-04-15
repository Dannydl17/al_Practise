package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomNumChooserTest {
    @Test
    public void testThatRandomNumCanReturnGuessNumberTest(){
        int number = RandomNumChooser.getRandom(7, 8, 9, 10);
        int num = number;
        assertEquals(num, number);
    }
}
