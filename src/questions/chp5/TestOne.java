package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class TestOne {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner keyboardInput = new Scanner(in);

        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = keyboardInput.nextInt();

            sum+=data;
        }while (data != 0);
        System.out.println("The sum is " + sum);
    }
}
