package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class LetterUpper {
    public static void main(String[] args) {
        String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
                           "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                           "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int count = 0;
        String letterView = "";
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a string:  ");
        String word = keyboardInput.nextLine();

        for (int i = 0; i < word.length(); i++) {
              letterView = String.valueOf(word.charAt(i));

            if (letterView.isEmpty())  {
                continue;
            }
            if (letterView.equals(letterView.)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
