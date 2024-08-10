package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class StringPalindrome {
    public static void main(String[] args) {
       Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a string: ");
        String s = keyboardInput.nextLine();

        int low = 0;

        int high = s.length() - 1;

        boolean isPalindrome = true;

        while (low < high){
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");

    }
}
