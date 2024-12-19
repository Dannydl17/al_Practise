package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class GameSRP {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 3);

        String resultC = "";
        String resultU = "";
        int numberOfTimes = 3;
        int countRandomResult = 0;
        int countNumsResult = 0;

        Scanner keyboardInput = new Scanner(in);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int nums = keyboardInput.nextInt();

        resultC = comPlay(randomNumber);

        resultU = userPlay(nums);

        if (resultU == "rock" && resultC == "scissor"){
            countNumsResult++;
        }

        if (resultC == "rock" && resultU == "scissor") {
                   countRandomResult++;
        }

        if (resultC == "rock" && resultU == "rock") {
            System.out.println("It is a draw");
        }

        if (resultU == "scissor" && resultC == "paper") {
            countNumsResult++;
        }

        if (resultC == "scissor" && resultU == "paper") {
                  countRandomResult++;
        }

        if (resultC == "scissor" && resultU == "scissor") {
            System.out.println("It is a draw");
        }

        if (resultU == "paper" && resultC == "rock") {
            countNumsResult++;
        }

        if (resultC == "paper" && resultU == "rock") {
            countRandomResult++;
        }

        if (resultC == "paper" && resultU == "paper") {
            System.out.println("It is a draw");
        }

        while (countNumsResult != numberOfTimes && countRandomResult != numberOfTimes){
            randomNumber = (int) (Math.random() * 3);
            System.out.println("scissor (0), rock (1), paper (2): ");
            nums = keyboardInput.nextInt();

            resultC = comPlay(randomNumber);

            resultU = userPlay(nums);

            if (resultU == "rock" && resultC == "scissor"){
                countNumsResult++;
            }

            if (resultC == "rock" && resultU == "scissor") {
                countRandomResult++;
            }

            if (resultC == "rock" && resultU == "rock") {
                System.out.println("It is a draw");
            }

            if (resultU == "scissor" && resultC == "paper") {
                countNumsResult++;
            }

            if (resultC == "scissor" && resultU == "paper") {
                countRandomResult++;
            }

            if (resultC == "scissor" && resultU == "scissor") {
                System.out.println("It is a draw");
            }

            if (resultU == "paper" && resultC == "rock") {
                countNumsResult++;
            }

            if (resultC == "paper" && resultU == "rock") {
                countRandomResult++;
            }

            if (resultC == "paper" && resultU == "paper") {
                System.out.println("It is a draw");
            }
        }
        System.out.println(countNumsResult);
        System.out.println(countRandomResult);

    }

    public static String userPlay(int nums) {
         String userW = "";
        if (nums == 0) {
            userW = "scissor";
        }
        if (nums == 1) {
            userW = "rock";
        }
        if (nums == 2) {
            userW = "paper";
        }
        return userW;
    }

    public static String comPlay(int randomNumber) {
        String words = "";
        if (randomNumber == 0) {
            words = "scissor";
        }
        if (randomNumber == 1) {
            words = "rock";
        }
        if (randomNumber == 2) {
            words = "paper";
        }
        return words;
    }
}
