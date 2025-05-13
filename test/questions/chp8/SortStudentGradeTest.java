package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortStudentGradeTest {
    @Test
    public void testThatGradeCanReturnTheAnswerOfTheStudentTest(){
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] result = SortStudentGrade.canReturnTheAnswerToQuestion(answers, keys);
        assertEquals(7, result[0]);
        assertEquals(6, result[1]);
        assertEquals(5, result[2]);
        assertEquals(4, result[3]);
        assertEquals(8, result[4]);
        assertEquals(5, result.length);
    }

    @Test
    public void testThatGradeCanReturnNumberOfStudentTest(){
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        int[] result = SortStudentGrade.canReturnTheNumberOfStudent(answers);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
        assertEquals(4, result[4]);
        assertEquals(5, result.length);
    }

    @Test
    public void testThatGradeCanReturnASortedAnswersTest(){
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] result = SortStudentGrade.canReturnTheAnswerToQuestion(answers, keys);
        assertEquals(7, result[0]);
        assertEquals(6, result[1]);
        assertEquals(5, result[2]);
        assertEquals(4, result[3]);
        assertEquals(8, result[4]);
        assertEquals(5, result.length);

        int[] newResult = SortStudentGrade.canSortStudentAnswer(result);
        assertEquals(4, newResult[0]);
        assertEquals(5, newResult[1]);
        assertEquals(6, newResult[2]);
        assertEquals(7, newResult[3]);
        assertEquals(8, newResult[4]);
        assertEquals(5, newResult.length);

    }

    @Test
    public void testThatGradeCanArrangeStudentPositionInIncreasingOrderOfTheirCorrectAnswerTest(){
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] results = SortStudentGrade.canReturnTheAnswerToQuestion(answers, keys);
        assertEquals(7, results[0]);
        assertEquals(6, results[1]);
        assertEquals(5, results[2]);
        assertEquals(4, results[3]);
        assertEquals(8, results[4]);
        assertEquals(5, results.length);

        int[] changeOfPositionFromGrade = SortStudentGrade.canReturnNewStudentPositionFromGradeInIncreasingOrder(results);
        assertEquals(3, changeOfPositionFromGrade[0]);
        assertEquals(2, changeOfPositionFromGrade[1]);
        assertEquals(1, changeOfPositionFromGrade[2]);
        assertEquals(0, changeOfPositionFromGrade[3]);
        assertEquals(4, changeOfPositionFromGrade[4]);
        assertEquals(5, changeOfPositionFromGrade.length);
    }

}
