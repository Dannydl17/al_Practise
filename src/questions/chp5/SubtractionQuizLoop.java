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
        }
    }
}
