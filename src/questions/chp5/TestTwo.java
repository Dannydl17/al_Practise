package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class TestTwo {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int number, max;
        number = keyboardInput.nextInt();

        max = number;

        do{
          number = keyboardInput.nextInt();
            if (number > max) {
                max = number;
            }
        }while (number != 0);
        System.out.println("Max is " + max);
        System.out.println("Number " + number);
    }
}
