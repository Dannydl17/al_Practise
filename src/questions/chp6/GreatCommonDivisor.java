package questions.chp6;

import java.util.Scanner;

public class GreatCommonDivisor {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = keyboardInput.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = keyboardInput.nextInt();

        
        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd(n1, n2));
    }

    private static int gcd(int num1, int num2) {
        int gcd = 1;
        int k = 2;

        while (k <= num1 && k <= num2) {
            if (num1 % k == 0 && num2 % k == 0)
                gcd = k;
              k++;
        }
        return gcd;
    }
}
