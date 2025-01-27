package questions.chp6;

public class NonPalindromicPrime {

    public static void main(String[] args) {
        int NUMBER_OF_PALINDROMIC_PRIME_PER_LINE = 10;
        int number = 13;
        int cN = 0;
        int cAN = 0;
        int count = 0;
        int cNumber = 1;
        int countN = 0;
        count = nonPalindromeNumber(number);


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

        while (number < 390){
            count = nonPalindromeNumber(number);
            countN = 0;
            for (int counter = 1; counter <=count; counter++) {
                if (count % counter == 0) {
                    countN++;
                }
            }

            if (number > 17 && number < 31){
                number++;
            }

            if (number > 37 && number < 70){
                number++;
            }

            if (number > 79 && number < 96){
                number++;
            }

            if (number > 97 && number < 106){
                number++;
            }

            if (number > 107 && number < 112){
                number++;
            }

            if (number > 113 && number < 148){
                number++;
            }

            if (number > 157 && number < 166){
                number++;
            }

            if (number > 167 && number < 178){
                number++;
            }

            if (number > 179 && number < 198){
                number++;
            }

            if (number > 199 && number < 310){
                number++;
            }

            if (number > 311 && number < 336){
                number++;
            }

            if (number > 347 && number < 358){
                number++;
            }

            if (number > 359 && number < 388){
                number++;
            }


            if (countN == 2) {
                System.out.print("  " +count);
                cAN+=1;
            }
            number+=1;
            cN+=1;

            if (number == 114 && cAN <= NUMBER_OF_PALINDROMIC_PRIME_PER_LINE) {
                System.out.println();
            }
        }
        for (int index = 0; index < 1; index++) {
            System.out.println();
            System.out.print("  ...");
        }

    }

    public static int nonPalindromeNumber(int num){
        int remainder = 0;
        int total = 0;
        int rNumber = 0;
        int nCollected = num;

        while (num > 0){
            remainder = num % 10;
            total = (total * 10) + remainder;
            num = num / 10;
        }
        if (nCollected != total) {
            rNumber = nCollected;
        }
        return rNumber;
    }
}
