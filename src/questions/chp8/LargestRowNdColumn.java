package questions.chp8;

import java.util.ArrayList;

public class LargestRowNdColumn {

    public static void main(String[] args) {
        int[][] nums = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };
        for (int rowIndex = 0; rowIndex < nums.length; rowIndex++) {
            for (int column = 0; column < nums[rowIndex].length; column++) {
                System.out.print(nums[rowIndex][column]);
            }
            System.out.println();
        }

        int largestIndex = canReturnTheHighestNumberOfCountWithMostlyOnes(nums);
        System.out.println("The largest row index: " + largestIndex);
        System.out.println("The largest column index: " + largestIndex);
    }
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
        int[] numb = canReturnTheLargestNumber(nums);

        int[]numberCount = new int[nums.length];

        int counter = 0;
        int storeNum = 0;
        int countNumb = 0;
        int num = numb[counter];

        for (int rowIndex = 0; rowIndex < nums.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < nums[rowIndex].length; columnIndex++) {
                if (nums[rowIndex][columnIndex] == num) {
                    countNumb++;
                }
            }
            numberCount[storeNum] = countNumb;
            countNumb = 0;
            storeNum++;
        }
        return numberCount;
    }

    public static int canReturnTheHighestNumberOfCountWithMostlyOnes(int[][] nums) {
        int[] result = canCountTheNumberOfMostlyOnes(nums);
        int largestNumb = result[0];
        int index = 0;
        for (int i = 1; i < result.length; i++) {
            if (result[i] > largestNumb) {
                largestNumb = result[i];
                index = i;
            }
        }
        return index;
    }
}
