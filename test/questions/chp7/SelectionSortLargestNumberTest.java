package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortLargestNumberTest {

    @Test
    public void testThatSelectionSortCanArrangeNumberFromTheLargestNumberTest(){
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        double[] actual = SelectionSortLargestNumber.canPerformSelectionSortFromLargestNumber(list);
        double[] expected = {9, 6.6, 5.7, 4.5, 1, -4.5};
        assertArrayEquals(expected, actual);
    }
}
