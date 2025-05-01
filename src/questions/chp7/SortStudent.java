package questions.chp7;

import java.util.Scanner;

import static java.lang.System.in;

public class SortStudent {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.println("Enter the number of student: ");
        int numberOfStudent = keyboardInput.nextInt();

        int index = 0;

        String[] word = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];
        System.out.println("Enter the  students’ names: ");
        String studentName = keyboardInput.next();
        word[index] = studentName;

        System.out.println("Enter the  students’ score: ");
        int studentScore = keyboardInput.nextInt();
        scores[index] = studentScore;
        index++;

        while (index != numberOfStudent){
            System.out.println("Enter the  students’ names: ");
            studentName = keyboardInput.next();
            word[index] = studentName;


            System.out.println("Enter the  students’ score: ");
            studentScore = keyboardInput.nextInt();
            scores[index] = studentScore;

            index++;
        }
        
        String[] cS = new String[numberOfStudent];
        int[] cScore = new int[numberOfStudent];
        int largestNumber = scores[0];
        int indexes = 0;
        for (int count = 1; count < scores.length; count++) {
            int nums = scores[count];
            if (nums > largestNumber) {
                largestNumber = scores[count];
                indexes = count;
            }
        }

        int counts = 0;
        cS[counts] = word[indexes];
        cScore[counts] = scores[indexes];
        scores[indexes] = 0;
        counts++;

        int n = cS.length - 1;
        while (counts <= n) {
            largestNumber = scores[0];
            indexes = 0;
            int counter = 1;
            for (counter = 1; counter < scores.length; counter++) {
                int nums = scores[counter];
                if (nums > largestNumber) {
                    largestNumber = scores[counter];
                    indexes = counter;
                }
            }
            cS[counts] = word[indexes];
            cScore[counts] = scores[indexes];
            scores[indexes] = 0;
            counts++;
        }

        for (int count = 0; count < cS.length; count++) {
            System.out.print(cS[count] + " ");
        }
        System.out.println();
        for (int counter = 0; counter < cScore.length; counter++) {
            System.out.print(cScore[counter] + " ");
        }
    }
    
}
