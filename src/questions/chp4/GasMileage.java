package questions.chp4;

import java.util.Scanner;

import static java.lang.System.in;

public class GasMileage {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the number of mile driven: ");
        int mileNumber = keyboardInput.nextInt();

        System.out.println("Enter the number of gallon used: ");
        int gallonUsed = keyboardInput.nextInt();
    }
}
