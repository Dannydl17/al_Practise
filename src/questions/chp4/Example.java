package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class Example {
    public static void main(String[] args) {
//        Scanner keyboardInput = new Scanner(in);
//
//        System.out.print("Enter an integer (the input ends if it is 0): ");
//        int nums = keyboardInput.nextInt();
//
//        int sum = 0;
//        while (nums != 0){
//            sum += nums;
//
//            System.out.print("Enter an integer (the input ends if it is 0): ");
//            nums = keyboardInput.nextInt();
//        }
//        System.out.println("The sum is " + sum);

//        double item = 1; double sum1 = 0;
//        while (item != 0) {
//            sum1 += item;
//            item -= 0.1;
//        }
//        System.out.println(sum1);
//
//        int i = 1;
//        while (i < 10) {
//            if (i % 2 == 0) {
//                System.out.println(i++);
//            }
//        }

//        int i = 1;
//        while (i < 10) {
//            if (i % 2 == 0)
//                System.out.println(i);
//        }

        int i = 1;
        while (i < 10) {
            if ((i++) % 2 == 0)
                System.out.println(i);
        }
    }
}
