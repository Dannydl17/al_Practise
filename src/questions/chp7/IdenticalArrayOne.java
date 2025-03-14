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

        result = canCheckForTheEqualsElement(nums, numbs);

        if (result == true) {
            System.out.println("Two lists are identical");
        }
        else{
            System.out.println("Two lists are not identical");
        }
    }
    public static boolean canCheckForTheEqualsElement(int[] elementOne, int[] elementTwo) {
        int numberOne = 0;
        int numberTwo = 0;
        int count = 0;
        int countNum = 0;
        boolean word = false;

        while (count != elementOne.length){
            numberOne = elementOne[count];
            numberTwo = elementTwo[count];

            if (numberOne == numberTwo) {
                 countNum++;
            }
            else {
                countNum--;
            }
            count++;
        }

        if (countNum == elementOne.length) {
            word = true;
        }
        return word;
    }
}
