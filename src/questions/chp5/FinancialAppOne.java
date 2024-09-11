package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class FinancialAppOne {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        double nums = 5.00;
        double monthlyInterestRate;

        System.out.println("Enter the loan amount: ");
        int loanAmount = keyboardInput.nextInt();

        System.out.println("Enter the number of years: ");
        int numberOfYears = keyboardInput.nextInt();

        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s     %5s    %5s%n", "Interest Rate", "Monthly Payment","Total Payment");
        }

        for (int count = 1; count < 6; count++) {
            while (nums > 5.25 && nums < 7.875){
                if (nums == 7.25) {
                    System.out.println(" ...");
                }
                nums += (double) 1 / 8;
            }
            monthlyInterestRate = nums / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate/ (1
            - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%.3f%s              %.2f            %.2f%n",nums, '%', monthlyPayment, totalPayment);
            nums += (double) 1 / 8;

        }
    }
}
