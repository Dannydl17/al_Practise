package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class SmallestElement {

    public static void main(String[] args) {
        double smallestElement = 0.0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter ten numbers:  ");
        double firstNum = keyboardInput.nextDouble();
        double secondNum = keyboardInput.nextDouble();
        double thirdNum = keyboardInput.nextDouble();
        double fourthNum = keyboardInput.nextDouble();
        double fifthNum = keyboardInput.nextDouble();
        double sixthNum = keyboardInput.nextDouble();
        double seventhNum = keyboardInput.nextDouble();
        double eightNum = keyboardInput.nextDouble();
        double ninthNum = keyboardInput.nextDouble();
        double tenthNum = keyboardInput.nextDouble();

        double[] nums = {firstNum, secondNum, thirdNum, fourthNum, fifthNum,
                sixthNum, seventhNum, eightNum, ninthNum, tenthNum};

        smallestElement = canFindSmallestElements(nums);

        System.out.println("The minimum number is:  " + smallestElement);

    }


    public static double canFindSmallestElements(double[] nums) {
        double min = nums[0];

        for (int count = 0; count < nums.length; count++) {
            if (nums[count] < min) {
                min = nums[count];
            }
        }
        return min;
    }
}
