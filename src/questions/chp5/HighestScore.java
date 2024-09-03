package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class HighestScore {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = keyboardInput.nextInt();

        System.out.print("Enter student's name: ");
        String studentName = keyboardInput.next();

        System.out.print("Enter student's score: ");
        int studentScore = keyboardInput.nextInt();

        String names = studentName;
        int highestNumber = studentScore;
        for (int count = 1; count < numberOfStudents; count++) {
            System.out.print("Enter student's name: ");
            studentName = keyboardInput.next();

            System.out.print("Enter student's score: ");
            studentScore = keyboardInput.nextInt();


            if (studentScore > highestNumber) {
                names = studentName;
                highestNumber = studentScore;

            }
        }
        System.out.println("The name of the student: " + names + " highestScore: "+ highestNumber);
    }
}
