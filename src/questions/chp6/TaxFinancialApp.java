package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class TaxFinancialApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int taxableIncome = 50000;

        System.out.print("(0-single, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "house) Enter the filing status: ");

        int status = keyboardInput.nextInt();



        printTable();
    }

    public static void printTable(){
        displayResult();
    }
    public static void displayResult(){
        System.out.println("""
                Taxable           Single           Married Joint           Married           Head of
                Income                             or Qualifying           Separate          a House
                                                   Widow(er)
                -------------------------------------------------------------------------------------------""");
    }
    public static double computeTax(int status, double taxableIncome){

        return taxableIncome;
    }
}
