package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Hexagon {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the side: ");
        double numberCollected = keyboardInput.nextDouble();

        double result = Math.sqrt(3);
        double resultOne = result * 3;
        double number = resultOne / 2;
        double totalAnswer = numberCollected * numberCollected;
        double total = number * totalAnswer;

        System.out.println("The area of the hexagon is:  " + total);
    }
}
