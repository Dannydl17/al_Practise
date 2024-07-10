package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class SaleTax {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter purchase amount:   ");
        double purchaseAmount = keyboardInput.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $ " + (int)(tax * 100) / 100.0);


        float f = 12.5F;
        int i = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);
        System.out.println("=================================");
        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
    }
}
