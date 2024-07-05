package questions.chapTwo;

import java.util.Scanner;

import static java.lang.System.in;

public class CalculateYears {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Please enter the number of minutes: ");
        long minutes = keyboardInput.nextLong();

        long years = minutes / (60 * 24 * 365);

        long days = (minutes % (60 * 24 * 365)) / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

    }
}
