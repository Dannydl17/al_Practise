package questions.chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class EliminateDuplicates {

    public static void main(String[] args) {
        int number = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter ten numbers: ");
        int firstNum = keyboardInput.nextInt();
        int secondNum = keyboardInput.nextInt();
        int thirdNum = keyboardInput.nextInt();
        int fourthNum = keyboardInput.nextInt();
        int fifthNum = keyboardInput.nextInt();
        int sixthNum = keyboardInput.nextInt();
        int seventhNum = keyboardInput.nextInt();
        int eightNum = keyboardInput.nextInt();
        int ninthNum = keyboardInput.nextInt();
        int tenthNum = keyboardInput.nextInt();

        int[] nums = {firstNum, secondNum, thirdNum, fourthNum, fifthNum,
                      sixthNum, seventhNum, eightNum, ninthNum, tenthNum};

        int[] numb = canReplaceZeroWithDuplicateElement(nums);
        numb = canReturnNewElementOfArrayWithOutZero(numb);

        System.out.print("The distinct numbers are: ");
        for (int count = 0; count < numb.length; count++) {
             number = numb[count];
            System.out.print(number);
            System.out.print(" ");
        }

    }
    public static int[] canReplaceZeroWithDuplicateElement(int[] nums) {
        for (int count = 0; count < nums.length; count++) {
            for (int innerCount = count + 1; innerCount < nums.length; innerCount++) {
                if (nums[innerCount] == nums[count]) {
                    nums[innerCount] = 0;
                }
            }
        }

        return nums;
    }

    public static int[] canReturnNewElementOfArrayWithOutZero(int[] elements) {
        int countNum = 0;

        for (int count = 0; count < elements.length; count++) {
            if (elements[count] != 0) {
                countNum++;
            }
        }

        int[]numb = new int[countNum];
        int newIndex = 0;

        for (int counter = 0; counter < elements.length; counter++) {
            if (elements[counter] != 0) {
                numb[newIndex] = elements[counter];
                newIndex++;
            }
        }
        return numb;
    }
}
