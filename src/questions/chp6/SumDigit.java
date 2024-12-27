package questions.chp6;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class SumDigit {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter an integer:  ");
        long nums = keyboardInput.nextInt();

         int result = sumDigits(nums);
        System.out.println(result);
    }

    public static int sumDigits(long nums) {
        int totalNuM = 0;
        ArrayList<Integer> result = new ArrayList<>();
       while (nums != 0){
           int number = (int) (nums % 10);
           result.add(number);
           nums/=10;
       }
        for (int i = 0; i < result.size(); i++) {
            totalNuM = totalNuM + result.get(i);
        }
        return totalNuM;
    }
}
