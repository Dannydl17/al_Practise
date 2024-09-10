package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int remainderNumber = 0;
        int total = 0;
        int temp;

        System.out.println("Enter five digit palindrome number: ");
        int number = keyboardInput.nextInt();

        temp = number;
        String nums = String.valueOf(number);
        int count = 0;

        for (int counter = 1; counter <= nums.length(); counter++){
            count++;
        }

        while (count != 5){
            System.out.println("Incomplete number");
            System.out.println("Enter five digit palindrome number: ");
            number = keyboardInput.nextInt();

            temp = number;
            nums = String.valueOf(number);
            count = 0;
            for (int counter = 1; counter <= nums.length(); counter++) {
                count++;
            }
        }

        while (number > 0){
            remainderNumber = number % 10;
            total = (total * 10) + remainderNumber;
            number = number / 10;
        }

        if (temp == total) {
            System.out.println("It is a palindrome number");
        }
        else {
            System.out.println("It is not a palindrome number");
        }
    }
}
