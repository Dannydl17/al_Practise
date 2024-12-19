package questions.chp3;

import java.util.Scanner;

import static java.lang.System.in;

public class Game {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 3);
        System.out.println(randomNumber);
        String numZero = "";
        String numOne = "";
        String numTwo = "";
        String lNumZero = "";
        String lNumOne = "";
        String lNumTwo = "";
        String result = "";
        String resultO = "";

        Scanner keyboardInput = new Scanner(in);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int nums = keyboardInput.nextInt();

        if (randomNumber == 0) {
            numZero = "scissor";
        }
        if (randomNumber == 1) {
            numOne = "rock";
        }
        if (randomNumber == 2) {
            numTwo = "paper";
        }

        if (nums == 0) {
            lNumZero = "scissor";
        }
        if (nums == 1) {
            lNumOne = "rock";
        }
        if (nums == 2) {
            lNumTwo = "paper";
        }

        if (randomNumber != nums){

            if (randomNumber == 0) {
                result = numZero;
            }
            if (randomNumber == 1) {
                result = numOne;
            }
            if (randomNumber == 2) {
                result = numTwo;
            }

            if (nums == 0) {
                resultO = lNumZero;
            }
            if (nums == 1) {
                resultO = lNumOne;
            }
            if (nums == 2) {
                resultO = lNumTwo;
            }

            System.out.println("The computer is " + result + "." + " You are " + resultO + "."  + " You won");
        }

        if (randomNumber == nums){

            if (randomNumber == 0) {
                result = numZero;
            }
            if (randomNumber == 1) {
                result = numOne;
            }
            if (randomNumber == 2) {
                result = numTwo;
            }

            if (nums == 0) {
                resultO = lNumZero;
            }
            if (randomNumber == 1) {
                resultO = lNumOne;
            }
            if (nums == 2) {
                resultO = lNumTwo;
            }

            System.out.println("The computer is " + result + "." + " You are " + resultO + " too. " + " It is a draw");
        }


    }
}
