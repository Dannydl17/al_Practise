package questions.chp8;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayCodeFive {

    public static void main(String[] args) {
        int[][] nums = {
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 1}
        };

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

        int[]numberCount = new int[nums.length];

        int counter = 0;
        int storeNum = 0;
        int countNumb = 0;
        int num = colResult.get(counter);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == num) {
                     countNumb++;
                }
            }
            numberCount[storeNum] = countNumb;
            countNumb = 0;
            storeNum++;
        }

        int largestNumb = numberCount[0];
        int index = 0;
        for (int i = 1; i < numberCount.length; i++) {
            if (numberCount[i] > largestNumb) {
                largestNumb = numberCount[i];
                index = i;
            }
        }
        System.out.println("The largest row index: " + index);
        System.out.println("The largest column index: " + index);
    }
}
