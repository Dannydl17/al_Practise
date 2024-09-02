package questions.chp5;

public class TwoTableOfMilesNdKilo {
    public static void main(String[] args) {
        double nums = 1.609;
        int countMilesToKilo = 1;
        int countKiloToMiles = 20;

        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s             %5s    %4s       %4s         %4s%n", "Miles", "Kilogram", "|", "Kilogram", "Miles");
        }

        for (int count = 1; count < 5; count++) {
            while (countMilesToKilo > 2 && countMilesToKilo < 9){
                if (countMilesToKilo == 8){
                    System.out.println(" ...");
                }
                countMilesToKilo+=1;
            }
            double result = countMilesToKilo * nums;
            System.out.printf("%4d                 %4.3f", countMilesToKilo,result);
            System.out.print("       |");
            while (countKiloToMiles > 25 && countKiloToMiles < 60){
                if (countKiloToMiles == 55) {
//                        continue;
                }
                countKiloToMiles+=5;
            }
            double result1 = countKiloToMiles / nums;
            System.out.printf("       %4d             %4.3f%n", countKiloToMiles,result1);
            countKiloToMiles+=5;
            countMilesToKilo+=1;
        }
    }
}
