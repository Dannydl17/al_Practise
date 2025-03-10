package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);


        System.out.print("Enter score or enter -1 to break");
        int numberOfScore = keyboardInput.nextInt();


        while (numberOfScore != -1){
            System.out.print("Enter score or enter -1 to break");
            numberOfScore = keyboardInput.nextInt();
        }
    }

    public static int canKnowTheNumberOfScoresAboveTheAverage(int averageNumber, int... elements) {
        int count = 0;

        for (int counter = 0; counter < elements.length; counter++) {
            if (elements[counter] >= averageNumber) {
                   count++;
            }
        }
        return count;
    }

    public static int canKnowTheNumberOfScoresBelowTheAverage(int averageNumber, int ...num) {
        int count = 0;
        for (int counter = 0; counter < num.length; counter++) {
                if (num[counter] <= averageNumber) {
                    count++;
                }
            }
            return count;
    }
}
