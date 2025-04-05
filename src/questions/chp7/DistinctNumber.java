package questions.chp7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class DistinctNumber {
    public static void main(String[] args) {
        ArrayList<Integer> colNumber = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter ten number:  ");
        int nOn = keyboardInput.nextInt();
        colNumber.add(nOn);

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

        int nNi = keyboardInput.nextInt();
        colNumber.add(nNi);

        int nTe = keyboardInput.nextInt();
        colNumber.add(nTe);

        int[] numT = convertToArrayOfNumber(colNumber);
         numT = canReturnNumberNdZero(numT);
        int[] newNumb = canReturnDistinctNumbersWithOutZero(numT);
        int numb = canCountNumberOfDistNumb(newNumb);

        System.out.println("The number of distinct number is " + numb);
        System.out.print("The distinct numbers are : ");
        for (int count = 0; count < newNumb.length; count++) {
            System.out.print(newNumb[count] + " ");
        }


    }

    private static int[] convertToArrayOfNumber(ArrayList<Integer> r) {
        int[] results = new int[r.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = r.get(index);
        }
        return results;
    }

    public static int[] canReturnNumberNdZero(int[] elements) {
        int[] nums = new int[elements.length];

        int newIndex = 0;
        int cN = 0;
        int cT = 0;
        int countN = 0;
        for (int count = 0; count < elements.length; count++) {
            int numOne = elements[count];
            while (countN != nums.length){
                if (nums[countN] != numOne){
                     cN++;
                }
                if (nums[countN] == numOne){
                     cT++;
                }
                countN++;
            }

            if (cN == nums.length) {
                nums[newIndex] = numOne;
                newIndex++;
                numOne = 0;
            }

            if (cN < nums.length){
                cT = 0;
            }
            cN = 0;

            countN = 0;
        }
        return nums;
    }

    public static int[] canReturnDistinctNumbersWithOutZero(int[] elements) {
        int count = 0;

        for (int counter = 0; counter < elements.length; counter++) {
            if (elements[counter] != 0) {
                count++;
            }
        }

        int[] disNum = new int[count];
        int newIndex = 0;
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] != 0) {
                disNum[newIndex] = elements[index];
                newIndex++;
            }
        }
        return disNum;
    }

    public static int canCountNumberOfDistNumb(int[] disNum) {
        int count = disNum.length;
        return count;
    }
}
