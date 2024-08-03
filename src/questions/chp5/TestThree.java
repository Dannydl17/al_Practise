package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class TestThree {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

//        int sum = 0;
//
//        System.out.println("Enter an integer " +
//                "(the input ends if it is 0)");
//        int number = keyboardInput.nextInt();
//
//        do {
//            sum+=number;
//
//            System.out.println("Enter an integer " +
//                    "(the input ends if it is 0)");
//            number = keyboardInput.nextInt();
//        }while (number != 0);
//        System.out.println("The sum is " + sum);

//        for (int i = 0, j = 0;
//             i + j <  10;
//             i++, j++) {
//            System.out.println("Welcome to Java Programming");
//        }

        int sum = 0;
//        for (int i = 0;
//             i < 10;
//             ++i) {
//            sum += i;
//        }
//        System.out.println(sum);

        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
