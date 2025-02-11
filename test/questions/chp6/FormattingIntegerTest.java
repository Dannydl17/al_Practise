package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormattingIntegerTest {

    @Test
    public void testThatAStringOfNumberCanBeReturnAFormattingTheIntegerTest(){
        int number = 34;
        int num = 4;
        String numb = FormattingInteger.canFormatInteger(number, num);
        assertEquals("0034", numb);
    }
}
