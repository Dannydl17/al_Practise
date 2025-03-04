package questions.chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class AssignGrades {

    public static void main(String[] args) {
        int nums = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the number of students:  ");
        int numberOfStudents = keyboardInput.nextInt();
        nums = numberOfStudents;

        System.out.print("Enter " + nums + " scores:  ");
        int firstNumber = keyboardInput.nextInt();
        int secondNumber = keyboardInput.nextInt();
        int thirdNumber = keyboardInput.nextInt();
        int fourthNumber = keyboardInput.nextInt();

        int[] number = {firstNumber, secondNumber, thirdNumber, fourthNumber};

        canCollectStudentScore(number, nums);

        for (int count = 0; count < numberOfStudents; count++) {
            System.out.printf("Student %d ", count);
            System.out.print("score is ");
            System.out.println();
        }

    }

    public static int[] canCollectStudentScore(int[] nums, int numberOfStudent) {
        int[] num = new int[numberOfStudent];

        for (int count = 0; count < nums.length; count++) {
              num[count] = nums[count];
        }
        return num;
    }

    public static int canCollectBestScore(int[] nums) {
        int largestScore = nums[0];

        for (int count = 0; count < nums.length; count++) {
               if (nums[count] > largestScore){
                   largestScore = nums[count];
               }
        }
        return largestScore;
    }

//    public static char[] canArrangeGradeToMatchScore(int[] nums, int[] numb, char[] letter) {
//        char[] result = new char[letter.length];
//
//        for (int count = 0; count < nums.length; count++) {
//              int num = nums[count];
//        }
//
//    }
}
