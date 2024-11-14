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
            if (word.charAt(count) == 65 || word.charAt(count) == 69 ||
                word.charAt(count) == 73 || word.charAt(count) == 79 ||
                word.charAt(count) == 85) {
                  countV++;
            }

            if (word.charAt(count) == 97 || word.charAt(count) == 101 ||
                word.charAt(count) == 105 || word.charAt(count) == 111 ||
                word.charAt(count) == 117) {
                  countV++;
            }

            if (word.charAt(count) == 66 || word.charAt(count) == 67 ||
                word.charAt(count) == 68 || word.charAt(count) == 70 ||
                word.charAt(count) == 71 || word.charAt(count) == 72 ||
                word.charAt(count) == 74 || word.charAt(count) == 75 ||
                word.charAt(count) == 76 || word.charAt(count) == 77 ||
                word.charAt(count) == 78 || word.charAt(count) == 80 ||
                word.charAt(count) == 81 || word.charAt(count) == 82 ||
                word.charAt(count) == 83 || word.charAt(count) == 84 ||
                word.charAt(count) == 86 || word.charAt(count) == 87 ||
                word.charAt(count) == 88 || word.charAt(count) == 89 ||
                word.charAt(count) == 90 ) {
                countConsonant++;
            }

            if (word.charAt(count) == 98 || word.charAt(count) == 99 ||
                word.charAt(count) == 100 || word.charAt(count) == 102 ||
                word.charAt(count) == 103 || word.charAt(count) == 104 ||
                word.charAt(count) == 106 || word.charAt(count) == 107 ||
                word.charAt(count) == 108 || word.charAt(count) == 109 ||
                word.charAt(count) == 110 || word.charAt(count) == 112 ||
                word.charAt(count) == 113 || word.charAt(count) == 114 ||
                word.charAt(count) == 115 || word.charAt(count) == 116 ||
                word.charAt(count) == 118 || word.charAt(count) == 119 ||
                word.charAt(count) == 120 || word.charAt(count) == 121 ||
                word.charAt(count) == 122) {
                countConsonant++;
            }



        }

        System.out.println("The number of vowels is " + countV);
        System.out.println("The number of consonants is " + countConsonant);
    }

    public static int canCountNumberOfVowels(String words) {
        int countV = 0;
        for (int count = 0; count < words.length(); count++) {
            if (words.charAt(count) == 65 || words.charAt(count) == 69 ||
                words.charAt(count) == 73 || words.charAt(count) == 79 ||
                words.charAt(count) == 85) {
                countV++;
            }
            if (words.charAt(count) == 97 || words.charAt(count) == 101 ||
                words.charAt(count) == 105 || words.charAt(count) == 111 ||
                words.charAt(count) == 117) {
                countV++;
            }
        }
        return countV;
    }

    public static int canCountNumberOfConsonant(String words) {
        int countConsonant = 0;
        for (int count = 0; count < words.length(); count++) {
            if (words.charAt(count) == 66 || words.charAt(count) == 67 ||
                words.charAt(count) == 68 || words.charAt(count) == 70 ||
                words.charAt(count) == 71 || words.charAt(count) == 72 ||
                words.charAt(count) == 74 || words.charAt(count) == 75 ||
                words.charAt(count) == 76 || words.charAt(count) == 77 ||
                words.charAt(count) == 78 || words.charAt(count) == 80 ||
                words.charAt(count) == 81 || words.charAt(count) == 82 ||
                words.charAt(count) == 83 || words.charAt(count) == 84 ||
                words.charAt(count) == 86 || words.charAt(count) == 87 ||
                words.charAt(count) == 88 || words.charAt(count) == 89 ||
                words.charAt(count) == 90 ) {
                countConsonant++;
            }

            if (words.charAt(count) == 98 || words.charAt(count) == 99 ||
                words.charAt(count) == 100 || words.charAt(count) == 102 ||
                words.charAt(count) == 103 || words.charAt(count) == 104 ||
                words.charAt(count) == 106 || words.charAt(count) == 107 ||
                words.charAt(count) == 108 || words.charAt(count) == 109 ||
                words.charAt(count) == 110 || words.charAt(count) == 112 ||
                words.charAt(count) == 113 || words.charAt(count) == 114 ||
                words.charAt(count) == 115 || words.charAt(count) == 116 ||
                words.charAt(count) == 118 || words.charAt(count) == 119 ||
                words.charAt(count) == 120 || words.charAt(count) == 121 ||
                words.charAt(count) == 122) {
                countConsonant++;
            }
        }
        return countConsonant;
    }
}
