package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeVolume {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the radius and length of a cylinder:   ");
        double numberOfRadius = keyboardInput.nextDouble();
        int numberOfLength = keyboardInput.nextInt();

        double area = numberOfRadius * numberOfRadius * 3.14159;
        double volume = area * numberOfLength;

        System.out.println("The area is:  " + String.format("%.4f", area));
        System.out.println("The volume is: " + String.format("%.1f", volume));
    }
}
