package questions.chp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintCheckerBoardTest {
    @Test
    public void printCheckerBoardTest(){
       int numberRoll = 5;
       int numberColumn = 8;
       int result = CheckerBoard.canPrintCheckerBoard(numberRoll, numberColumn);
       assertEquals(8, result);
    }
}
