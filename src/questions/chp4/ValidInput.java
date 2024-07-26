package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class ValidInput {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = keyboardInput.nextInt();

            if (result == 1) {
                passes = passes + 1;
                studentCounter = studentCounter + 1;
            } else if (result == 2) {
                failures = failures + 1;
                studentCounter = studentCounter + 1;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );
    }
}
