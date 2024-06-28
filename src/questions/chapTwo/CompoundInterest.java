package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the monthly saving amount: ");
        int amountCollected = keyboardInput.nextInt();

        double num = (double) 5 / 100;
        double num1 = num / 12;
        double amount = amountCollected * (1 + num1);
        double secondAmount = (amountCollected + amount) * (1 + num1);
        double thirdAmount = (amountCollected + secondAmount) * (1 + num1);
        double fourthAmount = (amountCollected + thirdAmount) * (1 + num1);
        double fifthAmount = (amountCollected + fourthAmount) * (1 + num1);
        double sixthAmount = (amountCollected + fifthAmount) * (1 + num1);

        System.out.println("After the sixth month, the account value is: " + String.format("%.2f", sixthAmount));


    }
}
