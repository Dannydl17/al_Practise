package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class ExamQuiz {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int examResult = keyboardInput.nextInt();

            if (examResult == 1) {
                passes = passes + 1;
            }else {
                failures = failures + 1;
            }

            studentCounter = studentCounter + 1;
        }

        System.out.println("The number of student that passed are : " + passes);
        System.out.println("The number of student that failed are : " + failures);

//        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
