package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class IdenticalArrayOne {

    public static void main(String[] args) {
        boolean result = false;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter List1:   ");
        int firstLN = keyboardInput.nextInt();
        int secondLN = keyboardInput.nextInt();
        int thirdLN = keyboardInput.nextInt();
        int fourthLN = keyboardInput.nextInt();
        int fifthLN = keyboardInput.nextInt();
        int sixthLN = keyboardInput.nextInt();

        int[] nums = {firstLN, secondLN, thirdLN, fourthLN, fifthLN, sixthLN};

        System.out.print("Enter List2:   ");
        firstLN = keyboardInput.nextInt();
        secondLN = keyboardInput.nextInt();
        thirdLN = keyboardInput.nextInt();
        fourthLN = keyboardInput.nextInt();
        fifthLN = keyboardInput.nextInt();
        sixthLN = keyboardInput.nextInt();

        int[] numbs = {firstLN, secondLN, thirdLN, fourthLN, fifthLN, sixthLN};

//        result = canCheckForTheEqualsElement(nums, numbs);

        if (result == true) {
            System.out.println("Two lists are identical");
        }
        else{
            System.out.println("Two lists are not identical");
        }
    }

    public static int[] canSort(int[] result) {
        int[] collectNumber = new int[result.length];

        for (int row = 0; row < result.length;) {
            int nums = result[row];
            int innerIndex = 0;
            for (innerIndex = row + 1; innerIndex < result.length; innerIndex++) {
                if (nums > result[innerIndex]) break;
            }
            if (innerIndex == result.length) {
                collectNumber[row] = nums;
                row++;
            }
            else {
                int tempo = result[innerIndex];
                result[innerIndex] = nums;
                result[row] = tempo;
            }
        }
        return collectNumber;
    }
    public static boolean canCheckForEqualsElementAndIndex(int[] elementOne, int[] elementTwo) {
        int numberOne = 0;
        int numberTwo = 0;
        int count = 0;
        int countNum = 0;
        boolean word = false;

        numberOne = elementOne[count];

        for (int rowIndex = 0; rowIndex < elementTwo.length; rowIndex++) {
              numberTwo = elementTwo[rowIndex];

            if (count == rowIndex) {
                if (numberOne == numberTwo) {
                    countNum++;
                }
            }
        }

        count++;

        while (count != elementOne.length){
            numberOne = elementOne[count];

            for (int rowIndex = 0; rowIndex < elementTwo.length; rowIndex++) {
                numberTwo = elementTwo[rowIndex];

                if (count == rowIndex) {
                    if (numberOne == numberTwo) {
                        countNum++;
                    }
                }
            }
            count++;
        }

        if (countNum == elementTwo.length) {
            word = true;
        }
        return word;
    }
}
