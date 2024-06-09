package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a degree in Celsius:  ");
        double celsius = keyboardInput.nextDouble();

        double fahrenheit = ((double) 9 / 5) *  celsius + 32;
        int celsiusN = (int) celsius;

        System.out.println(celsiusN + " Celsius is " + fahrenheit + " fahrenheit");

    }
}
