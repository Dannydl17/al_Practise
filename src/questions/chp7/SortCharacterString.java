package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class SortCharacterString {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter a String: ");
        String words = keyboardInput.nextLine();

        String newArrangeWord = sort(words);
        System.out.println(newArrangeWord);
    }

    public static char[] canReturnACharArray(String elements) {
        char[] results = new char[elements.length()];

        for (int count = 0; count < elements.length(); count++) {
               results[count] = elements.charAt(count);
        }
        return results;
    }

    public static char[] canBeSorted(char[] elements) {
        char[] results = new char[elements.length];

        for (int count = 0; count < elements.length;) {
               char letter = elements[count];
               int counter;
            for (counter = count + 1; counter < elements.length; counter++) {
                  if (letter > elements[counter])break;
            }
            if (counter == elements.length) {
                results[count] = letter;
                count++;
            }
            else {
                char temp = elements[counter];
                elements[counter] = letter;
                elements[count] = temp;
            }
        }
        return results;
    }

    public static String sort(String word) {
        char[] results = canReturnACharArray(word);
        results = canBeSorted(results);

        String newWord = "";
        for (int count = 0; count < results.length; count++) {
                newWord += String.valueOf(results[count]);
        }
        return newWord;
    }
}
