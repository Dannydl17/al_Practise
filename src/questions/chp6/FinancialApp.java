package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class FinancialApp {
    private static double result;
    public static void main(String[] args) {
        int noM = 0;
        double noM1 = 0.0;
        double noM2 = 0.0;
        Scanner keyboardInput = new Scanner(in);

        System.out.println("The amount invested:    ");
        int nums = keyboardInput.nextInt();

        System.out.println("Annual interest rate:   ");
        int annualInterestRate = keyboardInput.nextInt();

        noM = 1;

        displayResult();
        printNumber(nums, annualInterestRate, noM);

    }
    public static void displayResult(){
        System.out.println("Year           Future Value");
    }
    public static void printNumber(int nums, int annualInterestRate, int noM){
        for (int count = 1; count < 5; count++) {
            while (noM > 2 && noM < 29) {
                if (noM == 28) {
                    System.out.println(" ...");
                }
                noM+=1;
            }
            result = futureInvestmentValue(nums, annualInterestRate, noM);
            System.out.printf("%3d             %4.2f%n", noM, result);
            noM+=1;
        }
    }

    public static double futureInvestmentValue(double nums, int num, int number){
        double monthlyInterestRate =  (double) num / 12 / 100;
        double futureInvestment = nums * Math.pow(1 + monthlyInterestRate, number * 12);
        return futureInvestment;
    }
}
