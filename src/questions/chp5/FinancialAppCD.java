package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class FinancialAppCD {
    public static void main(String[] args) {
        int count = 1;
        double amountC = 0.0;
        double saveDep = 0.0;
        double numsC = 0.0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the initial deposit amount: ");
        int amountDeposit = keyboardInput.nextInt();


        System.out.print("Enter annual percentage yield: ");
        double annualP = keyboardInput.nextDouble();


        System.out.print("Enter maturity period (number of months): ");
        int numberOfM = keyboardInput.nextInt();


        saveDep = amountDeposit;

        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("   %4s          %4s%n", "Month", "CD Value");
        }

        while (count <= numberOfM){
            while (count > 2 && count < 17){
                if (count == 16){
                    System.out.println("  ...");
                }
                amountC = saveDep + saveDep * annualP / 1200;
                numsC = (double) Math.round(amountC * 100) / 100;
                count+=1;
                saveDep = numsC;
            }


            amountC = saveDep + saveDep * annualP / 1200;
            numsC = (double) Math.round(amountC * 100) / 100 - 1;
            System.out.print(" ");
            System.out.printf("%4d             %.2f%n", count,numsC);
            count+=1;
            saveDep = numsC;

        }
    }
}
