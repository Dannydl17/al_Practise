package questions.chp7;

import java.util.Arrays;

public class ShiftingElement {

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 7, 2};

        double temp = nums[0];

        for (int count = 1; count < nums.length; count++) {
            int n = nums[count];
            nums[count - 1] = n;
        }
        nums[nums.length - 1] = (int) temp;

        System.out.println(Arrays.toString(nums));

//        int x = 30;
//        int[] numbers = new int[x];
//        x = 60;
//        System.out.println("x is " + x);
//        System.out.println("The size of numbers is " + numbers.length);
    }
}
