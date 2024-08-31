package questions.chp5;

public class TwoTableOfKNdP {
    public static void main(String[] args) {
        double collectNumber = 0.0;
        double numbers = 2.2;

        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s             %5s    %5s       %5s         %5s%n", "Kilogram", "Pound", "|", "Pound", "Kilogram");
        }

        for (int counter = 1; counter <= 5; counter++){
            for (int numberOfColumn = 1; numberOfColumn <= 3; numberOfColumn++) {
                for (int nums = 0; nums < 1; nums++) {
                    for (int count = 1; count < 200; count += 2) {


//                        while (count > 3 && count < 196) {
//                            if (count == 195) {
//                                System.out.println("  ...");
//                            }
//                            count += 2;
//                        }
//                        double result = count * numbers;
//                        System.out.printf("%4d                    %4.1f%n", count, result);
                    }
                }
            }
        }

    }

    private static int checkNumber(int numbers) {
        int count = 0;
         if (numbers > 3 && numbers < 196){
            if (numbers == 195){
                return Integer.parseInt("  ...");
            }
        }
         else {
             count = numbers;
         }
        return count;
    }

    private static double performCalculateNumber(int counter, double numbers) {
        double result = 0.0;
        result = counter * numbers;
        return result;
    }

    private static double performCalculateNumberOne(int counter, double numbers) {
        double resultOne = 0.0;
        resultOne = counter * numbers;
        return resultOne;
    }
}


