package questions.chp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest {
    @Test
    public void testThatAPyramidOfNumberCanBePrintTest(){
        int number = 7;
        int result = Pyramid.canPrintPyramid(number);
        assertEquals(7, result);
    }
}
