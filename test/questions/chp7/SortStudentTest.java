package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortStudentTest {

    @Test
    public void testThatNameOfStudentCanBeCollectedTest(){
        String[] nameOfStudent = {"Esther", "Danny"};
        String[] result = SortStudent.canCollectStudentName(nameOfStudent);
        String[] exp = {"Esther", "Danny"};
        assertArrayEquals(exp, result);
    }

    @Test
    public void testThatStudentScoreCanBeCollectedTest(){
        int[] studentScore = {50, 60};
        int[] result = SortStudent.canCollectStudentScore(studentScore);
        int[] exp = {50, 60};
        assertArrayEquals(exp, result);
    }
}
