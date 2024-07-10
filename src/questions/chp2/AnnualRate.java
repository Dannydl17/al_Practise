package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class AnnualRate {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        int amountCollected = keyboardInput.nextInt();
        double annualR = keyboardInput.nextDouble();


        double interest = amountCollected * (annualR / 1200);
        System.out.println("The interest is: " + interest);

    }
}
