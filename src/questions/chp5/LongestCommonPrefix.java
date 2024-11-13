package questions.chp5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String collectWord = "";
        int num = 0;
        int nums = 0;
        int result = 0;
        int numF = 0;
        int numS = 0;
        String wordF = "";
        String wordS = "";
        String collectFWord = "";
        String collectSWord = "";
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the first string:  ");
        String firstWord = keyboardInput.nextLine();

        System.out.println("Enter the second string:  ");
        String secondWord = keyboardInput.nextLine();

        wordF = firstWord.substring(0,1);
        wordS = secondWord.substring(0,1);


        if (wordF.equals(wordS)) {
            collectFWord = String.valueOf(firstWord.charAt(numF));
            collectSWord = String.valueOf(secondWord.charAt(numS));

            if (collectFWord.equals(collectSWord)) {
                collectWord += collectFWord;
            }

            numF++;
            numS++;

            num = firstWord.length();
            nums = secondWord.length();

            if (nums > num) {
                result = nums;
            }
            if (num > nums) {
                result = nums;
            }
            if (num == nums) {
                result = nums;
            }
            while (numF < result){
                collectFWord = String.valueOf(firstWord.charAt(numF));
                collectSWord = String.valueOf(secondWord.charAt(numS));

                if (collectFWord.equals(collectSWord)) {
                    collectWord += collectFWord;
                }
                if (!collectFWord.equals(collectSWord)) {
                    break;
                }
                numF++;
                numS++;
            }
            System.out.println("The common prefix is "+collectWord);
        }
        else {
            System.out.println(firstWord + " and " + secondWord + " have no common Prefix" );
        }

    }

    public static String canReturnCommonPrefix(String firstWord, String secondWord) {
        String collectWord = "";
        int num = 0;
        int nums = 0;
        int result = 0;
        int numF = 0;
        int numS = 0;
        String wordF = "";
        String wordS = "";
        String collectFWord = "";
        String collectSWord = "";


        wordF = firstWord.substring(0,1);
        wordS = secondWord.substring(0,1);


        if (wordF.equals(wordS)) {
            collectFWord = String.valueOf(firstWord.charAt(numF));
            collectSWord = String.valueOf(secondWord.charAt(numS));

            if (collectFWord.equals(collectSWord)) {
                collectWord += collectFWord;
            }

            numF++;
            numS++;

            num = firstWord.length();
            nums = secondWord.length();

            if (nums > num) {
                result = nums;
            }
            if (num > nums) {
                result = nums;
            }
            if (num == nums) {
                result = nums;
            }
            while (numF < result){
                collectFWord = String.valueOf(firstWord.charAt(numF));
                collectSWord = String.valueOf(secondWord.charAt(numS));

                if (collectFWord.equals(collectSWord)) {
                    collectWord += collectFWord;
                }
                if (!collectFWord.equals(collectSWord)) {
                    break;
                }
                numF++;
                numS++;
            }
        }
        return collectWord;
    }

    public static String canReturnEmptyStringInCommonPrefix(String firstWord, String secondWord) {
        String collectWord = "";
        String wordF = "";
        String wordS = "";

        wordF = firstWord.substring(0,1);
        wordS = secondWord.substring(0,1);

        if (wordF != wordS) {
            collectWord = firstWord + " and " + secondWord + " have no common Prefix";
        }
        return collectWord;
    }
}
