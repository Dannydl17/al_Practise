package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int taxRate = 15;
        int taxRate1 = 20;
        double result = 0.0;

        for (int number = 1; number <= 3;  number++) {
            System.out.println("Enter the name of the citizen: ");
            String nameOfCitizen = keyboardInput.nextLine();

            System.out.println("Enter your monthly earning: ");
            int monthlyEarning = keyboardInput.nextInt();


            if (monthlyEarning <= 30000) {
               double totalN = (double) taxRate / 100;
               result = monthlyEarning * totalN;
            } else if (monthlyEarning > 30000) {
                double totalNum = (double) taxRate1 / 100;
                result = monthlyEarning * totalNum;
            }
            System.out.println("Total tax for citizen " + nameOfCitizen + ": $" + result);
            keyboardInput.nextLine();
        }

    }
}
