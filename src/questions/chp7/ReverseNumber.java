package questions.chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ReverseNumber {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int sixthNumber = 0;
        int sevenNumber = 0;
        int eightNumber = 0;
        int ninthNumber = 0;
        int tenthNumber = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter firstNumber:  ");
        firstNumber = keyboardInput.nextInt();

        System.out.print("Enter secondNumber:  ");
        secondNumber = keyboardInput.nextInt();

        System.out.print("Enter thirdNumber:  ");
        thirdNumber = keyboardInput.nextInt();

        System.out.print("Enter fourthNumber:  ");
        fourthNumber = keyboardInput.nextInt();

        System.out.print("Enter fifthNumber:  ");
        fifthNumber = keyboardInput.nextInt();

        System.out.print("Enter sixthNumber:  ");
        sixthNumber = keyboardInput.nextInt();

        System.out.print("Enter sevenNumber:  ");
        sevenNumber = keyboardInput.nextInt();

        System.out.print("Enter eightNumber:  ");
        eightNumber = keyboardInput.nextInt();

        System.out.print("Enter ninthNumber:  ");
        ninthNumber = keyboardInput.nextInt();

        System.out.print("Enter tenthNumber:  ");
        tenthNumber = keyboardInput.nextInt();


        int[] num = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber,
                     sixthNumber, sevenNumber, eightNumber, ninthNumber, tenthNumber};


        int[] result = canReverseNumberGotten(num);

        System.out.println(Arrays.toString(result));

    }
    public static int[] canReverseNumberGotten(int[] numb) {
        int[] result = new int[numb.length];
        for (int count = 0, counter = numb.length - 1; count < numb.length; count++, counter--) {
             result[counter] = numb[count];
        }
        return result;
    }
}
