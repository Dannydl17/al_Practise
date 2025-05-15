package questions.chp8;

import java.util.Arrays;

public class PlayCodeTwo {
    public static void main(String[] args) {
        double[][] fArray = {
                {1, 2},
                {4, 5}
        };

        double[][] sArray = {
                {7, 8},
                {3, 5}
        };

        int num = fArray.length;
        System.out.println(num);
        double[][] numbers = new double[fArray.length][fArray.length];

        System.out.println(Arrays.deepToString(numbers));
        int count = 0;
        int counter = 0;
        int storeNumber = 0;

        double n = fArray[count][counter];
        double nun = sArray[count][counter];
        numbers[storeNumber][counter] = n + nun;
        counter++;

        n = fArray[count][counter];
        nun = sArray[count][counter];
        numbers[storeNumber][counter] = n + nun;
        counter++;

//        double ni = fArray[count][counter];
//        double nuns = sArray[count][counter];
//        numbers[storeNumber][counter] = ni + nuns;
//        counter++;

        System.out.println(Arrays.deepToString(numbers));
    }
}
