package questions.chp8;

import java.util.Scanner;

import static java.lang.System.in;

public class ProcessingTwoDimen {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        int[][] matrix = new int[10][10];

        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = keyboardInput.nextInt();
            }
        }
    }
}
