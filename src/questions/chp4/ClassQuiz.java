package questions.chp4;

import java.util.Scanner;

public class ClassQuiz {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.println("Enter student grade: ");
            int gradeNumber = keyboardInput.nextInt();

            total = total + gradeNumber;
            gradeCounter = gradeCounter + 1;

        }

        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("The class average is %d", average);
    }
}
