package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a palindrome number:  ");
        int number = keyboardInput.nextInt();

            if (number != 5) {
                System.out.println("Incomplete number");
                System.out.println("Enter a palindrome number:  ");
                number = keyboardInput.nextInt();

            }

              int reverseNumber = 0;
              int total = 0;
              int temp = number;

              while (number > 0) {
                  reverseNumber = number % 10;
                  total = (total * 10) + reverseNumber;
                  number = number / 10;
              }

              if (temp == total) {
                  System.out.println("It is a palindrome number");
              } else {
                  System.out.println("It is not a palindrome number");
              }



        }
}
