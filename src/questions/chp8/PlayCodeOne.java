package questions.chp8;

import java.util.Arrays;

public class PlayCodeOne {
    public static void main(String[] args) {
        double[][] n = {
                {1.5, 2, 3, 4},
                {5.5, 6, 7, 8}
        };

        int nums = n[0].length;

        int count = 0;
        double[] numb = new double[nums];
        for (int i = 0; i < nums; i++) {
            numb[count] = doThisNow(n, i);
            count++;
        }
    }

    public static double doThisNow(double[][] n, int i) {
        double[] nus = new double[n.length];
        System.out.println(Arrays.toString(nus));
        int count = 0;
        for (int j = 0; j < n.length; j++) {
            for (int k = 0; k < n[j].length; k++) {

                if (i == k) {
                    nus[count] = n[j][k];
                    count++;
                    System.out.println(Arrays.toString(nus));
                }
                if (i != k) {
                    k++;
                    k--;
                }
            }
        }
        double r = doTheAddition(nus);
        return r;
    }

    public static double doTheAddition(double[] nus) {
        double r = 0.0;
        for (int i = 0; i < nus.length - 1; i++) {
             r = nus[i] + nus[i + 1];
        }
        return r;
    }
}
