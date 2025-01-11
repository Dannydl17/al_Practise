package questions.chp6;

public class NumberOfDays {
    public static void main(String[] args) {
        int numberOfYears = 2000;
        int result = 0;

        while (numberOfYears <= 2020){
            result = numberOfDaysInAYear(numberOfYears);
            System.out.println(result);
            numberOfYears++;
        }
    }
    public static int numberOfDaysInAYear(int year){
        int numberOfDays = 0;

        if (year % 4 == 0) {
           numberOfDays = 366;
        }
        else {
          numberOfDays = 365;
        }

        return numberOfDays;
    }
}
