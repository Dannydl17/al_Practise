package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a number for radius:   ");
        double radius = keyboardInput.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
