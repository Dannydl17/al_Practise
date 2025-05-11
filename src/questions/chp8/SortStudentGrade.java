package questions.chp8;

public class SortStudentGrade {
    public static int[] canReturnTheAnswerToQuestion(char[][] elements, char[] keys) {
        int[] result = new int[elements.length];

        int count = 0;
        int counter = 0;
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

    public static int[] canReturnNewStudentPositionFromGrade(int[] results, int[] result) {
        int[]newResult = new int[result.length];

        int[]newR = new int[results.length];

        int counter = 0;
        for (int count = 0; count < results.length; count++) {
             newR[counter] = results[count];
             counter++;
        }

        int[] colNums = canSortStudentAnswer(results);

        int count = 0;
        for (int i = 0; i < colNums.length; i++) {
            for (int j = 0; j < newR.length; j++) {
                if (colNums[i]== newR[j]) {
                    newResult[count] = j;
                    count++;
                }
            }
        }
        return newResult;
    }
}
