package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class TwoPoint {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter x1 and y1: ");
        double x1 = keyboardInput.nextDouble();
        double y1 = keyboardInput.nextDouble();

        System.out.println("Enter x2 and y2: ");
        int x2 = keyboardInput.nextInt();
        int y2 = keyboardInput.nextInt();

        double result = Math.sqrt(Math.pow((double) x2 - x1, 2) + Math.pow((double) y2 - y1, 2));
        System.out.println("The distance between the two points is: " + result);
    }
}
