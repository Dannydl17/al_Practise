package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner keyboardInput = new Scanner(in);

        while (count < NUMBER_OF_QUESTION){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            int number3 = (int)(Math.random() * 10);
            int number4 = (int)(Math.random() * 10);
            int number5 = (int)(Math.random() * 10);

            if(number1 < number2 && number2 < number3 && number3 < number4 && number4 < number5){
                int temp = number1;
                number1 = number2;
                number2 = number3;
                number4 = number5;
                number5 = temp;
            }

            System.out.print(
                    "What is " + number1 + " - " + number2 + " - " + number3 + " - " + number4 + " - " + number5 + "? ");
            int answer = keyboardInput.nextInt();

            if (number1 - number2 - number3 - number4 - number5 == answer) {
                  System.out.println("You are correct!");
                     correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1
                     + " - " + number2 + " - " + number3 + " - " + number4 + " - " + number5 +" should be " + (number1 - number2 - number3 - number4 - number5));

            count++;

            output += "\n" + number1 + "-" + number2 + "-" + number3 + "-" + number4 + "-" + number5 + "=" + answer +
                    ((number1 - number2 - number3 - number4 - number5 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
