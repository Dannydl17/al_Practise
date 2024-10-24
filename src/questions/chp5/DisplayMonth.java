package questions.chp5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class DisplayMonth {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int ordinaryYear = 365;
        int countN = 0;
        int saveNumber = 0;
        int leapYear = 366;
        int num = 0;
        int count = 0;
        int counter = 0;
        int counterN = 0;
        String word = "";
        String words = "";

        String[] months = {"January 1,", "February 1,", "March 1,", "April 1,", "May 1,",
                           "June 1,", "July 1,", "August 1,", "September 1,", "October 1,",
                           "November 1,", "December 1,"};
        int [] numberOfOrdinaryYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int [] numberOfLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] daysOfTheW = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Enter the year: ");
        int numberOfYear = keyboardInput.nextInt();

        System.out.println("Enter the first day of the year:  ");
        int noFirstDay = keyboardInput.nextInt();


        int nums = checkNumber(numberOfYear);

        saveNumber = noFirstDay;

        if (nums == ordinaryYear) {
            words = months[count];
            word = daysOfTheW[saveNumber];
            System.out.printf("%s  %s %s  %s%n", words, numberOfYear, " is ", word);
            count++;


                while (count >= 1 && count < 11) {
                    if (count == 9){
                        System.out.println(" ...");
                    }
                    counter = numberOfOrdinaryYear[countN];
                    saveNumber = (saveNumber + counter) % 7;
                    count++;
                    countN++;
                }
                words = months[count];
                counterN = numberOfOrdinaryYear[countN];
                saveNumber = (saveNumber + counterN) % 7;
                word = daysOfTheW[saveNumber];

                System.out.printf("%s  %s %s  %s%n", words, numberOfYear, " is ", word);
        }

        if (nums == leapYear) {
            words = months[count];
            word = daysOfTheW[saveNumber];
            System.out.printf("%s  %s %s  %s%n", words, numberOfYear, " is ", word);
            count++;

            while (count >= 1 && count < 12) {
                words = months[count];
                counter = numberOfLeapYear[countN];
                saveNumber = (saveNumber + counter) % 7;
                word = daysOfTheW[saveNumber];

                System.out.printf("%s  %s %s  %s%n", words, numberOfYear, " is ", word);
                countN++;
                count++;
            }
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
