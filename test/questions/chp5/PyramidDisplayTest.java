package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidDisplayTest {

    @Test
    public void testThatAPyramidCanBeDisplayTest(){
        PyramidDisplay pyramidDisplay = new PyramidDisplay();
        int number = pyramidDisplay.printingPyramid(4);
        assertEquals(4, number);
    }

}
