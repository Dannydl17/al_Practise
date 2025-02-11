package questions.chp7;

public class RandomShuffling {
    public static int[] canReturnRandomShuffling(int[] elements) {
        for (int count = elements.length - 1; count > 0; count--) {
            int j = (int)(Math.random() * (count + 1));
            double temp = elements[count];
            elements[count] = elements[j];
            elements[j] = (int) temp;
        }
        return elements;
    }
}
