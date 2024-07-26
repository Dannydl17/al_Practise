package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class RepeatAddition {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner keyboardInput = new Scanner(in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int numberCollected = keyboardInput.nextInt();

        while (number1 + number2 != numberCollected){
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            numberCollected = keyboardInput.nextInt();
        }
        System.out.println("You got it!");
    }
}

