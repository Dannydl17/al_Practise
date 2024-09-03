package questions.chp5;

public class ForLoopDivisibleNums {
    public static void main(String[] args) {
        int number = 1000;
        int count = 0;

        for (int countNumber = 100; countNumber <= number; countNumber++){
            if (countNumber % 5 == 0 && countNumber % 6 == 0) {
                System.out.printf("%1d ", countNumber);
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
