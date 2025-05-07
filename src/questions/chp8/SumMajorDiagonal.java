package questions.chp8;

public class SumMajorDiagonal {
    public static double canReturnTheSumOfMajorDiagonal(double[][] m) {
        int innerColumn = m[0].length;
        double[] collectNumber = new double[innerColumn];

        int count = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (row == column) {
                    collectNumber[count] = m[row][column];
                    count++;
                }
                if (row != column) {
                    column++;
                    column--;
                }
            }
        }

        double result = doTheAddition(collectNumber);
        return result;
    }

    public static double doTheAddition(double[] number) {
        double r = 0.0;
        for (int i = 0; i < number.length; i++) {
            r += number[i];
        }
        return r;
    }
}
