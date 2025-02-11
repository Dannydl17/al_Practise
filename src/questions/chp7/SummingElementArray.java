package questions.chp7;

public class SummingElementArray {
    public static int canAddAnArrayElement(int[] element) {
        int total = 0;
        for (int count = 0; count < element.length; count++) {
            total += element[count];
        }
        return total;
    }
}
