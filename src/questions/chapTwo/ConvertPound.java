package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class ConvertPound {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a number in pounds:   ");
        double numberInPound = keyboardInput.nextDouble();

        double totalCalculation = numberInPound * 0.454;
        System.out.println(numberInPound + " pound is " + totalCalculation + " kilograms ");
    }
}
