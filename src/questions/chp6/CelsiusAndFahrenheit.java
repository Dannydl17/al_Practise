package questions.chp6;

public class CelsiusAndFahrenheit {

    public static void main(String[] args) {
          double celsiusNo = 40.0;
          double fahrenheitNo = 120.0;
          int counter = 0;
          int counters = 0;
          int counterNS = 0;
          printTable();
        for (int count = 1; count < 3; count++) {
            double r = celsiusToFahrenheit(celsiusNo);
            System.out.printf(" %4.1f                  %4.1f      ", celsiusNo, r);
            for (counter = 0; counter < 1; counter++) {
                System.out.printf("%4s", "|");
            }
            double r1 = fahrenheitToCelsius(fahrenheitNo);
            System.out.printf("       %4.1f             %4.2f%n", fahrenheitNo, r1);
            celsiusNo = celsiusNo - 1.0;
            fahrenheitNo = fahrenheitNo - 10.0;
        }
        while (celsiusNo < 39.0 && celsiusNo >= 33.0) {
            if (celsiusNo == 33.0) {
                System.out.print(" ...");
            }
            celsiusNo = celsiusNo - 1.0;
        }
        while (fahrenheitNo < 110.0 && fahrenheitNo >= 50.0) {
            if (fahrenheitNo == 50.0) {
                System.out.println("   ");
            }
            fahrenheitNo = fahrenheitNo - 10.0;
        }

        for (int counterNu = 1; counterNu < 3; counterNu++) {
             double r = celsiusToFahrenheit(celsiusNo);
             System.out.printf(" %4.1f                  %4.1f   ", celsiusNo, r);
             for (counters = 0; counters < 1; counters++) {
                 System.out.printf("%8s", "   |");
             }
            double r1 = fahrenheitToCelsius(fahrenheitNo);
            System.out.printf("       %4.1f             %6.2f%n", fahrenheitNo, r1);
             celsiusNo = celsiusNo - 1.0;
             fahrenheitNo = fahrenheitNo - 10.0;
        }

    }

    public static void printTable(){
        displayResult();
    }
    public static void displayResult(){
        System.out.printf("%5s             %5s    %4s      %4s         %4s%n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
    }
    public static double celsiusToFahrenheit(double celsius){
       double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = 0.0;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
