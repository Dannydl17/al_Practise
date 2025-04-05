package questions.chp7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class SortedBool {

    public static void main(String[] args) {
        ArrayList<Integer> colNumber = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter list: ");
        int nO = keyboardInput.nextInt();
        colNumber.add(nO);

        int nT = keyboardInput.nextInt();
        colNumber.add(nT);

        int nTh = keyboardInput.nextInt();
        colNumber.add(nTh);

        int nF = keyboardInput.nextInt();
        colNumber.add(nF);

        int nFi = keyboardInput.nextInt();
        colNumber.add(nFi);

        int nSi = keyboardInput.nextInt();
        colNumber.add(nSi);

        int nSe = keyboardInput.nextInt();
        colNumber.add(nSe);

        int nEi = keyboardInput.nextInt();
        colNumber.add(nEi);

        int[] numT = convertToArrayOfNumber(colNumber);
        boolean isSorted = isSorted(numT);

        if (isSorted == true){
            System.out.println("The list is already sorted");
        }
        else {
            System.out.println("The list is not sorted");
        }
    }

    private static int[] convertToArrayOfNumber(ArrayList<Integer> r) {
        int[] results = new int[r.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = r.get(index);
        }
        return results;
    }

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
