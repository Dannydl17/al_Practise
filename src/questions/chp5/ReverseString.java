package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class ReverseString {

    public static void main(String[] args) {
        String words = "";
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter a string: ");
        String word = keyboardInput.nextLine();

        words = canReverseString(word);

        System.out.println("The reversed string is: " + words);
    }
    public static String canReverseString(String word) {
        String collectWord = "";
        for (int count = word.length() - 1; count >= 0; count--){
             collectWord += word.charAt(count);
        }
        return collectWord;
    }
}
