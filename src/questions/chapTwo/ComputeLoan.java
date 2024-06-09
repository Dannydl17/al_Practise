package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter annual interest rate:  ");
        double annualInterestRate = keyboardInput.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter the number of years as an integer:  ");
        int numberOfYear = keyboardInput.nextInt();

        System.out.println("Enter loan amount:  ");
        double loanAmount = keyboardInput.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate,  numberOfYear * 12));

        double totalPayment = monthlyPayment * numberOfYear * 12;

        System.out.println("The monthly payment is $" +
                (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" +
                (int)(totalPayment * 100) / 100.0);
    }
}
