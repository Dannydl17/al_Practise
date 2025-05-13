package questions.chp8;

public class SortStudentGrade {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] answerToQuestion = canReturnTheAnswerToQuestion(answers, keys);
        int[] displayAnswer = canReturnNewStudentPositionFromGradeInIncreasingOrder(answerToQuestion);
        int[] sortStudentAnswer = canSortStudentAnswer(answerToQuestion);

        int nums = answerToQuestion.length;

        for (int count = 0; count < nums; count++) {
            System.out.println("Student " + displayAnswer[count] + "'s correct count is " +
                    sortStudentAnswer[count]);
        }
    }
    public static int[] canReturnTheAnswerToQuestion(char[][] elements, char[] keys) {
        int[] result = new int[elements.length];

        int count = 0;
        for (int row = 0; row < elements.length; row++) {
            int correctCount = 0;
            for (int innerCount = 0; innerCount < elements[row].length; innerCount++) {
                if (elements[row][innerCount] == keys[innerCount]) {
                     correctCount++;
                }
            }
            result[count] = correctCount;
            count++;
        }
        return result;
    }

    public static int[] canReturnTheNumberOfStudent(char[][] elements) {
        int[] result = new int[elements.length];

        int count = 0;
        for (int row = 0; row < elements.length; row++) {
             result[count] = row;
             count++;
        }
        return result;
    }

    public static int[] canSortStudentAnswer(int[] result) {
        int[] collectNumber = new int[result.length];

        for (int row = 0; row < result.length;) {
             int nums = result[row];
             int innerIndex = 0;
            for (innerIndex = row + 1; innerIndex < result.length; innerIndex++) {
                   if (nums > result[innerIndex]) break;
            }
            if (innerIndex == result.length) {
                collectNumber[row] = nums;
                row++;
            }
            else {
                int tempo = result[innerIndex];
                result[innerIndex] = nums;
                result[row] = tempo;
            }
        }
        return collectNumber;
    }

    public static int[] canReturnNewStudentPositionFromGradeInIncreasingOrder(int[] results) {
        int[]newResult = new int[results.length];

        int[]newR = new int[results.length];

        storeElements(results, newR);

        int[] colNums = canSortStudentAnswer(results);

        int count = 0;
        for (int counter = 0; counter < colNums.length; counter++) {
            for (int innerCount = 0; innerCount < newR.length; innerCount++) {
                if (colNums[counter]== newR[innerCount]) {
                    newResult[count] = innerCount;
                    count++;
                }
            }
        }
        return newResult;
    }

    public static void storeElements(int[] results, int[] newR) {
        int counter = 0;
        for (int count = 0; count < results.length; count++) {
             newR[counter] = results[count];
             counter++;
        }
    }
}
