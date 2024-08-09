package questions.chp5;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        int i;
//        for (i = 20;
//             i >0;
//             i--) {
//            System.out.println("Welcome to Java!");
//        }

//        for (int i = 0,
//             j = 0;
//             i + j < 10;
//             i++, j++) {
//            System.out.println(i +" " + j + " ");
//        }

//        int sum = 0;
//        for (int i = 0;
//             i < 10;
//             ++i) {
//            sum += i;
//        }
//        for (int i = 0;
//             i < 10;
//             i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        Scanner input = new Scanner(System.in);
        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + count);

//        int i;
//        int sum = 0;
//        for (i = 1; sum < 10000 ; i++) {
//             sum = sum + i;
//        }
//        System.out.println(sum);
    }
}
