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

        double[][] result = addMatrix(fNumbs, sNumbs);

        System.out.println("The matrices are added as follows");

        int index = 0;
        int columnIndex = 0;

        double zeroIndex = fNumbs[index][columnIndex];
        System.out.print(zeroIndex + "  ");
        columnIndex++;
        zeroIndex = fNumbs[index][columnIndex];
        System.out.print(zeroIndex + "  ");
        columnIndex++;
        zeroIndex = fNumbs[index][columnIndex];
        System.out.print(zeroIndex);

        System.out.print("          ");

        columnIndex = 0;

        double fIndex = sNumbs[index][columnIndex];
        System.out.print(fIndex + "  ");
        columnIndex++;
        fIndex = sNumbs[index][columnIndex];
        System.out.print(fIndex + "  ");
        columnIndex++;
        fIndex = sNumbs[index][columnIndex];
        System.out.print(fIndex);

        System.out.print("          ");

        columnIndex = 0;

        double sIndex = result[index][columnIndex];
        System.out.print(sIndex + "  ");
        columnIndex++;
        sIndex = result[index][columnIndex];
        System.out.print(sIndex + "  ");
        columnIndex++;
        sIndex = result[index][columnIndex];
        System.out.print(sIndex);
        System.out.println();

        index++;
        columnIndex = 0;
        int counter = 0;

        while (counter != 1){
            zeroIndex = fNumbs[index][columnIndex];
            System.out.print(zeroIndex + "  ");
            columnIndex++;
            zeroIndex = fNumbs[index][columnIndex];
            System.out.print(zeroIndex + "  ");
            columnIndex++;
            zeroIndex = fNumbs[index][columnIndex];
            System.out.print(zeroIndex);

            System.out.print("  ");

            System.out.print("  + ");

            System.out.print("    ");

            columnIndex = 0;

            fIndex = sNumbs[index][columnIndex];
            System.out.print(fIndex + "  ");
            columnIndex++;
            fIndex = sNumbs[index][columnIndex];
            System.out.print(fIndex + "  ");
            columnIndex++;
            fIndex = sNumbs[index][columnIndex];
            System.out.print(fIndex);

            System.out.print("  ");

            System.out.print("  = ");

            System.out.print("    ");

            columnIndex = 0;

            sIndex = result[index][columnIndex];
            System.out.print(sIndex + "  ");
            columnIndex++;
            sIndex = result[index][columnIndex];
            System.out.print(sIndex + "  ");
            columnIndex++;
            sIndex = result[index][columnIndex];
            System.out.print(sIndex);
            System.out.println();

            counter++;
        }

        index++;
        columnIndex = 0;
        counter = 0;

        while (counter != 1){
            zeroIndex = fNumbs[index][columnIndex];
            System.out.print(zeroIndex + "  ");
            columnIndex++;

            zeroIndex = fNumbs[index][columnIndex];
            System.out.print(zeroIndex + "  ");
            columnIndex++;
            zeroIndex = fNumbs[index][columnIndex];
            System.out.print(zeroIndex);

            System.out.print("          ");

            columnIndex = 0;

            fIndex = sNumbs[index][columnIndex];
            System.out.print(fIndex + "  ");
            columnIndex++;
            fIndex = sNumbs[index][columnIndex];
            System.out.print(fIndex + "  ");
            columnIndex++;
            fIndex = sNumbs[index][columnIndex];
            System.out.print(fIndex);

            System.out.print("          ");

            columnIndex = 0;

            sIndex = result[index][columnIndex];
            System.out.print(sIndex + "  ");
            columnIndex++;
            sIndex = result[index][columnIndex];
            System.out.print(sIndex + "  ");
            columnIndex++;
            sIndex = result[index][columnIndex];
            System.out.print(sIndex);

            counter++;
        }

    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] numbers = new double[a.length][b.length];

        int num = a.length;

        int count = 0;
        int counter = 0;
        int storeNumber = 0;
        int nums = 0;

        double fNumb = a[count][counter];
        double sNumb = b[count][counter];
        numbers[storeNumber][counter] = fNumb + sNumb;
        counter++;

        fNumb = a[count][counter];
        sNumb = b[count][counter];
        numbers[storeNumber][counter] = fNumb + sNumb;
        counter++;

        fNumb = a[count][counter];
        sNumb = b[count][counter];
        numbers[storeNumber][counter] = fNumb + sNumb;

        count++;
        storeNumber++;
        nums++;
        nums = 0;
        counter = 0;

        while (nums != (a.length - 1) * b.length){
            fNumb = a[count][counter];
            sNumb = b[count][counter];
            numbers[storeNumber][counter] = fNumb + sNumb;
            counter++;
            nums++;
            if (nums == num) {
                storeNumber++;
                count++;
                counter = 0;
            }
        }

        return numbers;
    }
}
