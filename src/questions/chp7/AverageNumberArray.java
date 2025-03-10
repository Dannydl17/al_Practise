package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class AverageNumberArray {

    public static void main(String[] args) {
        int numbers = 0;
        double number = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter ten double values:  ");
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

        numbers = canCalculateAnAverageNumber(nums);
        number = canCalculateAnAverageNumberDouble(nums);

        System.out.println(numbers);
        System.out.println(number);

    }
    public static int canCalculateAnAverageNumber(int[] nums) {
       int total = 0;

        for (int count = 0; count < nums.length; count++) {
             total+=nums[count];
        }

        double averageNumber = (double) total / nums.length - 1;

        return (int) averageNumber;
    }

    public static double canCalculateAnAverageNumberDouble(double[] nums) {
        int total = 0;

        for (int count = 0; count < nums.length; count++) {
            total+= (int) nums[count];
        }

        double averageNumber = (double) total / nums.length - 1;
        return averageNumber;
    }
}
