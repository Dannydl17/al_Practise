package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class SortNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter three numbers:   ");
        double num1 = keyboardInput.nextInt();
        double num2 = keyboardInput.nextInt();
        double num3 = keyboardInput.nextInt();

        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
      double fNumber = num1;
      double sNumber = num2;
      double tNumber = num3;
    }
}
