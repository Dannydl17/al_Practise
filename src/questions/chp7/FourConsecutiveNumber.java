package questions.chp7;

public class FourConsecutiveNumber {

    public static int isConsecutiveFour(int[] values) {
        int firstNumber = 0;
        int count = 0;
        int firstCount = 0;
        int countValues = 0;

        while (countValues != values.length){
               firstNumber = values[firstCount];

            if (firstNumber == values) {
                 count++;
            }
            firstCount +=1;
            countValues++;
        }
        return 0;
    }
}
