package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class Comparator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the first number:  ");
        int firstNumber = keyboardInput.nextInt();

        System.out.println("Enter the second number:  ");
        int secondNumber = keyboardInput.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(0);
        }
        if (firstNumber > secondNumber) {
            System.out.println(1);
        }
        if (secondNumber > firstNumber) {
            System.out.println(-1);
        }
    }
}
