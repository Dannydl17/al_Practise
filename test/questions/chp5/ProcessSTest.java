package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessSTest{

    @Test
    public void testThatProcessCanReturnOddPositionOfStings(){
        String word = "Beijing Chicago";
        String result = ProcessS.canReturnOddPositionOfString(word);
        assertEquals("BiigCiao", result);
    }
}
