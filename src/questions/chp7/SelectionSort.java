package questions.chp7;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(double[] list){
        for (int count = 0; count < list.length - 1; count++) {
               double currentMin = list[count];
               int currentMinIndex = count;

            for (int counter = count + 1; counter < list.length; counter++) {
                if (currentMin > list[counter]) {
                    currentMin = list[counter];
                    currentMinIndex = counter;
                }
            }

            if (currentMinIndex != count) {
                list[currentMinIndex] = list[count];
                list[count] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
//        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
//        double[] list = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
//        SelectionSort.selectionSort(list);
//        System.out.println(Arrays.toString(list));
//
//        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
//        java.util.Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        java.util.Arrays.parallelSort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//
//        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
//        java.util.Arrays.sort(chars, 1, 3);
//        System.out.println(chars);
//        java.util.Arrays.parallelSort(chars, 1, 3);
//        System.out.println(chars);

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                java.util.Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " +
                java.util.Arrays.binarySearch(list, 12));


        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                java.util.Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " +
                java.util.Arrays.binarySearch(chars, 't'));



        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1));
        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));
    }
}
