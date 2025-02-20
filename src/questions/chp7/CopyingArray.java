package questions.chp7;

import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

//        for (int count = 0; count < sourceArray.length; count++) {
//            targetArray[count] = sourceArray[count];
//        }
         System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.out.println(Arrays.toString(targetArray));
    }
}
