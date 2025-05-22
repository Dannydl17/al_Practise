package questions.chp8;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayCodeFour {
    public static void main(String[] args) {
        double[][] nums = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };

        int count = 0;
        double[] colLargestNum = new double[nums.length];
        int countRow = 0;
        for (int i = 0; i < nums.length; i++) {
            double largestNum = nums[i][countRow];
            for (int j = 1; j < nums[i].length; j++) {
                double num = nums[i][j];
                if (num > largestNum) {
                    largestNum = nums[i][j];
                }
            }
            colLargestNum[count] = largestNum;
            count++;
        }

        double largestNum = colLargestNum[0];
        for (int counter = 0; counter < colLargestNum.length; counter++) {
             if (colLargestNum[counter] > largestNum){
                 largestNum = colLargestNum[counter];
             }
        }

        ArrayList<Integer> colResult = new ArrayList<>();
        int row = 0;
        int column = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                double numb = nums[i][j];
                if (numb == largestNum){
                    row = i;
                    colResult.add(row);
                    column = j;
                    colResult.add(column);
                }
            }
        }
        int[] results = new int[colResult.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = colResult.get(index);
        }
        System.out.println(Arrays.toString(results));
    }
}

