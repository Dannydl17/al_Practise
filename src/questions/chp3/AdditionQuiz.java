package questions.chp3;

import java.util.Scanner;

import static java.lang.System.in;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        Scanner keyboardInput = new Scanner(in);

        System.out.println("What is "+ number1 + " + " + number2 + "?  ");
        int number = keyboardInput.nextInt();

        int answer = number;
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                (number1 + number2 == answer));

        int x = 1;
        System.out.println((x > 0));
        System.out.println((x < 0));
        System.out.println((x != 0));
        System.out.println((x >= 0));
        System.out.println((x != 1));
    }
}
