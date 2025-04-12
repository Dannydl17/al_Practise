package questions.playcode;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class PartitionCode {
    public static void main(String[] args) {
        ArrayList<Integer> rCollected = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter a list: ");
        int nOn = keyboardInput.nextInt();
        rCollected.add(nOn);

        int nT = keyboardInput.nextInt();
        rCollected.add(nT);

        int nTh = keyboardInput.nextInt();
        rCollected.add(nTh);

        int nF = keyboardInput.nextInt();
        rCollected.add(nF);

        int nFi = keyboardInput.nextInt();
        rCollected.add(nFi);

        int nSi = keyboardInput.nextInt();
        rCollected.add(nSi);

        int nSe = keyboardInput.nextInt();
        rCollected.add(nSe);

        int nEi = keyboardInput.nextInt();
        rCollected.add(nEi);

        int nNi = keyboardInput.nextInt();
        rCollected.add(nNi);

        int[] numT = convertToArrayOfNumber(rCollected);

        int[] nums = changeFirstIndexToZero(numT);

        nums = canReturnNewElementOfArrayWithOutZero(nums);

        int numb = partitionList(nums);

    }


    private static int[] convertToArrayOfNumber(ArrayList<Integer> r) {
        int[] results = new int[r.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = r.get(index);
        }
        return results;
    }

    private static int[] changeFirstIndexToZero(int[] numT) {
        for (int count = 0; count < numT.length; count++) {
            if (count == 0) {
                numT[count] = 0;
            }
        }
        return numT;
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

    public static int partitionList(int[] nums) {

        return 0;
    }

}
