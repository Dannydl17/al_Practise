package questions.chp5;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter an integer number:   ");
        int nums = keyboardInput.nextInt();

        calculatePrimeFactorization(nums);

    }
    public static void calculatePrimeFactorization(int nums) {
        int divisor = 2;
        int count = 1;
        while (nums != 1){
            if (nums % divisor == 0) {
                if (nums != count) {
                    System.out.printf(" %1d ", divisor);
                }
                nums = nums / divisor;
                divisor = 2;
            }
            else {
                divisor++;
            }
        }
    }

    public static int[] calculatePrimeFactorizationOne(int nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int divisor = 2;
        int count = 1;
        while (nums != 1){
            if (nums % divisor == 0) {
                result.add(divisor);
                nums = nums / divisor;
                divisor = 2;
            }
            else {
                divisor++;
            }
        }
        return convertToArray(result);
    }

    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] results = new int[result.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = result.get(index);
        }
        return results;
    }
}


