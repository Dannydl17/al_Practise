package questions.chp6;

public class PrimeNumMethod {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        int NUMBER_OF_PRIMES_PER_LINE = 10;

        while (number < 10000){
              if (isPrime(number)){
                  count++;
                  if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                      System.out.printf("%-5s\n", number);
                  }
                  else {
                      System.out.printf("%-5s", number);
                  }
              }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
         return true;
    }

}
