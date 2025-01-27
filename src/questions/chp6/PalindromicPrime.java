package questions.chp6;

public class PalindromicPrime {
    public static void main(String[] args) {
      int NUMBER_OF_PALINDROMIC_PRIME_PER_LINE = 10;
      int number = 2;
      int cN = 0;
      int cAN = 0;
      int count = 0;
      int cNumber = 1;
      int countN = 0;
      count = palindromeNumber(number);


        for (int counter = 1; counter <=count; counter++) {
            if (count % counter == 0) {
                countN++;
            }
        }

        if (countN == 2) {
            System.out.print("  " +count);
            cAN+=1;
        }
        number+=1;
        cN+=1;

        while (cNumber < 1000){
            count = palindromeNumber(number);
            countN = 0;
            for (int counter = 1; counter <=count; counter++) {
                if (count % counter == 0) {
                    countN++;
                }
            }
            if (countN == 2) {
                System.out.print("  " +count);
                cAN+=1;
            }
            number+=1;
            cNumber++;
            cN+=1;

            if (number == 192 && cAN <= NUMBER_OF_PALINDROMIC_PRIME_PER_LINE) {
                System.out.println();
            }
        }
        for (int index = 0; index < 1; index++) {
            System.out.println();
            System.out.print("  ...");
        }

    }

    public static int palindromeNumber(int number){
        int remainder = 0;
        int total = 0;
        int rNumber = 0;
        int nCollected = number;

        while (number > 0){
            remainder = number % 10;
            total = (total * 10) + remainder;
            number = number / 10;
        }
        if (nCollected == total) {
            rNumber = nCollected;
        }
        return rNumber;
    }
}
