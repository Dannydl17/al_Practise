package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class SumDigit {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a number between 0 and 1000:   ");
        int numberEntered = keyboardInput.nextInt();

        int firstNumber = numberEntered % 10;
        int numberRemain = numberEntered / 10;

        int secondNumber = numberRemain % 10;
        int numberRemainOne = numberRemain / 10;

        int thirdNumber = numberRemainOne % 10;
        int numberRemainTwo = numberRemainOne / 10;

        int totalNumber = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of the digit is:  "  + totalNumber);
    }
}
