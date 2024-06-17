package questions.chapTwo;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        int numberOfSeconds = 60 * 60;

        int numberOfHours = numberOfSeconds * 24;


        int totalNumberAdded = numberOfHours * 365;


        int babyBirth = totalNumberAdded / 7;
        int deathBaby = totalNumberAdded / 13;
        int immigrantBaby = totalNumberAdded / 45;


        int numberOfPeople =  312032486;

        int oneYearPeople = numberOfPeople + babyBirth - deathBaby + immigrantBaby;
        int twoYearPeople = oneYearPeople + babyBirth - deathBaby + immigrantBaby;
        int threeYearPeople = twoYearPeople + babyBirth - deathBaby + immigrantBaby;
        int fourYearPeople = threeYearPeople + babyBirth - deathBaby + immigrantBaby;
        int fiveYearPeople = fourYearPeople + babyBirth - deathBaby + immigrantBaby;

        System.out.println("Year one is: " + oneYearPeople);
        System.out.println("Year two is: " + twoYearPeople);
        System.out.println("Year three is: " + threeYearPeople);
        System.out.println("Year four is: " + fourYearPeople);
        System.out.println("Year five is: " + fiveYearPeople);
    }
}
