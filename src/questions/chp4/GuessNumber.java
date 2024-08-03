package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class GuessNumber {
    public static void main(String[] args) {
       int number = (int)(Math.random() * 101);

       Scanner keyboardInput = new Scanner(in);
       System.out.print("Guess a magic number between 0 to 100");

        int guessNumber = -1;
        while (guessNumber != number){
            System.out.print("\n Enter your guess number:  ");
            guessNumber = keyboardInput.nextInt();

            if (guessNumber == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guessNumber > number) {
                System.out.println("Your guess number is  high");
            }
            else
                System.out.println("Your guess number is low");
        }
    }
}
