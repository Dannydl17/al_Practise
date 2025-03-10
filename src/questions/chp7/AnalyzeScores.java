package questions.chp7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class AnalyzeScores {
    public static void main(String[] args) {
        int averageNum = 50;
        int numberOfScoreAboveTheAverage = 0;
        int numberOfScoreBelowTheAverage = 0;
        ArrayList<Integer> collectScore = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);


        System.out.print("Enter score or enter -1 to break: ");
        int numberOfScore = keyboardInput.nextInt();
        collectScore.add(numberOfScore);


        while (numberOfScore != -1){
            System.out.print("Enter score or enter -1 to break: ");
            numberOfScore = keyboardInput.nextInt();

            if (numberOfScore == -1) {
                int[]num = convertToArray(collectScore);
                numberOfScoreAboveTheAverage = canKnowTheNumberOfScoresAboveTheAverage(averageNum, num);
                numberOfScoreBelowTheAverage = canKnowTheNumberOfScoresBelowTheAverage(averageNum, num);
            }
            else {
                collectScore.add(numberOfScore);
            }
        }
        System.out.print(numberOfScoreAboveTheAverage);
        System.out.print(numberOfScoreBelowTheAverage);
    }

    public static int[] convertToArray(ArrayList<Integer> collectScore) {
        int[] result = new int[collectScore.size()];
        for (int count = 0; count < collectScore.size(); count++) {
             result[count] = collectScore.get(count);
        }
        return result;
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
