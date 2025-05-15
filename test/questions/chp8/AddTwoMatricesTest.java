package questions.chp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoMatricesTest {
    @Test
    public void testThatTwoNumberCanBeAddedTogetherTest(){
        double[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] b = {
            {0, 2, 4},
            {1, 4.5, 2.2},
            {1.1, 4.3, 5.2}
        };
        double[][] nums = AddTwoMatrices.addMatrix(a, b);
        assertEquals(1.0, nums[0][0]);
        assertEquals(4.0, nums[0][1]);
        assertEquals(7.0, nums[0][2]);

        assertEquals(5.0, nums[1][0]);
        assertEquals(9.5, nums[1][1]);
        assertEquals(8.2, nums[1][2]);

        assertEquals(8.1, nums[2][0]);
        assertEquals(12.3, nums[2][1]);
        assertEquals(14.2, nums[2][2]);

        assertEquals(3, nums.length);

    }
}
