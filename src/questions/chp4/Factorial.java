package questions.chp4;

public class Factorial {
    public static int canCalculateFactorial(int number) {
        int factorial = 1;
        for (int count = 0; count < number; count++) {
            factorial = factorial * (number - count);

        }
       return factorial;
    }
}
