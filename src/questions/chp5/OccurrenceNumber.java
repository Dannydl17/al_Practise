package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class OccurrenceNumber {
    public static void main(String[] args) {
        int max = 0;
        int count = 0;
        Scanner keyboardInput =new Scanner(in);

        System.out.println("Enter number:  ");
        int nums = keyboardInput.nextInt();

        max = nums;

        while (nums != 0){
            System.out.println("Enter number:  ");
            nums = keyboardInput.nextInt();

            if (nums == max) {
                count ++;
            }

            if (nums > max) {
                max = nums;
                count = 1;
            }
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is" + count);
    }
}
