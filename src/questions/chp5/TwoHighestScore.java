package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class TwoHighestScore {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = keyboardInput.nextInt();

        System.out.print("Enter student's name: ");
        String studentName = keyboardInput.next();

        System.out.print("Enter student's score: ");
        int studentScore = keyboardInput.nextInt();

        String firstName = studentName;
//        String secondName = studentName;
        int highestNumber = studentScore;
        int secondHighestNumber = 0;
        for (int count = 1; count < numberOfStudents; count++) {
            System.out.print("Enter student's name: ");
            studentName = keyboardInput.next();

            System.out.print("Enter student's score: ");
            studentScore = keyboardInput.nextInt();

            if (studentScore > highestNumber) {
                firstName = studentName;
                secondHighestNumber = highestNumber;
//                secondName = firstName;
                highestNumber = studentScore;
            }
            else if (studentScore > secondHighestNumber) {
//                secondName = studentName;
                secondHighestNumber = studentScore;
            }
        }
        System.out.println("Name of the students: " + firstName + " highestScore: "+ highestNumber);
//        System.out.println("Name of the students: " + secondName + " second highestScore: "+ secondHighestNumber);

    }
}