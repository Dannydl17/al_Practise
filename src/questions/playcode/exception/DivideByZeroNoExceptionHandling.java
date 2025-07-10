package questions.playcode.exception;

import java.util.Scanner;

import static java.lang.System.in;

public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator){
       return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = keyboardInput.nextInt();

        System.out.print("Please enter an integer numerator: ");
        int denominator = keyboardInput.nextInt();

       int result = quotient(numerator, denominator);

        System.out.printf(
                "%nResult: %d / %d = %d%n", numerator, denominator, result);


    }
}
