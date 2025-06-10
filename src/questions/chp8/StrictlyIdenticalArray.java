package questions.chp8;

import java.util.Scanner;

import static java.lang.System.in;

public class StrictlyIdenticalArray {
    public static void main(String[] args) {
        boolean result = false;
        Scanner keyboardInput = new Scanner(in);

        int[][] fNumbs = new int[3][3];
        int[][] sNumbs = new int[3][3];


        System.out.print("Enter list1: ");
        for (int row = 0; row < fNumbs.length; row++) {
            for (int column = 0; column < fNumbs[row].length; column++) {
                int numOne = keyboardInput.nextInt();
                fNumbs[row][column] = numOne;
            }
        }

        System.out.print("Enter list2: ");
        for (int row = 0; row < sNumbs.length; row++) {
            for (int column = 0; column < sNumbs[row].length; column++) {
                int numTwo = keyboardInput.nextInt();
                sNumbs[row][column] = numTwo;
            }
        }

        result = canReturnEqualsElements(fNumbs, sNumbs);

        if (result == true) {
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }
    }
    public static boolean canReturnEqualsElements(int[][] m1, int[][] m2) {
        int numberOne = 0;
        int numberTwo = 0;
        int countNum = 0;
        int countNumb = 0;
        int countNums = 0;
        boolean word = false;

        while (countNum != m1.length && countNum != m2.length){
            numberOne = m1[countNum][countNumb];
            numberTwo = m2[countNum][countNumb];

            if (numberOne == numberTwo) {
                countNums++;
            }

            if (numberOne != numberTwo) {
                countNums--;
            }

            countNumb++;

            if (countNumb == m1.length && countNumb == m2.length){
                countNumb = 0;
                countNum++;
            }
        }

        int colLength = m1.length * m2.length;

        if (countNums != colLength) {
            countNums += 1;
        }

        if (countNums == colLength) {
            word = true;
        }
        return word;
    }
}
