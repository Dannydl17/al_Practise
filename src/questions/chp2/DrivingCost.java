package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the driving distance:  ");
        double distance = keyboardInput.nextDouble();

        System.out.println("Enter miles per gallon:   ");
        double milesPerGallon = keyboardInput.nextDouble();

        System.out.println("Enter price per gallon:   ");
        double pricePerGallon = keyboardInput.nextDouble();

        double totalCost = (distance / milesPerGallon) * pricePerGallon;


        System.out.println("The cost of the trip is: $" + String.format("%.2f", totalCost));
    }
}
