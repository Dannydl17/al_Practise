package questions.chp7;

import java.security.SecureRandom;

public class RandomNumChooser {
    private static SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {
        int n = 1 + randomNumber.nextInt(54);
        System.out.println(n);
    }
    public static int getRandom(int... numbers){
        int numbs = numbers.length;
        int numb = 0;
        int collectRNumber = 1 + randomNumber.nextInt(54);
        int countIndex = 0;

        int number = numbers[countIndex];
        if (collectRNumber != number) {
             countIndex++;
        }
        while (countIndex != numbs){
            number = numbers[countIndex];
            if (collectRNumber != number) {
                countIndex++;
            }
        }

        if (countIndex == numbs) {
            numb = collectRNumber;
        }

        return numb;
    }
}
