package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an integer:   ");
        int nums = keyboardInput.nextInt();


        canReverseNumbers(nums);
    }
    public static void canReverseNumbers(int number) {
        int reverse = 0;
        int nums = 0;

        while (number > 0){
            reverse = number % 10;
            number /= 10;

            nums = nums * 10 + reverse;
        }
        System.out.println(nums);
    }

    public static int canReverseNumber(int number) {
        int reverse = 0;
        int nums = 0;

        while (number > 0){
            reverse = number % 10;
            number /= 10;

            nums = nums * 10 + reverse;
        }

        return nums;
    }
}
