package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    @Test
    public void testThatAStringCanBeReverseTest(){
        String word = "ABCD";
        String reverseWord = ReverseString.canReverseString(word);
        assertEquals("DCBA", reverseWord);
    }
}
