package questions.chp6;

import java.security.SecureRandom;

public class CrapGame {

    public static void main(String[] args) {
        SecureRandom  randomNumber = new SecureRandom();
        int firstGuess = 1 + randomNumber.nextInt(6);
        int secondGuess = 1 + randomNumber.nextInt(6);

        int count = 0;
        int point = 0;

        int sumNum = firstGuess + secondGuess;

        if (sumNum == 2 || sumNum == 3 || sumNum == 12) {
            System.out.println("You lose");
        }

        if (sumNum == 7) {
            System.out.println("You lose");
        }


        if (sumNum == 11) {
            System.out.println("You win");
        }

        if (sumNum == 4 || sumNum == 5 || sumNum == 6 ||
            sumNum == 8 || sumNum == 9 || sumNum == 10) {
            point = sumNum;
            System.out.println("point is " + point);
        }


        if (point == 4 || point == 5 || point == 6||
            point == 8 || point == 9 || point == 10) {
            while (count >= 0){
                firstGuess = 1 + randomNumber.nextInt(6);
                secondGuess = 1 + randomNumber.nextInt(6);

                sumNum = firstGuess + secondGuess;


                if(sumNum == 7 || point == sumNum) {

                    if (sumNum == 7) {
                        System.out.println("You lose");
                    }

                    if (point == sumNum) {
                        System.out.println("You win");
                    }
                    break;
                }

                if (sumNum != 7) {
                    count++;
                }

            }
        }

    }
}
