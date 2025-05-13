package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeWeeklyHourCalculationTest {

    @Test
    public void testThatTheWeeklyHoursOfEmployeesCanBeAddedTest(){
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

    @Test
    public void testThatTheWeeklyHoursOfEmployeesCanStartFromDecreasingOrderTest(){
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

        int[] sortNumber = EmployeeWeeklyHourCalculation.canSortNumberFromDecreasingOrder(addNumber);
        assertEquals(34, sortNumber[0]);
        assertEquals(31, sortNumber[1]);
        assertEquals(28, sortNumber[2]);
        assertEquals(20, sortNumber[3]);
        assertEquals(4, sortNumber.length);
    }

    @Test
    public void testThatTheWeeklyHoursOfEmployeesCanBeArrangeInDecreasingOrderOfTheirAddedCalculationTest(){
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

        int[] numbers = EmployeeWeeklyHourCalculation.canReturnNewWeeklyEmployeeHoursFromInDecreasingOrder(addNumber);
        assertEquals(0, numbers[0]);
        assertEquals(3, numbers[1]);
        assertEquals(1, numbers[2]);
        assertEquals(2, numbers[3]);
        assertEquals(4, numbers.length);
    }
}
