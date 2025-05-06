package questions.chp8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumElementsColumnTest {

    @Test
    public void testThatSumElementsColumnCanAddColumnAndReturnTheResult(){
        double[][] m = {
                {1.5, 2, 3, 4},
                {5.5, 6, 7, 8},
                {9.5, 1, 3, 1}
        };
        int  n = m[0].length - 1;
        double result = SumElementsColumn.canSumColumnElementAndReturnTheResult(m, n);
        assertEquals(13.0, result);
    }
}
