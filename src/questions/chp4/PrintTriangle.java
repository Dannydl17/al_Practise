package questions.chp4;

public class PrintTriangle {
    public static int canPrintTriangle(int number) {
        for (int count = 0; count < number; count++) {
            print(count);
        }
        return number;
    }

    private static void print(int count) {
        for (int innerCount = 1; innerCount <= count; innerCount++) {
            System.out.print(innerCount + " ");
        }
        System.out.println();
    }
}
