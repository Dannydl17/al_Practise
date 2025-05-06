package questions.chp8;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class SumElementsColumn {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        double[][] nums = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                double number = keyboardInput.nextDouble();
                nums[row][column] = number;
            }
        }


        int numbs = nums[0].length;

        int count = 0;
        double[] numb = new double[numbs];
        for (int index = 0; index < numbs; index++) {
            numb[count] = canSumColumnElementAndReturnTheResult(nums, index);
            count++;
        }

        for (int row = 0; row < numb.length; row++) {
            System.out.println("Sum of the elements at column " + row + " is " + numb[row]);
        }
    }

    public static double canSumColumnElementAndReturnTheResult(double[][] m, int columnIndex) {
        int number = columnIndex;
        double[] colNumber = new double[m.length];
        int count = 0;
        for (int j = 0; j < m.length; j++) {
            for (int k = 0; k < m[j].length; k++) {
                if (number == k) {
                    colNumber[count] = m[j][k];
                    count++;
                }
                if (number != k) {
                    k++;
                    k--;
                }
            }
        }
        double result = doTheAddition(colNumber);
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
