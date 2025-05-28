package questions.chp8;

import java.util.ArrayList;

public class LargestRowNdColumn {
    public static int[] canReturnTheLargestNumber(int[][] nums) {
        int countRow = 0;
        int count = 0;
        ArrayList<Integer> colResult = new ArrayList<>();
        int largestNum = nums[countRow][countRow];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums[i].length; j++) {
                int num = nums[i][j];
                if (num > largestNum) {
                    largestNum = nums[i][j];
                }
            }
            if (count == nums.length - 1){
                colResult.add(largestNum);
            }
            count++;

        }

        return convertToArray(colResult);
    }

    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] results = new int[result.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = result.get(index);
        }
        return results;
    }

    public static int[] canCountTheNumberOfMostlyOnes(int[][] nums) {
        return new int[0];
    }
}
