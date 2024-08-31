package questions.chp5;

public class MileToKilometers {
    public static void main(String[] args) {
        double nums = 1.609;
        System.out.println("Miles               Kilometers");

        for (int count = 1; count <= 10; count++) {
            while (count > 2 && count < 9){
                if (count == 8){
                    System.out.println(" ...");
                }
                count++;
            }
            double result = count * nums;
            System.out.printf("%3d                    %3.3f%n", count,result);
        }
    }
}
