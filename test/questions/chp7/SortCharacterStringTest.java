package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortCharacterStringTest {

    @Test
    public void testThatAStringCanBeConvertedToACharArrayTest(){
        String word = "acb";
        char[] result = SortCharacterString.canReturnACharArray(word);
        char[] expected = {'a', 'c', 'b'};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testThatAStringCanBeConvertedToACharArrayAndAlsoBeSortedTest(){
        String word = "acb";
        char[] result = SortCharacterString.canReturnACharArray(word);
        char[] expected = {'a', 'c', 'b'};
        assertArrayEquals(expected, result);

        char[] newRes = SortCharacterString.canBeSorted(result);
        char[] newExp = {'a', 'b', 'c'};
        assertArrayEquals(newExp, newRes);

    }

    @Test
    public void testThatASortedStringCanBeReturnTest(){
        String word = "acb";
        String newString = SortCharacterString.sort(word);
        assertEquals("abc", newString);
    }
}
