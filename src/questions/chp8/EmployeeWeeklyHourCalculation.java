package questions.chp8;

public class EmployeeWeeklyHourCalculation {
    public static int[] canAddedWeeklyEmployeeHours(int[][] employee) {
        int[]colNumber = new int[employee.length];

        int addNumber = 0;
        int count = 0;

        for (int row = 0; row < employee.length; row++) {
            addNumber = 0;
            for (int column = 0; column < employee[row].length; column++) {
                 addNumber += employee[row][column];
            }
            colNumber[count] = addNumber;
            count++;
        }
        return colNumber;
    }
}
