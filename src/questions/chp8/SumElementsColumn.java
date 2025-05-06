package questions.chp8;

import java.util.Scanner;

import static java.lang.System.in;

public class SumElementsColumn {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a 3-by-4 matrix row by row");
        double number = keyboardInput.nextInt();

    }

    public static double canSumElementAReturnTheResult(double[][] m, int columnIndex) {
        int number = columnIndex - 1;
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
