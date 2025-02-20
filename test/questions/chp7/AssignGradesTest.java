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
}
