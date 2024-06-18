package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class CalculateSubtotal {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the subtotal and a gratuity rate:  ");
        int numberOfSubtotal = keyboardInput.nextInt();
        int numberOfGratuity = keyboardInput.nextInt();

        double resultOfGratuity =((double) numberOfGratuity / 100) * numberOfSubtotal;
        double total = numberOfSubtotal + resultOfGratuity;


        System.out.println("The gratuity is " + resultOfGratuity +" and total is " + total);
    }
}
