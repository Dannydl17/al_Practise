package questions.chp8;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        double[][] fNumbs = new double[3][3];
        double[][] sNumbs = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int row = 0; row < fNumbs.length; row++) {
            for (int column = 0; column < fNumbs[row].length; column++) {
                double numOne = keyboardInput.nextDouble();
                fNumbs[row][column] = numOne;
            }
        }

        System.out.print("Enter matrix2: ");
        for (int row = 0; row < sNumbs.length; row++) {
            for (int column = 0; column < sNumbs[row].length; column++) {
                double numTwo = keyboardInput.nextDouble();
                sNumbs[row][column] = numTwo;
            }
        }
        System.out.println("The matrices are added as follows");

    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] numbers = new double[a.length][b.length];

        int num = a.length;

        int count = 0;
        int counter = 0;
        int storeNumber = 0;
        int nums = 0;

        double n = a[count][counter];
        double nun = b[count][counter];
        numbers[storeNumber][counter] = n + nun;
        counter++;

        n = a[count][counter];
        nun = b[count][counter];
        numbers[storeNumber][counter] = n + nun;
        counter++;

        n = a[count][counter];
        nun = b[count][counter];
        numbers[storeNumber][counter] = n + nun;

        count++;
        storeNumber++;
        nums++;
        nums = 0;
        counter = 0;

        while (nums != (a.length - 1) * b.length){
            n = a[count][counter];
            nun = b[count][counter];
            numbers[storeNumber][counter] = n + nun;
            counter++;
            nums++;
            if (nums == num) {
                storeNumber++;
                count++;
                counter = 0;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        return numbers;
    }
}
