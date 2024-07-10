package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class Table {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter first number: ");
        int firstNumber = keyboardInput.nextInt();
        int addedNumber = firstNumber + firstNumber;
        int powerNumberOne = (int) Math.pow(firstNumber, addedNumber);

        System.out.println("Enter second number: ");
        int secondNumber = keyboardInput.nextInt();
        int addedNumberT= secondNumber + firstNumber;
        int powerNumberTwo = (int) Math.pow(secondNumber, addedNumberT);

        System.out.println("Enter third number: ");
        int thirdNumber = keyboardInput.nextInt();
        int addedNumberThree = thirdNumber + firstNumber;
        int powerNumberThree = (int) Math.pow(thirdNumber, addedNumberThree);

        System.out.println("Enter fourth number: ");
        int fourthNumber = keyboardInput.nextInt();
        int addedNumberF= fourthNumber + firstNumber;
        int powerNumberFour = (int) Math.pow(fourthNumber, addedNumberF);

        System.out.println("Enter fifth number: ");
        int fifthNumber = keyboardInput.nextInt();
        int addedNumberFive= fifthNumber + firstNumber;
        int powerNumberFive= (int) Math.pow(fifthNumber, addedNumberFive);


        System.out.println("a     b       pow(a,b)");
        System.out.format("%1d%6d%10d%n",firstNumber, addedNumber , powerNumberOne);
        System.out.format("%1d%6d%10d%n",secondNumber, addedNumberT , powerNumberTwo);
        System.out.format("%1d%6d%10d%n",thirdNumber, addedNumberThree , powerNumberThree);
        System.out.format("%1d%6d%10d%n",fourthNumber, addedNumberF , powerNumberFour);
        System.out.format("%1d%6d%10d%n",fifthNumber, addedNumberFive , powerNumberFive);

    }
}
