package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class CountLetters {

    public static void main(String[] args) {
        int result = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a string of word:  ");
        String word = keyboardInput.nextLine();

        result = countLetters(word);

        System.out.println("The number of letters is:  " + result);
    }
    public static int countLetters(String letter){
         char pickLetters = 0;
         int countLetters = 0;

        for (int count = 0; count < letter.length(); count++) {
               pickLetters = letter.charAt(count);


            if (pickLetters == 'A' || pickLetters == 'B' ||
                pickLetters == 'C' || pickLetters == 'D' ||
                pickLetters == 'E' || pickLetters == 'F' ||
                pickLetters == 'G' || pickLetters == 'H' ||
                pickLetters == 'I' || pickLetters == 'J' ||
                pickLetters == 'K' || pickLetters == 'L' ||
                pickLetters == 'M' || pickLetters == 'N' ||
                pickLetters == 'O' || pickLetters == 'P' ||
                pickLetters == 'Q' || pickLetters == 'R' ||
                pickLetters == 'S' || pickLetters == 'T' ||
                pickLetters == 'U' || pickLetters == 'V' ||
                pickLetters == 'W' || pickLetters == 'X' ||
                pickLetters == 'Y' || pickLetters == 'Z') {
                countLetters++;
            }

            if (pickLetters == 'a' || pickLetters == 'b' ||
                pickLetters == 'c' || pickLetters == 'd' ||
                pickLetters == 'e' || pickLetters == 'f' ||
                pickLetters == 'g' || pickLetters == 'h' ||
                pickLetters == 'i' || pickLetters == 'j' ||
                pickLetters == 'k' || pickLetters == 'l' ||
                pickLetters == 'm' || pickLetters == 'n' ||
                pickLetters == 'o' || pickLetters == 'p' ||
                pickLetters == 'q' || pickLetters == 'r' ||
                pickLetters == 's' || pickLetters == 't' ||
                pickLetters == 'u' || pickLetters == 'v' ||
                pickLetters == 'w' || pickLetters == 'x' ||
                pickLetters == 'y' || pickLetters == 'z') {
                countLetters++;
            }
        }
        return countLetters;
    }
}
