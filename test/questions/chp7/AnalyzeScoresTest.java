package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalyzeScoresTest {

    @Test
    public void testThatNumberAnalyzingCanKnowTheNumberOfScoresAboveTheAverage(){
        int averageNumber = 50;
        int[]num = new int[]{23, 45, 67, 78, 89, 66, 80, 90, 60};
        int number = AnalyzeScores.canKnowTheNumberOfScoresAboveTheAverage(averageNumber, num);
        assertEquals(7, number);
    }

    @Test
    public void testThatNumberAnalyzingCanKnowTheNumberOfScoresBelowTheAverage(){
        int averageNumber = 50;
        int[]num = new int[]{23, 45, 67, 78, 89, 66, 30, 10, 60};
        int number = AnalyzeScores.canKnowTheNumberOfScoresBelowTheAverage(averageNumber, num);
        assertEquals(4, number);
    }
}
