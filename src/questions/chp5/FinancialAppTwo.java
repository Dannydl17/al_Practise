package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class FinancialAppTwo {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        double monthlyInterestRate;
        double interest = 0.0;
        double principal = 0.0;
        double balance = 0.0;
        int nums = 1;

        System.out.println("Enter the loan amount: ");
        int loanAmount = keyboardInput.nextInt();

        System.out.println("Enter the number of years: ");
        int numberOfYears = keyboardInput.nextInt();

        System.out.println("Enter the annual Interest Rate: ");
        int annualInterestRate = keyboardInput.nextInt();

        monthlyInterestRate = (double) annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/ (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.printf("%s%.2f%n", "Monthly Payment: ", monthlyPayment);
        System.out.printf("%s%.2f%n", "Total Payment: ", totalPayment);

        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s   %5s    %4s       %4s%n", "Payment#", "Interest", "Principal", "Balance");
        }

//        for (int count = 1; count < 5; count++) {
//            while (nums > 2 && nums < 11){
//                if (nums == 10) {
//                    System.out.println("...");
//                }
//                nums ++;
//            }
//
//
//            if (count == 1) {
//                interest = loanAmount * monthlyInterestRate;
//                principal = monthlyPayment - interest;
//                balance = loanAmount - principal;
//            }
//
//
//            System.out.printf("%d           %.2f        %.2f        %.2f%n", nums, interest, principal, balance);
//            nums++;
//            interest = monthlyInterestRate - interest;
//        }

    }
}
