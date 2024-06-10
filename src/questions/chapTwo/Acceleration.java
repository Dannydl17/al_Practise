package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class Acceleration {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a starting velocity:    ");
        double startingVelocity = keyboardInput.nextDouble();

        System.out.println("Enter an ending velocity:    ");
        double endingVelocity = keyboardInput.nextDouble();

        System.out.println("Enter time:   ");
        double time = keyboardInput.nextDouble();

        double averageAcceleration = (endingVelocity - startingVelocity) / time;

        System.out.println("The average acceleration is : " + String.format("%.4f", averageAcceleration));

    }
}
