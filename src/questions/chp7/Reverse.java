package questions.chp7;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);

        System.out.println(Arrays.toString(list2));
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for (int count = 0,
             counter = result.length - 1;
             count < list.length;
             count++, counter--) {
            System.out.println(counter);
             result[counter] = list[count];
        }
        return result;
    }
}
