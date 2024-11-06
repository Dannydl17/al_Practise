package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class FinancialAppS {
    public static void main(String[] args) {
        double result = 0.0;
        double resultO = 0.0;
        double nums = 0.0;
        double numbers = 0.0;
        double numberC = 0.0;
        double numberR = 0.0;
        int saveNOM = 0;
        int num = 1;
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an amount:  ");
        int amountCollected = keyboardInput.nextInt();

        System.out.println("Enter annual interest rate:  ");
        int annualCollected = keyboardInput.nextInt();

        System.out.println("Enter number of months:  ");
        int numberOfMonth = keyboardInput.nextInt();

        result = (double) annualCollected / 100;

        resultO = result / 12;

        saveNOM = numberOfMonth;

        nums = (double) Math.round(resultO * 100000) / 100000;


        numberC = amountCollected * (1 + nums);


        while (num <= saveNOM) {
            if (num != saveNOM) {
                numbers = (amountCollected + numbers) * (1 + nums);
                numberR =  (double) Math.round(numbers * 1000) / 1000;
            }

            if (num == saveNOM){
                numbers = (amountCollected + numberR) * (1 + nums);
                numberR =  (double) Math.round(numbers * 1000) / 1000;
                System.out.println("The amount of savings after the given month is " + numberR);
            }
            num++;

        }


    }
}
