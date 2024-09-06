package questions.chp5;

public class DisplayPatterns {

    public static void main(String[] args) {
        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s             %5s        %5s         %5s%n", "Pattern A", "Pattern B ", "Pattern C", "Pattern D");
        }

        for (int count = 1; count <= 6; count++) {
            for (int innerCount = 1; innerCount <= count; innerCount++) {
                System.out.print(innerCount + " ");
            }
            for (int innerCount = 1; innerCount <= 6 - count; innerCount++) {
                System.out.print(innerCount + " ");
            }
            System.out.println();
        }
    }
}
