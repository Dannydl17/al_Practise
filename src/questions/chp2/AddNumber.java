package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class AddNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the first integer: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = keyboardInput.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.printf("Sum is %d%n: ", sum);
    }
}
