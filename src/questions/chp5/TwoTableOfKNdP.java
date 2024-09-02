package questions.chp5;

public class TwoTableOfKNdP {
    public static void main(String[] args) {
        double numbers = 2.2;
        int innerCount = 1;
        int count = 20;

        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s             %5s    %4s       %4s         %4s%n", "Kilogram", "Pound", "|", "Pound", "Kilogram");
        }

        for (int counter = 1; counter < 5; counter ++){

            while (innerCount > 3 && innerCount < 196){
                if (innerCount == 195){
                    System.out.println("  ...");
                }
                innerCount +=2;
            }
            double result = calculateKilogramToPound(innerCount, numbers);
            System.out.printf("%4d                 %4.1f", innerCount,result);
            System.out.print("        |");
                while (count > 25 && count < 510){
                    if (count == 500) {
//                        continue;
                    }
                    count+=5;
                }
                double result1 = calculatePoundToKilogram(count, numbers);
                System.out.printf("       %4d            %4.2f%n", count,result1);
                count+=5;
                innerCount+=2;

        }
    }

    private static double calculateKilogramToPound(int innerCounts, double numbers) {
        double result = innerCounts * numbers;
        return result;
    }

    private static double calculatePoundToKilogram(int count, double numbers) {
        double result1 = count / numbers;
        return result1;
    }

}


