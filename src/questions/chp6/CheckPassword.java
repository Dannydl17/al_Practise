package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class CheckPassword {
    public static void main(String[] args) {
        char pickLetter;
        int counterU = 0;
        int counterL = 0;
        int counterD = 0;
        int result = 0;
        String resultS = "";
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter a password:  ");
        String password = keyboardInput.nextLine();

        for (int count = 0; count < password.length(); count++) {
              pickLetter = password.charAt(count);

            if(pickLetter == 'A' || pickLetter == 'B' ||
               pickLetter == 'C' || pickLetter == 'D' ||
               pickLetter == 'E' || pickLetter == 'F' ||
               pickLetter == 'G' || pickLetter == 'H' ||
               pickLetter == 'I' || pickLetter == 'J' ||
               pickLetter == 'K' || pickLetter == 'L' ||
               pickLetter == 'M' || pickLetter == 'N' ||
               pickLetter == 'O' || pickLetter == 'P' ||
               pickLetter == 'Q' || pickLetter == 'R' ||
               pickLetter == 'S' || pickLetter == 'T' ||
               pickLetter == 'U' || pickLetter == 'V' ||
               pickLetter == 'W' || pickLetter == 'X' ||
               pickLetter == 'Y' || pickLetter == 'Z'){
                counterU++;
            }

            if(pickLetter == 'a' || pickLetter == 'b' ||
               pickLetter == 'c' || pickLetter == 'd' ||
               pickLetter == 'e' || pickLetter == 'f' ||
               pickLetter == 'g' || pickLetter == 'h' ||
               pickLetter == 'i' || pickLetter == 'j' ||
               pickLetter == 'k' || pickLetter == 'l' ||
               pickLetter == 'm' || pickLetter == 'n' ||
               pickLetter == 'o' || pickLetter == 'p' ||
               pickLetter == 'q' || pickLetter == 'r' ||
               pickLetter == 's' || pickLetter == 't' ||
               pickLetter == 'u' || pickLetter == 'v' ||
               pickLetter == 'w' || pickLetter == 'x' ||
               pickLetter == 'y' || pickLetter == 'z'){
                counterL++;
            }

            if (pickLetter == '0' || pickLetter == '1' ||
                pickLetter == '2' || pickLetter == '3' ||
                pickLetter == '4' || pickLetter == '5' ||
                pickLetter == '6' || pickLetter == '7' ||
                pickLetter == '8' || pickLetter == '9') {
                   counterD++;
            }

        }
        result = counterU + counterL + counterD;


        if (result == 8){
            resultS = checkPassWord(password);
        }

        if (result != 8){
            resultS = checkPassWord(password);
        }


//        if (result != 8){
//            System.out.println("Sorry your password must be at least 8 ");
//            System.out.println("Would you like to try again yes  or no");
//            String response = keyboardInput.next();
//
//            if (response == "yes") {
//                System.out.println("Enter a password:  ");
//                password = keyboardInput.nextLine();
//
//                for (int count = 0; count < password.length(); count++) {
//                    pickLetter = password.charAt(count);
//
//                    if(pickLetter == 'A' || pickLetter == 'B' ||
//                       pickLetter == 'C' || pickLetter == 'D' ||
//                       pickLetter == 'E' || pickLetter == 'F' ||
//                       pickLetter == 'G' || pickLetter == 'H' ||
//                       pickLetter == 'I' || pickLetter == 'J' ||
//                       pickLetter == 'K' || pickLetter == 'L' ||
//                       pickLetter == 'M' || pickLetter == 'N' ||
//                       pickLetter == 'O' || pickLetter == 'P' ||
//                       pickLetter == 'Q' || pickLetter == 'R' ||
//                       pickLetter == 'S' || pickLetter == 'T' ||
//                       pickLetter == 'U' || pickLetter == 'V' ||
//                       pickLetter == 'W' || pickLetter == 'X' ||
//                       pickLetter == 'Y' || pickLetter == 'Z'){
//                        counterU++;
//                    }
//
//                    if(pickLetter == 'a' || pickLetter == 'b' ||
//                       pickLetter == 'c' || pickLetter == 'd' ||
//                       pickLetter == 'e' || pickLetter == 'f' ||
//                       pickLetter == 'g' || pickLetter == 'h' ||
//                       pickLetter == 'i' || pickLetter == 'j' ||
//                       pickLetter == 'k' || pickLetter == 'l' ||
//                       pickLetter == 'm' || pickLetter == 'n' ||
//                       pickLetter == 'o' || pickLetter == 'p' ||
//                       pickLetter == 'q' || pickLetter == 'r' ||
//                       pickLetter == 's' || pickLetter == 't' ||
//                       pickLetter == 'u' || pickLetter == 'v' ||
//                       pickLetter == 'w' || pickLetter == 'x' ||
//                       pickLetter == 'y' || pickLetter == 'z'){
//                        counterL++;
//                    }
//
//                    if (pickLetter == '0' || pickLetter == '1' ||
//                        pickLetter == '2' || pickLetter == '3' ||
//                        pickLetter == '4' || pickLetter == '5' ||
//                        pickLetter == '6' || pickLetter == '7' ||
//                        pickLetter == '8' || pickLetter == '9') {
//                        counterD++;
//                    }
//
//                }
//
//                result = counterU + counterL + counterD;
//
//                if (result == 8){
//                    checkPassWord(password);
//                }
//
//            }
//            if (response.equals("no")) {
//                System.out.println("Thanks for trying this app");
//            }
//        }
        System.out.println("The password is a " +resultS);
    }

    public static String checkPassWord(String word){
        char pickLetter = 0;
        int countDigit = 0;
        String result = "";

        for (int count = 0; count < word.length(); count++) {
            pickLetter = word.charAt(count);

            if (pickLetter == '0' || pickLetter == '1' ||
                pickLetter == '2' || pickLetter == '3' ||
                pickLetter == '4' || pickLetter == '5' ||
                pickLetter == '6' || pickLetter == '7' ||
                pickLetter == '8' || pickLetter == '9') {
                countDigit++;
            }
        }
        if (countDigit == 2) {
            result = "Valid password";
        }
        if (countDigit != 2) {
            result = "Invalid password";
        }

        return result;
    }
}
