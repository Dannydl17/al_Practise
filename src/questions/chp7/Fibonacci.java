package questions.chp7;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
//        int[] numbers = new int[10];
//        for (int count = 0; count < numbers.length; count++) {
//            if (count == 1) {
//                numbers[count] = 1;
//            }
//            if (count > 1) {
//                numbers[count] = numbers[count - 1] + numbers[count - 2];
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        int x = 5;
//        while (x > 0) {
//            System.out.print(x + " ");
//            x--;
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + " ");
//            i=i+1;
//        }

        int sum = 0;
        for (int i = 0; i <= 10; i += 2) {
            sum += i;
            System.out.println(sum);
        }

    }
}
