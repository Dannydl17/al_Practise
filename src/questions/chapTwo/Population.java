package questions.chapTwo;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        int numberOfSeconds = 60 * 60;
        int numberOfHours = numberOfSeconds * 24;
        int totalNumberAdded = numberOfHours * 365;


        double babyBirth = 1.0 / 7;
        double deathBaby = 1.0 / 13;
        double immigrantBaby = 1.0 / 45;


        long numberOfPeople =  312032486;

        long births = (long) (totalNumberAdded * babyBirth);
        long deaths = (long) (totalNumberAdded * deathBaby);
        long immigrants = (long) (totalNumberAdded * immigrantBaby);

        long oneYearPeople = numberOfPeople + births - deaths + immigrants;
        System.out.println("Year one is: " + oneYearPeople);
        long twoYearPeople = oneYearPeople + births - deaths + immigrants;
        System.out.println("Year two is: " + twoYearPeople);
        long threeYearPeople = twoYearPeople + births - deaths + immigrants;
        System.out.println("Year three is: " + threeYearPeople);
        long fourYearPeople = threeYearPeople + births - deaths + immigrants;
        System.out.println("Year four is: " + fourYearPeople);
        long fiveYearPeople = fourYearPeople + births - deaths + immigrants;
        System.out.println("Year five is: " + fiveYearPeople);
    }
}
