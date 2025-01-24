package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an approximated integer:  ");
        long n = keyboardInput.nextLong();

        System.out.println(Math.sqrt(7));
        System.out.println(sqrt(n));
   }
   public static double sqrt(long n){
       double nextGuess = 0.0;
       double lastGuess = 1.0;
       double num = 0.0001;
        while (num != lastGuess) {
            nextGuess = (lastGuess + n / lastGuess) / 2;

            if(nextGuess == lastGuess){
                break;
            }

            lastGuess = nextGuess;
        }




//        for (int i = 1; i < 3; i++) {
//            nextGuess =  (lastGuess + n / next));
//            ni = nextGuess / 2;
//            next =  ni;
//        }
//        nextGuess = next;
        return nextGuess;
   }
}


