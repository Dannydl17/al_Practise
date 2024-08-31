package questions.chp5;

public class KilogramToPound {
    public static void main(String[] args) {
        double nums = 2.2;

        System.out.println("Kilograms               Pound");

        for (int count = 1; count < 200; count+=2) {
            while (count > 3 && count < 196){
                if (count == 195){
                    System.out.println("  ...");
                }
                count+=2;
            }
            double result = count * nums;
            System.out.printf("%4d                    %4.1f%n", count,result);
        }
    }
}
