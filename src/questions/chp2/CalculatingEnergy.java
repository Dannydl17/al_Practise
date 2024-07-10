package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the amount of water in kilograms:  ");
        double waterInKilogram = keyboardInput.nextDouble();

        System.out.println("Enter the initial temperature:   ");
        double initialTemperature = keyboardInput.nextDouble();

        System.out.println("Enter the amount of water in kilograms:  ");
        double finalTemperature = keyboardInput.nextDouble();

        double measuredInJoules = waterInKilogram * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is: " + measuredInJoules);
    }
}
