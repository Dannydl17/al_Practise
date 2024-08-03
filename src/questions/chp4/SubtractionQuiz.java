package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class SubtractionQuiz {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner keyboardInput = new Scanner(in);

        while(count < NUMBER_OF_QUESTION){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2){
                int tempo = number1;
                number1 = number2;
                number2 = tempo;
            }

            System.out.println("What is " + number1 + " - " + number2 + "? ");
            int answer = keyboardInput.nextInt();

            if (number1 - number2 == answer){
                System.out.println("You are correct! ");
                correctCount++;
            }
            else {
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));
                count++;

                output += "\n" + number1 + "-" + number2 + "=" + answer +
                        ((number1 - number2 == answer) ? " correct" : " wrong");
            }
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
