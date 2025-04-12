package questions.chp7;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int[] primeNumbers = canReturnPrimeNumbers(NUMBER_OF_PRIMES, NUMBER_OF_PRIMES_PER_LINE);

    }


    public static int[] canReturnPrimeNumbers(int numberOfPrimes, int numberOfPrimesPerLine){
        int nPrimes = numberOfPrimes;

        int nPrimesPerLine = numberOfPrimesPerLine;

        int[] nums = new int[nPrimes];

        int count = 0;
        int number = 2;

        int newInd = 0;
        while (count < nPrimes){
//            boolean isPrime = true;

////            for (int divisor = 2; divisor <= number / 2; divisor++) {
//                int n = number * number;
//                if (n / number / 2) {
//                    nums[newInd] = number;
//                    newInd++;
//                }
//                n = 0;
//            }
            count++;

            number++;

//            if (isPrime) {
//
//            }
        }
        return nums;
    }
}
