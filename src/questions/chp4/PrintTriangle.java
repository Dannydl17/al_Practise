package questions.chp4;

public class PrintTriangle {
    public static int canPrintTriangle(int number) {
        for (int count = 0; count < number; count++) {
            printAction(count);
        }
        return number;
    }

    private static void printAction(int count) {
        for (int innerCount = 0; innerCount < count +1; innerCount++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}
