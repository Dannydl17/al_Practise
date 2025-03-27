package questions.chp7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class TwoSortedList {

    public static void main(String[] args) {
        ArrayList<Integer> colNumber = new ArrayList<>();
        ArrayList<Integer> colNumberT = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter list1:  ");
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

//        int nSe = keyboardInput.nextInt();
//        colNumber.add(nSe);
//
//        int nEi = keyboardInput.nextInt();
//        colNumber.add(nEi);
//
//        int nNi = keyboardInput.nextInt();
//        colNumber.add(nNi);
//
//        int nTe = keyboardInput.nextInt();
//        colNumber.add(nTe);
//
//        int nEl = keyboardInput.nextInt();
//        colNumber.add(nEl);

        int[] numF = convertToArrayOfNumber(colNumber);


        System.out.print("Enter list2:  ");
        nO = keyboardInput.nextInt();
        colNumberT.add(nO);

        nT = keyboardInput.nextInt();
        colNumberT.add(nT);

        nTh = keyboardInput.nextInt();
        colNumberT.add(nTh);

        nF = keyboardInput.nextInt();
        colNumberT.add(nF);

        nFi = keyboardInput.nextInt();
        colNumberT.add(nFi);

        int[] numT = convertToArrayOfNumber(colNumberT);


    }

    private static int[] convertToArrayOfNumber(ArrayList<Integer> r) {
        int[] results = new int[r.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = r.get(index);
        }
        return results;
    }

    public static int[] canCompareAndChangeElementWithTheSameValueToZero(int[] num) {
        for (int count = 0; count < num.length; count++) {
            for (int counter = count + 1; counter < num.length; counter++) {
                if (num[counter] == num[count]) {
                    num[counter] = 0;
                }
            }
        }
        return num;
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
    public static int[] canSortArray(int...elements) {
        int[] result = new int[elements.length];

        for (int count = 0; count < elements.length;) {
             int nums = elements[count];
             int counter;
             for (counter = count + 1; counter < elements.length; counter++){
                 if (nums > elements[counter]) break;
             }
            if (counter == elements.length) {
                result[count] = nums;
                count++;
            }
            else {
                int temp = elements[counter];
                elements[counter] = nums;
                elements[count] = temp;
            }
        }
        return result;
    }

    public static int[] canMergeAnArray(int[] list1, int[] list2) {

        return list1;
    }
}
