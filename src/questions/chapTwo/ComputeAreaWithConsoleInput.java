package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a number for radius:   ");
        double radius = keyboardInput.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }

}
