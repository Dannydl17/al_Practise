package questions.chp6;

import java.security.SecureRandom;

public class CrapGame {

    public static void main(String[] args) {
        SecureRandom  randomNumber = new SecureRandom();
        int firstGuess = 1 + randomNumber.nextInt(6);
        System.out.println(firstGuess);
        int secondGuess = 1 + randomNumber.nextInt(6);
        System.out.println(secondGuess);

        int sumNum = firstGuess + secondGuess;

        if (sumNum == 2 || sumNum == 3 || sumNum == 12) {
            System.out.println("You lose");
        }

        if (sumNum == 7 || sumNum == 11) {
            System.out.println("You win");
        }

        if (sumNum == 4 || sumNum == 5 || sumNum == 6 ||
            sumNum == 8 || sumNum == 9 || sumNum == 10) {
            System.out.println("point is " + sumNum);
        }
    }
}
