package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter an integer: ");
        int numbers = keyboardInput.nextInt();

        int largestNumber = numbers;
        int secondLargestNumber = 0;

        for (int counter = 1; counter < 10; counter++) {
            System.out.print("Enter an integer: ");
            numbers = keyboardInput.nextInt();

            if (numbers > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = numbers;
            } else if (numbers > secondLargestNumber) {
                secondLargestNumber = numbers;
            }
        }

        System.out.println("The Largest Number is: " + largestNumber);
        System.out.println("The Second Largest Number is: " + secondLargestNumber);
    }

}
