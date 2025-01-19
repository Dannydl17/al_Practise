package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class NumberOfLettersOccurrence {
    public static void main(String[] args) {
        int countNumber = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter a string of word:  ");
        String words = keyboardInput.nextLine();

        System.out.print("Enter the element of occurrence:  ");
        String word = keyboardInput.next();

        char letter = word.charAt(0);
        countNumber = canCountNumberOfOccurrence(words, letter);

        System.out.println("The number of occurrence is: " + countNumber);
    }
    public static int canCountNumberOfOccurrence(String word, char element) {
        int countNum = 0;
        for (int count = 0; count < word.length(); count++) {
            if (word.charAt(count) == element) {
                countNum++;
            }
        }
        return countNum;
    }
}
