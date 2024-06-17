package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class Populations {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the number of years:    ");
        int numberOfYear = keyboardInput.nextInt();

        int secondsNumber = 60 * 60;

        int numberOfHours = secondsNumber * 24;


        int totalNumberAdded = numberOfHours * 365;


        int babyBirth = totalNumberAdded / 7;
        int deathBaby = totalNumberAdded / 13;
        int immigrantBaby = totalNumberAdded / 45;
    }
}
