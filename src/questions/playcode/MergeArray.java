package questions.playcode;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] fNum = {1, 5, 16, 61, 111};
        int[] sNum = {2, 4, 5, 6};

        int num = fNum.length + sNum.length;

        int[] toNum = new int[num];

         int newIndex = 0;
        for (int count = 0; count < fNum.length; count++) {
              toNum[newIndex] = fNum[count];
              newIndex++;
        }
        for (int count = 0; count < sNum.length; count++) {
              toNum[newIndex] = sNum[count];
              newIndex++;
        }

        System.out.println(Arrays.toString(toNum));

        int[] result = new int[toNum.length];

        for (int count = 0; count < toNum.length;) {
            int nums = toNum[count];
            int counter;
            for (counter = count + 1; counter < toNum.length; counter++){
                if (nums > toNum[counter]) break;
            }
            if (counter == toNum.length) {
                result[count] = nums;
                count++;
            }
            else {
                int temp = toNum[counter];
                toNum[counter] = nums;
                toNum[count] = temp;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
