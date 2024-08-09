package questions.chp5;

public class MultiplicationTable {
    public static void main(String[] args) {
//        System.out.println("        Multiplication Table");
//        System.out.print(" ");
//
//        for (int j = 1; j <=9; j++)
//            System.out.print("    " + j);
//        System.out.println("\n———————————————————————————————————————");
//
//            for (int i = 1; i <= 9; i++) {
//                System.out.print(i + "  |  ");
//                for (int j = 1; j <=9; j++) {
//                    System.out.printf("%4d", i * j);
//                }
//                System.out.println();
//            }

//        for (int i = 0; i < 10000; i++)
//            for (int j = 0; j < 10000; j++)
//                for (int k = 0; k < 10000; k++)
//                    System.out.println("We are in class today ");
//         int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            for (int j = 0;
//                 j < i;
//                 j++) {
//                sum = i * j;
//                System.out.print(sum);
//            }
//            System.out.println();
//        }

//        for (int i = 1; i < 5; i++) {
//            int j = 0;
//            while (j < i) {
//                System.out.print(j + " ");
//                j++;
//            }
//        }

//        int i = 0;
//        while (i < 5) {
//            for (int j = i; j > 1; j--)
//                System.out.print(j + " ");
//            System.out.println("****");
//            i++;
//        }

//        int i = 5;
//        while (i >= 1) {
//            int num = 1;
//            for (int j = 1;
//                 j <= i;
//                 j++) {
//                System.out.print(num + "xxx");
//                num *= 2;
//            }
//            System.out.println();
//            i--;
//        }

        int i = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
