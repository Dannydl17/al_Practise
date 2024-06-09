package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an integer for second:  ");
        int second = keyboardInput.nextInt();

        int minutes = second / 60;
        int remainingSeconds = second % 60;

        int num = 4;
        double number = 0.5;
        double result = Math.pow(num, number);

        System.out.println(result);
        System.out.println(second + " second is " + minutes + " minutes and " + remainingSeconds + " seconds ");
    }
}
