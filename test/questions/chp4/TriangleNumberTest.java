package questions.chp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleNumberTest {

    @Test
    public void testThatATriangleOfNumbersCanBePrintedTest(){
        int number = 7;
        int result = TriangleNumber.canPrintTriangle(number);
        assertEquals(7, result);
    }
}
