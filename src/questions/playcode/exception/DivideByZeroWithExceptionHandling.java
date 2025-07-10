package questions.playcode.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        boolean continueLoop = true;

        do{
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = keyboardInput.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = keyboardInput.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                keyboardInput.nextLine();
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            }
            catch (ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }
        }while (continueLoop);
    }
}
