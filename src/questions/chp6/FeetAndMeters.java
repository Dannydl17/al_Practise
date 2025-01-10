package questions.chp6;

public class FeetAndMeters {
    public static void main(String[] args) {
       double numsFeet = 1.0;
       double numsMeters = 20.0;
       int counter = 0;
       int counters = 0;
       printTable();
        for (int count = 1; count <= 2; count++) {
             double metersR = footToMeter(numsFeet);
             System.out.printf(" %4.1f                %4.3f      ", numsFeet, metersR);
            for (counter = 0; counter < 1; counter++) {
                System.out.printf("%5s", "|");
            }
            double footR = meterToFoot(numsMeters);
            System.out.printf("       %4.1f             %4.3f%n", numsMeters, footR);
            numsFeet = numsFeet + 1.0;
            numsMeters = numsMeters + 5.0;
        }

        while (numsFeet > 2.0 && numsFeet < 9.0) {
            if (numsFeet == 8.0) {
                System.out.print(" ...");
            }
            numsFeet = numsFeet + 1.0;
        }
        while (numsMeters > 25.0 && numsMeters < 60.0) {
            if (numsMeters== 55.0) {
                System.out.println("   ");
            }
            numsMeters = numsMeters + 5.0;
        }

        for (int counterNu = 1; counterNu < 3; counterNu++) {
            double metersR = footToMeter(numsFeet);
            System.out.printf(" %4.1f                %4.3f      ", numsFeet, metersR);

            for (counters = 0; counters < 1; counters++) {
                System.out.printf("%5s", "   |");
            }

            double footR = meterToFoot(numsMeters);
            System.out.printf("       %4.1f             %4.3f%n", numsMeters, footR);
            numsFeet = numsFeet + 1.0;
            numsMeters = numsMeters + 5.0;
        }
    }

    public static void printTable(){
        displayResult();
    }
    public static void displayResult(){
        System.out.printf(" %5s               %5s      %4s      %4s         %7s%n", "Feet", "Meters", "|", "Meters", "Feet");
    }
    public static double footToMeter(double foot){
        double metersR =  0.305 * foot;
        return metersR;
    }
    public static double meterToFoot(double meter){
        double footR = 3.279 * meter;
        return footR;
    }
}
