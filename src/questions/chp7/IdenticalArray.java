package questions.chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class IdenticalArray {

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

        result = canCheckForTheSameElementInTheArray(nums, numbs);

        if (result == true) {
            System.out.println("Two lists are strictly identical");
        }
        else{
            System.out.println("Two lists are not strictly identical");
        }

    }
    public static boolean canCheckForTheSameElementInTheArray(int[] elementOne, int[] elementTwo) {
         int numberOne = 0;
         int numberTwo = 0;
         int countNum = 0;
         int countNums = 0;
         boolean word = false;

         while (countNum != elementOne.length){
              numberOne = elementOne[countNum];
              numberTwo = elementTwo[countNum];

             if (numberOne == numberTwo) {
                  countNums++;
             }

             if (numberOne != numberTwo) {
                  countNums--;
             }
             countNum++;
         }

        if (countNums == elementOne.length) {
            word = true;
        }

        return word;
    }
}
