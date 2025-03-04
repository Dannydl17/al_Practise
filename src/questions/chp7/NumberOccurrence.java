package questions.chp7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.load;

public class NumberOccurrence {

    public static void main(String[] args) {
        ArrayList<Integer> r = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the integer between 1 and 100:  ");
         int numOne = keyboardInput.nextInt();
         if (numOne != 0) {
             r.add(numOne);
         }
         else{
             int[] num = convertToArrayOfNumber(r);
             int[] numbs = canCountOccurringNumber(num);


             int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
             int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
             int[] resultTwo = canSortArray(resultOne);
             for (int count = 0; count < resultTwo.length; count++) {
                 System.out.println(resultTwo[count] + " occurs ");
             }
         }
         numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }
        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
             r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
        if (numOne != 0) {
            r.add(numOne);
        }
        else{
            int[] num = convertToArrayOfNumber(r);
            int[] numbs = canCountOccurringNumber(num);


            int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
            int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
            int[] resultTwo = canSortArray(resultOne);
            for (int count = 0; count < resultTwo.length; count++) {
                System.out.println(resultTwo[count] + " occurs ");
            }
        }

        numOne = keyboardInput.nextInt();
         if (numOne != 0) {
            r.add(numOne);
        }
        else{
             int[] num = convertToArrayOfNumber(r);
             int[] numbs = canCountOccurringNumber(num);


             int[] result = canCompareAndChangeElementWithTheSameValueToZero(num);
             int[] resultOne = canReturnNewElementOfArrayWithOutZero(result);
             int[] resultTwo = canSortArray(resultOne);
             for (int count = 0; count < resultTwo.length; count++) {
                 System.out.println(resultTwo[count] + " occurs ");
             }
         }

    }

    private static int[] convertToArrayOfNumber(ArrayList<Integer> r) {
        int[] results = new int[r.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = r.get(index);
        }
        return results;
    }

    public static int[] canCountOccurringNumber(int[] num) {
        int[] numb = canSortArray(num);
        System.out.println(Arrays.toString(numb));
        int countN = countElementOfTheSameType(numb);
        int[] results = new int[num.length - countN];
        int count = 0;
        int nums = 1;

        for (int counter = 0; counter < num.length; counter++) {
                int n = num[counter];
                while (nums == counter){
                    for (int index = 0; index < num.length; index++) {
//                        if (counter == index){
//                           continue;
//                        }
                        if (n == num[index]) {
                            count++;
                        }
                    }
                    if (nums == num.length - 1) {
//                        return count;
                        break;
                    }
                    nums++;
                    counter++;
                    n = num[counter];
                }
            for (int index = counter + 1; index < num.length; index++) {
                if (n == num[index]) {
                    count++;
                }
                results[count] = count;
                count = 0;
            }

        }

        return num;
    }

    public static int[] canSortArray(int[] num) {
       int[] result = new int[num.length];

        for (int count = 0; count < num.length;) {
              int nums = num[count];
              int counter;
            for (counter = count + 1; counter < num.length; counter++) {
                if (nums > num[counter]) break;
            }
            if (counter == num.length) {
                result[count] = nums;
                count++;
            }
            else {
                int temp = num[counter];
                num[counter] = nums;
                num[count] = temp;
            }
        }
        return result;
    }

    private static int countElementOfTheSameType(int[] num) {
        int countN = 0;
        for (int count = 0; count < num.length; count++) {
            for (int counter = count + 1; counter < num.length; counter++) {
                if (num[counter] == num[count]) {
                     countN++;
                }
            }
        }
        return countN;
    }

    public static int[] canCompareAndChangeElementWithTheSameValueToZero(int[] num) {
        for (int count = 0; count < num.length; count++) {
            for (int counter = count + 1; counter < num.length; counter++) {
                if (num[counter] == num[count]) {
                    num[counter] = 0;
                }
            }
        }
        return num;
    }

    public static int[] canReturnNewElementOfArrayWithOutZero(int[] num) {
        int count = 0;

        for (int counter = 0; counter < num.length; counter++){
            if (num[counter] != 0) {
                count++;
            }
        }

        int[] numbers = new int[count];
        int newIndex = 0;
        for (int index = 0; index < num.length; index++) {
            if (num[index] != 0) {
                numbers[newIndex] = num[index];
                newIndex++;
            }
        }
        return numbers;
    }
}
