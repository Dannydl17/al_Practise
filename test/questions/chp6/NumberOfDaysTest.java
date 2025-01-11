package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDaysTest {

    @Test
    public void testThatNumberOfDaysInAYearCanBeDisplayTest(){
        int numberOfYears = 2000;
        int result = 0;

        while (numberOfYears <= 2020){
            result = NumberOfDays.numberOfDaysInAYear(numberOfYears);
            numberOfYears++;
        }
        assertEquals(366, result);
    }
}
