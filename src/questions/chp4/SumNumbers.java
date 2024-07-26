package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int addInput = 0;
        int firstNumber = 0;
        System.out.println("Enter a number:  ");
        int userInput = keyboardInput.nextInt();

        firstNumber = userInput;

        while (userInput > 0){
            System.out.println("Enter a number:  ");
            userInput = keyboardInput.nextInt();

            addInput+= userInput;

            if (firstNumber == addInput || addInput > firstNumber) {
                  break;
            }
        }
        System.out.printf("The first number: %d AddInput: %d\n", firstNumber, addInput);
    }
}
