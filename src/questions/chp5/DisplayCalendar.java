package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);
        int ordinaryYear = 365;
        int leapYear = 366;
        int num = 0;
        int number = 0;
        int numCount = 1;
        int countN = 0;

        int saveNumber = 0;
        int result = 0;
        int countNum = 1;
        int countNumO = 1;
        int countNumb = 0;
        int countNumbO = 0;
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
        int [] numberOfLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
            count++;
            result = 0;
            System.out.println();


            while (count >= 1 && count < 11) {
                counter = numberOfOrdinaryYear[countN];
                saveNumber = (saveNumber + counter) % 7;
                count++;
                countN++;
            }

            System.out.println();

            word = months[count];
            countNumbO = numberOfOrdinaryYear[count];
            counter = numberOfOrdinaryYear[countN];
            saveNumber = (saveNumber + counter) % 7;
            words = daysOfTheW[saveNumber];

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

            while (result == saveNumber) {
                while (countNumO <= countNumbO) {
                    if (countNumO <= 7) {
                        System.out.print(" ");
                        System.out.print(countNumO);
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        countNumO++;
                    }
                    if (countNumO == 7){
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.format("%d" ,countNumO);
                        System.out.println();
                        countNumO++;
                    }
                    if (countNumO >= 8 && countNumO <= 10){
                        System.out.print(" ");
                       System.out.format("%d " ,countNumO);
                        System.out.print(" ");
                        System.out.print(" ");
                       countNumO++;
                    }
                    if (countNumO >= 11 && countNumO <= 14){
//                        System.out.print(" ");
                       System.out.format("%d " ,countNumO);
                        System.out.print(" ");
                        System.out.print(" ");
                       countNumO++;
                    }
                    if (countNumO == 14){
//                        System.out.print(" ");
                        System.out.format("%d" ,countNumO);
                        System.out.println();
                        countNumO++;
                    }
                    if (countNumO >= 15 && countNumO <= 17){
                        System.out.print(" ");
                        System.out.format("%d " ,countNumO);
                        System.out.print(" ");
//                        System.out.print(" ");
                        countNumO++;
                    }
                    if (countNumO >= 18 && countNumO <= 21){
                        System.out.print(" ");
                        System.out.format("%d " ,countNumO);
                        System.out.print(" ");
                        countNumO++;
                    }
                    if (countNumO == 21){
                        System.out.format("%d" ,countNumO);
                        System.out.println();
                        countNumO++;

                    }

                    if (countNumO >= 22 && countNumO <= 24){
                        System.out.print(" ");
                        System.out.format("%d " ,countNumO);
                        System.out.print(" ");
//                        System.out.print(" ");
                        countNumO++;
                    }

                    if (countNumO >= 25 && countNumO <= 28){
                        System.out.print(" ");
                        System.out.format("%d " ,countNumO);
                        System.out.print(" ");
                        countNumO++;
                    }

                    if (countNumO == 28){
                        System.out.format("%d" ,countNumO);
                        System.out.println();
                        countNumO++;
                    }

                    if (countNumO >= 29 && countNumO <= 31){
                        System.out.print(" ");
                        System.out.format("%d " ,countNumO);
                        System.out.print(" ");
                        countNumO++;
                    }

                }
                result++;
            }
        }

        if (nums == leapYear) {
            word = months[count];
            words = daysOfTheW[saveNumber];
            countNumb = numberOfLeapYear[count];
            System.out.println("           " + word + numberOfYear);
            System.out.println("————————————————————————————————————");
            for (int i = 0; i < daysOfTheWe.length; i++) {
                System.out.print(daysOfTheWe[i]);
                System.out.print("  ");
            }
            System.out.println();

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
