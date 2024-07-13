package question.chp4;

import org.junit.jupiter.api.Test;
import questions.chp4.PrintTriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintTriangleTest {
    @Test
    public void testThatATriangleCanBePrintedTest(){
        int number = 10;
        int result = PrintTriangle.canPrintTriangle(number);
        assertEquals(10, result);
    }
}
