package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class LetterUpper {
    public static void main(String[] args) {
        int count = 0;
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a string:  ");
        String word = keyboardInput.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }

    public static int canCountUpperCaseLetter(String words) {
        int count = 0;
        for (int counter = 0; counter < words.length(); counter++) {
            if(Character.isUpperCase(words.charAt(counter))){
                count++;
            }
        }
        return count;
    }

    public static int canCountLowerCaseLetter(String words) {
        int count = 0;
        for (int counter = 0; counter < words.length(); counter++) {
            if(Character.isLowerCase(words.charAt(counter))){
                count++;
            }
        }
        return count;
    }
}
