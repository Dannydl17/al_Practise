package questions.chp8;

import java.util.Arrays;

public class PlayCodeTwo {
    public static void main(String[] args) {
        double[][] fArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] sArray = {
                {0, 2, 4},
                {1, 4.5, 2.2},
                {1.1, 4.3, 5.2}
        };

        int num = fArray.length;
        double[][] numbers = new double[fArray.length][fArray.length];

        System.out.println(Arrays.deepToString(numbers));
        int count = 0;
        int counter = 0;
        int storeNumber = 0;
        int nums = 0;

        double n = fArray[count][counter];
        double nun = sArray[count][counter];
        numbers[storeNumber][counter] = n + nun;
        counter++;

        n = fArray[count][counter];
        nun = sArray[count][counter];
        numbers[storeNumber][counter] = n + nun;
        counter++;

        n = fArray[count][counter];
        nun = sArray[count][counter];
        numbers[storeNumber][counter] = n + nun;

        count++;
        storeNumber++;
        nums++;
        nums = 0;
        counter = 0;

        while (nums != (fArray.length - 1) * sArray.length){
            n = fArray[count][counter];
            nun = sArray[count][counter];
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
    }
}
