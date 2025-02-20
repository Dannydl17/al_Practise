package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class AssignGrades {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the number of students:  ");
        int numberOfStudents = keyboardInput.nextInt();
        canCollectNumberOfStudent(numberOfStudents);

        System.out.print("Enter " + numberOfStudents + " scores:  ");
        int firstNumber = keyboardInput.nextInt();
        int secondNumber = keyboardInput.nextInt();
        int thirdNumber = keyboardInput.nextInt();
        int fourthNumber = keyboardInput.nextInt();


        for (int count = 0; count < numberOfStudents; count++) {
            System.out.printf("Student %d\n", count);
        }
        System.out.print(" score is \t");


    }

    public static void canCollectNumberOfStudent(int numberOfStudent) {
        int num = numberOfStudent;
        collectNumberOfStudent(num);
    }

    private static int collectNumberOfStudent(int nums){
        return nums;
    }

    public static int[] canCollectStudentScore(int[] nums, int numberOfStudent) {
        int number = collectNumberOfStudent(numberOfStudent);
        int[] num = new int[number];

        for (int count = 0; count < nums.length; count++) {
              num[count] = nums[count];
        }
        return num;
    }
}
