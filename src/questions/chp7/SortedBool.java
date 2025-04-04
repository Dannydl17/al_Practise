package questions.chp7;

import java.util.Arrays;

public class SortedBool {

    public static int[] canReturnNewElementOfArrayWithOutZero(int[] num) {
        int count = 0;

        for (int counter = 0; counter < num.length; counter++){
            if (num[counter] != 0) {
                count++;
            }
        }

        int[] numbers = new int[count];
        int newIndex = 0;
        for (int index = 0; index < num.length; index++) {
            if (num[index] != 0) {
                numbers[newIndex] = num[index];
                newIndex++;
            }
        }
        return numbers;
    }
    public static boolean isSorted(int[] nums) {
        boolean word = false;
        int num = nums[0];
        nums[0] = 0;
        int[] elements = canReturnNewElementOfArrayWithOutZero(nums);
        System.out.println(Arrays.toString(elements));
        int fIndex = elements[0];
        int sIndex = elements[1];

        if (fIndex <= sIndex){
            word = true;
        }

        return word;
    }
}
