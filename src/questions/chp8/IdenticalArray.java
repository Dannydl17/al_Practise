package questions.chp8;

public class IdenticalArray {
    public static boolean canReturnEqualsElements(int[][] m1, int[][] m2) {
        int numberOne = 0;
        int numberTwo = 0;
        int  rowIndex = 0;
        int  columnIndex = 0;
        int countNum = 0;
        boolean word = false;

//        numberOne = m1[rowIndex][columnIndex];

        for (int row = 0; row < m1.length - 2; row++) {
            numberOne = m1[rowIndex][row];
            for (int column = 0; column < m2[row].length - 2; column++) {
                numberTwo = m2[row][column];

                if (columnIndex == column) {
                    if (numberOne == numberTwo) {
                        countNum++;
                    }
                }
            }
        }

        rowIndex++;
//        columnIndex = 0;

//        while (count != elementOne.length){
//            numberOne = elementOne[count];
//
//            for (int rowIndex = 0; rowIndex < elementTwo.length; rowIndex++) {
//                numberTwo = elementTwo[rowIndex];
//
//                if (count == rowIndex) {
//                    if (numberOne == numberTwo) {
//                        countNum++;
//                    }
//                }
//            }
//            count++;
//        }
//
//        if (countNum == elementTwo.length) {
//            word = true;
//        }
//        return word;
        return false;
    }
}
