package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class MonetaryAmount {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an amount:   ");
        double monetaryAmount = keyboardInput.nextDouble();

        int remainingAmount = (int)(monetaryAmount * 100);


        int numberOfOneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;


        int numberOfOneDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfOneNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + monetaryAmount + " consists of");
        System.out.println(" " + numberOfOneDollar + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfOneDimes + " dimes");
        System.out.println(" " + numberOfOneNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
