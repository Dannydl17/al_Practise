package questions.chp7;

public class LargestNumberInArray {

    public static int canReturnLargestNumberInArray(int[] elements) {
        int maxNumber = elements[0];

        for (int count = 1; count < elements.length; count++) {
            if (elements[count] > maxNumber) {
                maxNumber = elements[count];
            }
        }
        return maxNumber;
    }
}
