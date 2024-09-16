package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class DisplayMonth {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int number = 4;
        int counter = 0;
        String numsN = "";
        int countN = 0;
        int countR = 0;
        int countL = 0;


        System.out.println("Enter the year: ");
        int numberOfYear = keyboardInput.nextInt();

        System.out.println("Enter the first day of the year:  ");
        int noFirstDay = keyboardInput.nextInt();

        int nums = checkNumber(numberOfYear, number);

        numsN = String.valueOf(noFirstDay);

        for (int count = 0; count < numsN.length(); count++) {
              countN++;
        }

        if (countN == 2) {
            countR = noFirstDay / 7;
            countL = noFirstDay % 7;
        }

        while (counter != nums){

        }

//        switch (){
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//        }
    }

    private static int checkNumber(int numberOfYear, int nums) {
        int year = 0;

        if (numberOfYear % nums == 0) {
             year = 366;
        }
        else {
            year = 365;
        }
        return year;
    }
}
