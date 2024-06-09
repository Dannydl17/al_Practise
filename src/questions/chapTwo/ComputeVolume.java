package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeVolume {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the radius and length of a cylinder:   ");
        double numberCollected = keyboardInput.nextDouble();

        double nums = numberCollected / 10000;
        int numOne = (int) (numberCollected % 100);
        System.out.println(nums);
        System.out.println(numOne);
    }
}
