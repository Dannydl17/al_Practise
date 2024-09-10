package questions.chp5;

public class PyramidPattern {

    public static void main(String[] args) {
        int rows = 8;

        for (int i = 0; i < rows; i++) {
            for (int j = 0;
                 j < (rows - i - 1) * 3;
                 j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 0;
                 j <= i;
                 j++) {
                System.out.printf("%3d ", num);
                num *= 2;
            }


            num /= 4;
            for (int j = 0;
                 j < i;
                 j++) {
                System.out.printf("%3d ", num);
                num /= 2;
            }

            System.out.println();
        }
    }
}
