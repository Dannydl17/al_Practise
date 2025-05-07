package questions.chp8;

import java.util.Scanner;

import static java.lang.System.in;

public class SumMajorDiagonal {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        double[][] nums = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                double number = keyboardInput.nextDouble();
                nums[row][column] = number;
            }
        }

        double answer = canReturnTheSumOfMajorDiagonal(nums);

        System.out.println("Sum of the elements in the major diagonal is " + answer);
    }
    public static double canReturnTheSumOfMajorDiagonal(double[][] m) {
        int innerColumn = m[0].length;
        double[] collectNumber = new double[innerColumn];

        int count = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (row == column) {
                    collectNumber[count] = m[row][column];
                    count++;
                }
                if (row != column) {
                    column++;
                    column--;
                }
            }
        }

        double result = doTheAddition(collectNumber);
        return result;
    }

    public static double doTheAddition(double[] number) {
        double r = 0.0;
        for (int i = 0; i < number.length; i++) {
            r += number[i];
        }
        return r;
    }
}
