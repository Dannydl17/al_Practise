package questions.chp5;

import java.util.ArrayList;
import java.util.Arrays;

public class PerfectNumber {
    public static void main(String[] args) {
        ArrayList<Integer> collectN = new ArrayList<>();
        int total = 0;
        int countN = 6;
//        int count = 1;
        int counter = 0;


            for (int count = 1; count < countN; count++) {
               if (countN <= 10000){
                   if (countN % count == 0) {
                        total+=count;
                        counter++;
                   }
               }
            }

        if (total == countN) {
            collectN.add(total);
            total = 0;
            countN++;
        }

        while (countN > 6 && countN < 10000){
            for (int count = 1; count < countN; count++) {
                if (countN <= 10000){
                    if (countN % count == 0) {
                        total+=count;
                        counter++;
                    }
                }
            }
            if (total == countN) {
                collectN.add(total);
                total = 0;
                countN++;
            }
            if (total != countN) {
                total = 0;
                countN++;
            }
        }

        int[] nums = convertToArray(collectN);

        for (int count = 0; count < nums.length; count++) {
            System.out.print(nums[count] + " ");
        }
    }
    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] results = new int[result.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = result.get(index);
        }
        return results;
    }
}
