package questions.chp8;

import java.util.Arrays;

public class RaggedArrays {
    public static void main(String[] args) {
        int [][] triangleArray = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5},
                {3, 4, 5},
                {4, 5},
                {5},
        };
        int  n = triangleArray[4].length;
        System.out.println(n);

        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);
    }
}
