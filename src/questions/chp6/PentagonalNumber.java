package questions.chp6;

import java.util.ArrayList;

public class PentagonalNumber {
    public static void main(String[] args) {
        int nums = 100;

        int[]num = canReturnListOfPentagonalNumber(nums);

        for (int count = 0; count < num.length; count++) {
            System.out.print(num[count] + " ");
        }


    }
    public static int getPentagonalNumber(int nums) {
        int count = 100;
        int result = 0;
        int number = (3 * (nums * nums)) - nums;
        int numR = number / 2;
        if (numR < count) {
            result = numR;
        }
        return result;
    }

    public static int[] canReturnListOfPentagonalNumber(int number) {
        ArrayList<Integer> numb = new ArrayList<>();
        int nums = number;
        int count = 1;
        int numbers = PentagonalNumber.getPentagonalNumber(count);
        numb.add(numbers);
        while (numbers < nums){
            count++;
            numbers = PentagonalNumber.getPentagonalNumber(count);
            if (numbers == 0) {
                break;
            }
            numb.add(numbers);
        }
        return convertToArray(numb);
    }

    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] results = new int[result.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = result.get(index);
        }
        return results;
    }
}
