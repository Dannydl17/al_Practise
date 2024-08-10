package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class PositiveNdNegativeNum {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int positiveNum = 0;
        int negativeNum = 0;


        double total = 0.0;
        double average = 0.0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int num = keyboardInput.nextInt();

        if (num > 0) {
            positiveNum = positiveNum + 1;
        }

        if (num < 0) {
            negativeNum = negativeNum + 1;
        }

        total += num;


        while (num != 0){
            System.out.println("Enter an integer, the input ends if it is 0: ");
            num = keyboardInput.nextInt();

            if (num > 0) {
                positiveNum = positiveNum + 1;
            }

            if (num < 0) {
              negativeNum = negativeNum + 1;
            }
            total += num;
        }
        System.out.println("Positive number is: " + positiveNum);
        System.out.println("Negative number is: " + negativeNum);
        System.out.println("The total is: " +total);
    }
}
