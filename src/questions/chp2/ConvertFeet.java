package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class ConvertFeet {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a value for feet:  ");
        double numberInFeet = keyboardInput.nextDouble();

        double totalCalculation = numberInFeet * 0.305;
        System.out.println(numberInFeet + " feet is " + totalCalculation + " meter ");
    }
}
