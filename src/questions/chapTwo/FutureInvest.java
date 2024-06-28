package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class FutureInvest {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = keyboardInput.nextDouble();

        System.out.println("Enter annual interest rate in percentage:  ");
        double annualInterestRate = keyboardInput.nextDouble();

        System.out.println("Enter number of years:  ");
        int numberOfYear = keyboardInput.nextInt();

       double monthlyInterestRate = annualInterestRate / 12 / 100;
       double futureInvestment = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYear * 12);
        System.out.printf("Accumulated value is %.2f\n", futureInvestment);
    }
}
