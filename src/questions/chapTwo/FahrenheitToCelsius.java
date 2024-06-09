package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a degree in Fahrenheit:   ");
        double fahrenheit = keyboardInput.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
    }
}
