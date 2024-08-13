package questions.chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveNdNegativeNumTest {
    @Test
    public void testThatCanCountTheAmountOfPositiveNumTest(){
        PositiveNdNegativeNum.calculatePositiveNum(1);
        PositiveNdNegativeNum.calculatePositiveNum(2);
        PositiveNdNegativeNum.calculatePositiveNum(-1);
        int nums = PositiveNdNegativeNum.calculatePositiveNum(3);
        assertEquals(3,nums);
    }

    @Test
    public void testThatCanCountTheAmountOfNegativeNumTest(){
        PositiveNdNegativeNum.calculateNegativeNum(1);
        PositiveNdNegativeNum.calculateNegativeNum(2);
        PositiveNdNegativeNum.calculateNegativeNum(-1);
        int result = PositiveNdNegativeNum.calculateNegativeNum(3);
        assertEquals(1, result);
    }


}
