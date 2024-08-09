package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a decimal number: ");
        int decimal = keyboardInput.nextInt();

        String hex = "";

        while (decimal != 0){
            int hexValue = decimal % 16;

             char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
                 hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + hex);
    }
}
