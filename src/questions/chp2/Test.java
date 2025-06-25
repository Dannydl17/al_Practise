package questions.chp2;

import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {
        double i = 50.0;
        double k = i + 50.0;
        double j = k + i;

        int numberOne = 5;
        int numberTwo = 2;

        int numberDivided = numberOne / numberTwo;


        double oneN= 5.0;
        int twoN = 2;

        double dividedN = oneN / twoN;

        System.out.println("j is " + j + " and k is " + k);
        System.out.println("The result is " + numberDivided);
        System.out.println("The result is " + dividedN);

        int y = 5;

        String nu = "y + 2=" + (y + 2);
        System.out.println(nu);

        SecureRandom randomNumbers = new SecureRandom();
        int randomValue = randomNumbers.nextInt(2);
        System.out.println(randomValue);
    }
}
