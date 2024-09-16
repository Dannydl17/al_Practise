package questions.chp5;

public class DisplayLeapYear {
    public static void main(String[] args) {
        int number = 4;
        int counter = 0;
        for (int count = 101; count <=2100; count++) {
            if (count % number == 0) {
                System.out.printf("%1d ", count);
                counter++;
            }
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
