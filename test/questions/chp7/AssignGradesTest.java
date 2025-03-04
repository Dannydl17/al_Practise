package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignGradesTest {
    @Test
    public void testThatStudentScoredCanBeCollectedTest(){
        int numberOfStudent = 4;
        int[] nums = {40, 55, 70, 58};
        int[] result = AssignGrades.canCollectStudentScore(nums, numberOfStudent);
        assertArrayEquals(nums, result);
    }

    @Test
    public void testThatStudentScoredCanGetTheBestScoreTest(){
        int[] nums = {40, 55, 70, 58};
        int result = AssignGrades.canCollectBestScore(nums);
        assertEquals(70, result);
    }

//    @Test
//    public void testThatStudentCanBeGradedAccordingToTheirScoreTest(){
//        int[] nums = {40, 55, 70, 58};
//        int[] numb = {10, 20, 30, 40};
//        char[] letter = {'A', 'B', 'B', 'C'};
//        char[] result = AssignGrades.canArrangeGradeToMatchScore(nums, numb, letter);
//        assertEquals('C', result[0]);
//        assertEquals('B', result[1]);
//        assertEquals('A', result[2]);
//        assertEquals('B', result[3]);
//        assertEquals(4, result.length);
//
//    }
}
