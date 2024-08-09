package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class GreatestCommonD {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int gcd = 1, num1, num2;
        int k = 2;
        System.out.print("Enter the first integer: ");
        num1 = keyboardInput.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = keyboardInput.nextInt();


//        do {
//            if (num1 % k == 0 && num2 % k == 0)
//                gcd = k;
//            k++;
//        }while (k <=num1 && k <= num2);

        while (k <= num1 && k <= num2){
            if (num1 % k == 0 && num2 % k == 0)
                gcd = k;
            k++;
        }
//        for (int k = 2; k <= num1 && k <= num2 ; k++) {
//            if (num1 % k == 0 && num2 % k == 0)
//                gcd = k;
//        }
//        for (int k = 2; k <= num1 / 2 && k <= num2 / 2; k++) {
//            if (num1 % k == 0 && num2 % k == 0)
//                gcd = k;
//        }

        System.out.println("The greatest common divisor for " + num1 +
                " and " + num2 + " is " + gcd);
    }
}
