package questions.chp4;

public class Pyramid {
    public static int canPrintPyramid(int number) {
        for (int count = 0; count < number; count++) {
                print(count);
        }
        return number;
    }
    private static void print(int count) {
        for (int innerCount = 0; innerCount < count +1; innerCount++) {
            System.out.print("1" + " ");
        }
        System.out.println();
    }
}

