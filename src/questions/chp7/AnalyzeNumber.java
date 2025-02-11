package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class AnalyzeNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the number of items:  ");
        int number = keyboardInput.nextInt();

        double[] nums = new double[number];
        double sum = 0;

        System.out.print("Enter the numbers:  ");
        for (int count = 0; count < number; count++) {
            nums[count] = keyboardInput.nextDouble();
            sum += nums[count];
        }

        double average = sum / number;
    }
}
