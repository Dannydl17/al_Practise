package questions.chp2;

import java.util.Scanner;

import static java.lang.System.in;

public class Populations {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        int secondsNumber = 60 * 60;

        int numberOfHours = secondsNumber * 24;


        int totalNumberAdded = numberOfHours * 365;


        double babyBirth = 1.0 / 7;
        double deathBaby = 1.0 / 13;
        double immigrantBaby = 1.0 / 45;

        long numberOfPeople =  312032486;

        long births = (long) (totalNumberAdded * babyBirth);
        long deaths = (long) (totalNumberAdded * deathBaby);
        long immigrants = (long) (totalNumberAdded * immigrantBaby);

        System.out.println("Enter the number of years:  ");
        int numberOfYears = keyboardInput.nextInt();

        long oneYearPeople = births - deaths + immigrants;
        long totalOneYear = oneYearPeople * numberOfYears;
        long total = numberOfPeople + totalOneYear;

        System.out.println("The population in "+ numberOfYears + " years is " + total);
    }
}
