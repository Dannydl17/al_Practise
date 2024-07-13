package questions.chp4;

import java.util.Scanner;

public class ClassQuiz1 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;

        System.out.println("Enter grade or -1 to quit: ");
        int gradeNumber = keyboardInput.nextInt();

        while (gradeNumber != -1) {
            total = total + gradeNumber;
            gradeCounter = gradeCounter + 1;

            System.out.println("Enter grade or -1 to quit: ");
            gradeNumber = keyboardInput.nextInt();

        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is: %.2f%n", average);
        } else {
            System.out.println("No grades were entered");
        }

    }
}
