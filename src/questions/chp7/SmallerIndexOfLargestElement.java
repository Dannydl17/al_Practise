package questions.chp7;

public class SmallerIndexOfLargestElement {
    public static int canReturnSmallerIndexOfLargestElement(int[] elements) {
        int max = elements[0];
        int indexOfMax = 0;
        for (int count = 1; count < elements.length; count++) {
            if (elements[count] > max) {
                max = elements[count];
                indexOfMax = count;
            }
        }
        return indexOfMax;
    }
}
