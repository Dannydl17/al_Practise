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

    public static int[] canSortNumberFromDecreasingOrder(int[] addNumber) {
        int[]colNumber = new int[addNumber.length];

        for (int row = 0; row < addNumber.length;) {
             int nums = addNumber[row];
             int column = 0;
            for (column = row + 1; column < addNumber.length; column++) {
                if (nums < addNumber[column]) break;
            }
            if (column == addNumber.length) {
                colNumber[row] = nums;
                row++;
            }
            else{
                int tempo = addNumber[column];
                addNumber[column] = nums;
                addNumber[row] = tempo;
            }
        }
        return colNumber;
    }
}
