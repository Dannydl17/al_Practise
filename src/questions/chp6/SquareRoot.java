package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an approximated integer:  ");
        long n = keyboardInput.nextLong();

        System.out.println(Math.sqrt(35));
        System.out.println(sqrt(n));
   }
   public static double sqrt(long n){
       double nextGuess = 0.0;
       double lastGuess = 1.0;
       double num = 0.0001;
        while (num != lastGuess) {
            nextGuess = (lastGuess + n / lastGuess) / 2;

            if(nextGuess == lastGuess){
                return nextGuess;
            }

//            if(nextGuess - lastGuess == num){
//                return nextGuess;
//            }

            lastGuess = nextGuess;
        }
        return nextGuess;
   }
}


