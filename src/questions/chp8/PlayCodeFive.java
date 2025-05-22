package questions.chp8;

import java.util.Arrays;

public class PlayCodeFive {

    public static void main(String[] args) {
        int[][] nums = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };


        int count = 0;
        int counter = 0;
        int[] result = new int[nums.length];
        int countRow = 0;
        for (int i = 0; i < nums.length; i++) {
            double largestNum = nums[i][countRow];
            double num = 0.0;
            for (int j = 1; j < nums[i].length; j++) {
                num = nums[i][j];
                if (num > largestNum) {
                    largestNum = num;
                    count++;
                }
            }
            if (largestNum == num) {
                count++;
                result[counter] = count;
                counter++;
                count = 0;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
