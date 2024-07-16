package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter an integer: ");
        int numbers = keyboardInput.nextInt();

        int largestNumber = numbers;


        for (int counter = 1; counter < 10; counter++) {
            System.out.print("Enter an integer: ");
            numbers = keyboardInput.nextInt();

            if (numbers > largestNumber) {
                largestNumber = numbers;
            }
        }

        System.out.println("The Largest Number is: " + largestNumber);
    }
}
