package questions.chp6;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class TaxFinancialApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int taxableIncome = 50000;
        int count = 3;
        int i = 0;
        double singleResult = 0;
        double marriedResult = 0;
        double marriedsResult = 0;
        double headHResult = 0;

        System.out.print("(0-single, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "house) Enter the filing status: ");

        int status = keyboardInput.nextInt();

        printTable();

        while (taxableIncome <= 60000){
            while (taxableIncome > 50050 && taxableIncome < 59950){
                if (taxableIncome == 59050) {
                    System.out.println(" ...");
                }
                taxableIncome+=50;
            }
            System.out.printf("%d", taxableIncome);
            for (i = 0; i <= status; i++) {
                    if (i == 0) {
                        singleResult = Math.round(computeTax(i, taxableIncome));
                        System.out.printf("     %.0f      ", singleResult);
                    }

                    if (i == 1) {
                        marriedResult = Math.round(computeTax(i, taxableIncome));
                        System.out.printf("%4.0f            ",marriedResult);
                    }

                    if (i == 2) {
                        marriedsResult = Math.round(computeTax(i, taxableIncome));
                        System.out.printf("%4.0f         ", marriedsResult);
                    }

                    if (i == 3) {
                        headHResult = Math.round(computeTax(i, taxableIncome));
                        System.out.printf("%4.0f",headHResult);
                    }
                while (i == count){
                       i+=1;
                }
            }
            System.out.println();
            taxableIncome+=50;
        }
    }

    public static void printTable(){
        displayResult();
    }
    public static void displayResult(){
        System.out.println("""
                Taxable   Single   Married Joint    Married      Head of
                Income             or Qualifying    Separate     a House
                                   Widow(er)
                --------------------------------------------------------------------""");
    }
    public static double computeTax(int status, double taxableIncome){
        double tax = 0;

        if (status == 0) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            }
            else if (taxableIncome <= 82250) {
                tax =  8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            }
            else if (taxableIncome <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            }
            else if (taxableIncome <= 372950){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (taxableIncome - 171550) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }

        if (status == 1) {
            if (taxableIncome <= 16700) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 67900) {
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            }
            else if (taxableIncome <= 137050) {
                tax =  16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (taxableIncome - 67900) * 0.25;
            }
            else if (taxableIncome <= 208850) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
            }
            else if (taxableIncome <= 372950){
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                        (taxableIncome - 208850) * 0.33;
            }
            else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (67900 - 137050) * 0.25 + (208850 - 137050) * 0.28 +
                        (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }

        if (status == 2) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            }
            else if (taxableIncome <= 68525) {
                tax =  8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            }
            else if (taxableIncome <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
            }
            else if (taxableIncome <= 186475){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (taxableIncome - 104425) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (33950 - 68525) * 0.25 + (104425 - 68525) * 0.28 +
                        (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
            }
        }

        if (status == 3) {
            if (taxableIncome <= 11950) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 45500) {
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            }
            else if (taxableIncome <= 117450) {
                tax =  11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (taxableIncome - 45500) * 0.25;
            }
            else if (taxableIncome <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
            }
            else if (taxableIncome <= 372950){
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (208850 - 137050) * 0.28 +
                        (taxableIncome - 208850) * 0.33;
            }
            else {
                tax = 16700 * 0.10 + (45500 - 11950) * 0.15 +
                        (45500 - 117450) * 0.25 + (190200- 117450) * 0.28 +
                        (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }

        return tax;
    }
}
