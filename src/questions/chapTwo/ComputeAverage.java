package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter one numbers:   ");
        double number1 = keyboardInput.nextDouble();
        System.out.println("Enter two numbers:   ");
        double number2 = keyboardInput.nextDouble();
        System.out.println("Enter three numbers:   ");
        double number3 = keyboardInput.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
