package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class ReverseNumberAndPalindrome {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an integer:");
        int nums = keyboardInput.nextInt();

        boolean isPalindrome = isPalindrome(nums);

        System.out.println(isPalindrome);

    }
    public static int canReverseNumber(int number) {
        int reverseNumber = 0;
        int nums = 0;
        while (number > 0){
            nums = number % 10;
            number/= 10;

            reverseNumber = reverseNumber * 10 + nums;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int number) {
        int result = canReverseNumber(number);
        int remainderNum = 0;
        int total = 0;
        int temp = result;

        while (result > 0){
            remainderNum = result % 10;
            total = (total * 10 )+ remainderNum;
            result = result / 10;
        }
        if (temp == total) {
            return true;
        }
        else {
            return false;
        }

    }
}
