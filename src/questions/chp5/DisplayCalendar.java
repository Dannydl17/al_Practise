package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        int ordinaryYear = 365;
        int num = 0;
        int number = 0;
        int numCount = 1;
        int countN = 0;

        int saveNumber = 0;
        int result = 0;
        int countNum = 1;
        int countNumb = 0;
        String word = "";
        String words = "";
        String wordD = "";
        int count = 0;
        int counter = 0;


        String[] months = {"January ", "February ", "March ", "April ", "May  ",
                "June  ", "July  ", "August ", "September ", "October ",
                "November  ", "December  "};
        String[] daysOfTheW = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
        String[] daysOfTheWe = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
        int[] numberOfOrdinaryYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the year: ");
        int numberOfYear = keyboardInput.nextInt();

        System.out.println("Enter the first day of the year:  ");
        int noFirstDay = keyboardInput.nextInt();

        int nums = checkNumber(numberOfYear);

        saveNumber = noFirstDay;
        if (nums == ordinaryYear) {
            word = months[count];
            words = daysOfTheW[saveNumber];
            countNumb = numberOfOrdinaryYear[count];
            System.out.println("           " + word + numberOfYear);
            System.out.println("————————————————————————————————————");
            for (int i = 0; i < daysOfTheWe.length; i++) {
                System.out.print(daysOfTheWe[i]);
                System.out.print("  ");
            }
            System.out.println();

            wordD = daysOfTheWe[result];
            while (result != saveNumber) {
                result++;
                System.out.format("     %s","");

            }


            System.out.print(" ");


            while (result == saveNumber) {
                System.out.print(countNum);
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");

                while (countNum <= countNumb){
                    if (countNum <= 5) {
                        countNum++;
                        System.out.format(" %d",countNum);
                        for (int i = 1; i < 2; i++) {
                            System.out.print("  ");
                        }
                        System.out.print(" ");
                    }
                    if (countNum == 5) {
                        System.out.println();
                        countNum++;
                    }

                    if (countNum >= 6 && countNum <= 12) {
                        System.out.format("%d" ,countNum);
                        System.out.print("  ");
                        System.out.print("  ");
                        countNum++;
                    }
                    if (countNum == 12 ) {
                        System.out.format("%d" ,countNum);
                        System.out.println();
                        countNum++;
                    }

                    if (countNum >= 13 && countNum <= 19) {
                        System.out.format("%d" ,countNum);
                        System.out.print("  ");
                        System.out.print(" ");
                        countNum++;
                    }
                    if (countNum == 19 ) {
                        System.out.format("%d" ,countNum);
                        System.out.println();
                        countNum++;
                    }

                    if (countNum >= 20 && countNum <= 26) {
                        System.out.format("%d" ,countNum);
                        System.out.print("  ");
                        System.out.print(" ");
                        countNum++;
                    }
                    if (countNum == 26 ) {
                        System.out.format("%d" ,countNum);
                        System.out.println();
                        countNum++;
                    }

                    if (countNum >= 27 && countNum <= 31) {
                        System.out.format("%d" ,countNum);
                        System.out.print("  ");
                        System.out.print(" ");
                        countNum++;
                    }
                }
                result++;
            }
            System.out.println();
            count++;
            result = 0;
            System.out.println();


            while (count >= 1 && count < 11) {
                System.out.println();
                word = months[count];
                System.out.println("           " + word + numberOfYear);
                System.out.println("————————————————————————————————————");
                for (int i = 0; i < daysOfTheWe.length; i++) {
                    System.out.print(daysOfTheWe[i]);
                    System.out.print("  ");
                }

                counter = numberOfOrdinaryYear[countN];
                saveNumber = (saveNumber + counter) % 7;
                words = daysOfTheW[saveNumber];
                wordD = daysOfTheWe[result];
                count++;
            }




//            for (int i = 1; i <=countNumb; i++) {
////                System.out.printf("%1d", i);
////                System.out.print("     ");
//                if (i <= 5) {
//                    System.out.printf("%1d", i);
//                    System.out.print("     ");
//                }
//                if (i == 5) {
//                    System.out.println();
//                }
//
//                if (i > 5 && i <= 12) {
//                    if (i > 9 && i <= 12) {
//                    }
//                    System.out.printf(" %1d", i);
//
//                    for (int numb = 1; numb <=4; numb++) {
//                        System.out.print(" ");
//                    }
//                }
//
////                if (i == 19) {
////                    System.out.println();
////                    System.out.print(" ");
////
////                }
////                if (i == 26) {
////                    System.out.println();
////                    System.out.print(" ");
////                }

        }
    }

    private static int checkNumber(int numberOfYear) {
        int year = 0;

        if (numberOfYear % 4 == 0) {
            year = 366;
        }
        else {
            year = 365;
        }
        return year;
    }
}
