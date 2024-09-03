package questions.chp5;

public class DivisibleNumber1 {
    public static void main(String[] args) {
          int number = 100;
          int count = 0;

          while (number <= 200){
              if (number % 5 == 0 || number % 6 == 0) {
                  System.out.printf("%1d ", number);
                  count++;
              }
              if (count == 10) {
                  System.out.println();
                  count = 0;
              }
             number++;
          }
    }
}
