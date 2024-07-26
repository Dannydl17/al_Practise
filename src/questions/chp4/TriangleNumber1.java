package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class TriangleNumber1 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the number of lines: ");
        int numbers = keyboardInput.nextInt();

        for (int count = 0; count < numbers; count++) {
            for (int counter = 1; counter <= numbers - count; counter++) {
                System.out.print(" " + counter);
            }
            System.out.println();
        }


    }
}
