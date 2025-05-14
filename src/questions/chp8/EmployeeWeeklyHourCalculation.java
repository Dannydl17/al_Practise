package questions.chp8;

import java.util.Arrays;

public class EmployeeWeeklyHourCalculation {
    public static void main(String[] args) {
        int[][] employee = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] addNums = canAddedWeeklyEmployeeHours(employee);
//        System.out.println(Arrays.toString(addNums));
        int[] colNum = canReturnNewWeeklyEmployeeHoursFromInDecreasingOrder(addNums);
//        System.out.println(Arrays.toString(colNum));

        int nums = addNums.length;

        for (int count = 0; count < nums; count++) {
            System.out.println("Employee " + colNum[count] + "'s correct count is " +
                    addNums[count]);
        }
    }
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

    public static int[] canReturnNewWeeklyEmployeeHoursFromInDecreasingOrder(int[] elements) {
        int[]newResult = new int[elements.length];

        int[]nums = canStoreElements(elements);
        int[] colNums = canSortNumberFromDecreasingOrder(elements);

        int count = 0;
        for (int counter = 0; counter < colNums.length;) {
             int numOne = colNums[counter];
//            System.out.println(numOne);
            for (int innerCount = 0; innerCount < nums.length; innerCount++) {
                int numTwo = nums[innerCount];
                if (numOne == numTwo) {
                    newResult[counter] = innerCount;
                    counter++;
                }
            }
        }
        return newResult;
    }

    private static int[] canStoreElements(int[] elements) {
        int[]newR = new int[elements.length];

        int counter = 0;
        for (int count = 0; count < elements.length; count++) {
            newR[counter] = elements[count];
            counter++;
        }
        return newR;
    }
}
