package questions.chp8;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class LocateLargestNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int row = keyboardInput.nextInt();
        int column = keyboardInput.nextInt();

        double[][] number = new double[row][column];

        System.out.println("Enter the array: ");
        for (int rowIndex = 0; rowIndex < number.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < number[rowIndex].length; columnIndex++) {
                double numOne = keyboardInput.nextDouble();
                number[rowIndex][columnIndex] = numOne;
            }
        }

        int[] nums = locateLargest(number);

        int rowIndex = 0;
        int rowIndexOne = 1;

        System.out.println("The location of the largest element is at" +
                " (" + nums[rowIndex] + ", " + nums[rowIndexOne] + ")");
    }
    public static double[] canReturnAllTheLargestNumber(double[][] nums) {
        int count = 0;
        double[] colLargestNum = new double[nums.length];
        int countRow = 0;
        for (int rowIndex = 0; rowIndex < nums.length; rowIndex++) {
            double largestNum = nums[rowIndex][countRow];
            for (int columnIndex = 1; columnIndex < nums[rowIndex].length; columnIndex++) {
                double num = nums[rowIndex][columnIndex];
                if (num > largestNum) {
                    largestNum = nums[rowIndex][columnIndex];
                }
            }
            colLargestNum[count] = largestNum;
            count++;
        }
        return colLargestNum;
    }

    public static double canReturnLargestNumber(double[] allLargestNumber) {
        double largestNum = allLargestNumber[0];
        for (int rowIndex = 0; rowIndex < allLargestNumber.length; rowIndex++) {
            if (allLargestNumber[rowIndex] > largestNum){
                largestNum = allLargestNumber[rowIndex];
            }
        }
        return largestNum;
    }

    public static int[] locateLargest(double[][] nums) {
        double[] allLargestNumber = canReturnAllTheLargestNumber(nums);
        double largestNumber = canReturnLargestNumber(allLargestNumber);

        ArrayList<Integer> colResult = new ArrayList<>();
        int row = 0;
        int column = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                double numb = nums[i][j];
                if (numb == largestNumber){
                    row = i;
                    colResult.add(row);
                    column = j;
                    colResult.add(column);
                }
            }
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
}
