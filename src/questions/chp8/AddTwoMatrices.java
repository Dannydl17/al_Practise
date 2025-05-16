package questions.chp8;

import java.util.Arrays;

public class AddTwoMatrices {
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
