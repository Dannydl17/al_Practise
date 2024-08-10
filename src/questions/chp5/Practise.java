package questions.chp5;

public class Practise {
    public static void main(String[] args) {
//        int sum = 0;
//        int number = 0;
//
//        while (number < 20){
//            number++;
//            sum+=number;
//            if (sum >= 100)
//                break;
//
//        }
//        System.out.println("The number is " + number);
//        System.out.println("The sum is " + sum);

//        int balance = 10;
//        while (true) {
//            if (balance < 9)
//                continue;
//            balance = balance - 9;
//        }
//        System.out.println("Balance is "
//                + balance);

//        int sum = 0;
//        for (int i = 0; i < 4; i++) {
//            if (i % 3 == 0)
//                continue;
//            sum += i;
//        }

//        int i = 0;
//        int sum = 0;
//        while (i < 4) {
//            if (i % 3 == 0)
//             sum += i;
//            i++;
//        }

//        for (int i = 1; i < 4; i++) {
//            for (int j = 1; j < 4; j++) {
//                if (i * j > 2)
//                    break;
//                System.out.print(i * j);
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    continue;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }
}
