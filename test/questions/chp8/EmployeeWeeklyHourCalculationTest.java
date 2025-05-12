package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeWeeklyHourCalculationTest {

    @Test
    public void testThatTheWeeklyHourOfAnEmployeeCanBeAddedTest(){
        int[][]employee = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1}
        };
        int[] addNumber = EmployeeWeeklyHourCalculation.canAddedWeeklyEmployeeHours(employee);
        assertEquals(34, addNumber[0]);
        assertEquals(28, addNumber[1]);
        assertEquals(20, addNumber[2]);
        assertEquals(31, addNumber[3]);
        assertEquals(4, addNumber.length);

    }
}
