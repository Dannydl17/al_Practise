package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class PositiveNdNegativeNum {
    private static int positiveNumber;
    private static int negativeNumber;

    static Scanner keyboardInput = new Scanner(in);
    public static void main(String[] args) {
        int count = 0;
        double total = 0.0;
        double average = 0.0;
        int positiveNumber = 0;
        int negativeNumber = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int num = keyboardInput.nextInt();

        while (num <= 0){
            if (num == 0) {
                System.out.println("No numbers are entered except " + num);
                break;
            }
        }
        if (num > 0) {
            positiveNumber =calculatePositiveNum(num);
        }
        if (num < 0) {
            negativeNumber =calculateNegativeNum(num);
        }
        total += num;
        count++;

        while (num != 0){
            System.out.println("Enter an integer, the input ends if it is 0: ");
            num = keyboardInput.nextInt();

            if (num > 0) {
                positiveNumber =calculatePositiveNum(num);
            }
            else {
                negativeNumber =calculateNegativeNum(num);
            }
            total += num;
            if (num != 0) {
                count++;
            }
        }

        if (total > 0) {
            average = total / count;
            System.out.println("The number of positives is: " + positiveNumber);
            System.out.println("The number of negatives is : " + negativeNumber);
            System.out.println("The total is: " + total);
            System.out.println("The average is: " + average);
        }

    }

    public static int calculatePositiveNum(int numbers) {
        if (numbers > 0) {
            positiveNumber = positiveNumber + 1;
        }
        return positiveNumber;
    }

    public static int calculateNegativeNum(int numbers) {
        if (numbers < 0) {
            negativeNumber = negativeNumber + 1;
        }
        return negativeNumber;
    }
}
