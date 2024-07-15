package questions.chp4;

public class TriangleNumber {
    public static int canPrintTriangle(int number) {
        for (int count = 0; count < number; count++) {
            print(count);
        }
        return number;
    }

    private static void print(int count) {
        for (int innerCount = 1; innerCount <= count + 1; innerCount++) {
            System.out.print(innerCount + " ");
        }
        System.out.println();
    }
}
