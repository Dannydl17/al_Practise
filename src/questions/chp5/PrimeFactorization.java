package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter an integer number:   ");
        int nums = keyboardInput.nextInt();


    }
    public static int calculatePrimeFactorization(int nums) {
        int divisor = 2;

        while (nums != 1){
            if (nums % divisor == 0) {
                nums = nums / divisor;
                divisor = 2;
            }
            else {
                divisor++;
            }
        }
        return divisor;
    }
}
