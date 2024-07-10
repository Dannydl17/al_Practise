package questions.chp2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter your weightInKilogram: ");
        double weightInKilogram = keyboardInput.nextDouble();

        System.out.println("Enter your heightInMeters: ");
        int heightInMeters = keyboardInput.nextInt();

        double weightCalculated = weightInKilogram * 0.45359237;
        double heightCalculated = heightInMeters * 0.0254;

        double totalNumber = heightCalculated * heightCalculated;
        double bmi = weightCalculated / totalNumber;

        System.out.printf("The BMI is: " + String.format("%.4f", bmi));
    }
}
