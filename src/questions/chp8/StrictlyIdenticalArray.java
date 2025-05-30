package questions.chp8;

public class StrictlyIdenticalArray {
    public static boolean canReturnEqualsElements(int[][] m1, int[][] m2) {
        int numberOne = 0;
        int numberTwo = 0;
        int countNum = 0;
        int countNumb = 0;
        int countNums = 0;
        boolean word = false;

        while (countNum != m1.length && countNum != m2.length){
            numberOne = m1[countNum][countNumb];
            numberTwo = m2[countNum][countNumb];

            if (numberOne == numberTwo) {
                countNums++;
            }

            if (numberOne != numberTwo) {
                countNums--;
            }

            countNumb++;

            if (countNumb == m1.length && countNumb == m2.length){
                countNumb = 0;
                countNum++;
            }
        }

        int colLength = m1.length * m2.length;

        if (countNums != colLength) {
            countNums += 1;
        }

        if (countNums == colLength) {
            word = true;
        }
        return word;
    }
}
