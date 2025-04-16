package questions.chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class SortStudent {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the number of student: ");
        int numberOfStudent = keyboardInput.nextInt();

        int index = 0;
        String[] namesOfStudent = new String[numberOfStudent];

        System.out.println("Enter the  students’ names: ");
        String studentName = keyboardInput.next();
        namesOfStudent[index] = studentName;
        index++;

        while (index != numberOfStudent){
            System.out.println("Enter the  students’ names: ");
            studentName = keyboardInput.next();
            namesOfStudent[index] = studentName;
            index++;
        }

        System.out.println(Arrays.toString(namesOfStudent));
    }
    public static String[] canCollectStudentName(String[] studentsName) {
        String[]storeStudentName = new String[studentsName.length];

        int index = 0;

        for (int count = 0; count < studentsName.length; count++) {
              storeStudentName[index] = studentsName[count];
              index++;
        }
        return storeStudentName;
    }

    public static int[] canCollectStudentScore(int[] studentScore) {
        int[]storeStudentScore = new int[studentScore.length];

        int index = 0;

        for (int count = 0; count < studentScore.length; count++) {
            storeStudentScore[index] = studentScore[count];
            index++;
        }
        return storeStudentScore;
    }
}
