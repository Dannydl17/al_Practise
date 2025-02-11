package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class SortNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter three numbers:   ");
        double num1 = keyboardInput.nextDouble();
        double num2 = keyboardInput.nextDouble();
        double num3 = keyboardInput.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
      double tempo = 0.0;

      double fNumber = num1;
      double sNumber = num2;
      double tNumber = num3;

        if (fNumber > sNumber) {
            tempo = fNumber;
            fNumber = sNumber;
            sNumber = tempo;
        }
        else{
            tempo = sNumber;
            sNumber = fNumber;
            fNumber = tempo;
        }

        if (fNumber > tNumber) {
            tempo = fNumber;
            fNumber = tNumber;
            tNumber = tempo;
        }
        else {
            tempo = tNumber;
            tNumber = fNumber;
            fNumber = tempo;
        }

        if (sNumber < fNumber) {
            tempo = sNumber;
            sNumber = fNumber;
            fNumber = tempo;
        }
        else {
            tempo = fNumber;
            sNumber = fNumber;
            fNumber = tempo;
        }

        if (sNumber < tNumber) {
            tempo = sNumber;
            sNumber = tNumber;
            tNumber = tempo;
        }
        if (sNumber > tNumber) {
            tempo = sNumber;
            sNumber = tNumber;
            tNumber = tempo;
        }

        System.out.print(fNumber + " ");
        System.out.print(sNumber + " ");
        System.out.print(tNumber);
    }
}
