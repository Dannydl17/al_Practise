package questions.chp5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ProcessS {

    public static void main(String[] args) {
        String words = "";
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter a string: ");
        String word = keyboardInput.nextLine();

        words = canReturnOddPositionOfString(word);

        System.out.println("The odd position of the string is : " + words);
    }
    public static String canReturnOddPositionOfString(String word) {
        String collectWord = "";
        int countNum = 0;

//        String[] words = new String[word.length()];

        for (int count = 0; count < word.length(); count +=2){
            collectWord += word.charAt(count);
//             words[countNum] = String.valueOf(word.charAt(count));
//             countNum++;
        }
//
//        for (int index = 0; index < words.length; index++){
//            if (index % 2 == 0) {
//                collectWord += words[index];
//            }
//        }
        return collectWord;
    }
}
