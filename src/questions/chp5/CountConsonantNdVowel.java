package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class CountConsonantNdVowel {
    public static void main(String[] args) {
        int countV = 0;
        int countConsonant = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a string:   ");
        String word = keyboardInput.nextLine();

        for (int count = 0; count < word.length(); count++) {
            if (word.charAt(count) == 97 || word.charAt(count) == 101 ||
                word.charAt(count) == 105 || word.charAt(count) == 111 ||
                word.charAt(count) == 117) {
                  countV++;
            }
        }

        System.out.println("The number of vowels is " + countV);
    }

    public static int canCountNumberOfVowels(String words) {
        int countV = 0;
        for (int count = 0; count < words.length(); count++) {
            if (words.charAt(count) == 97 || words.charAt(count) == 101 ||
                    words.charAt(count) == 105 || words.charAt(count) == 111 ||
                    words.charAt(count) == 117) {
                countV++;
            }
        }
        return countV;
    }
}
