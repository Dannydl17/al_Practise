package questions.chp7;

public class SelectionSortLargestNumber {
    public static double[] canPerformSelectionSortFromLargestNumber(double[] list) {

        for (int count = 0; count < list.length -1; count++) {
             double currentMax = list[count];
             int currentMaxIndex = count;

            for (int counter = count + 1; counter < list.length; counter++) {
                  double nums = list[counter];

                if (currentMax < nums) {
                    currentMax = nums;
                    currentMaxIndex = counter;
                }
            }

            if (currentMaxIndex != count) {
                list[currentMaxIndex] = list[count];
                list[count] = currentMax;
            }
        }
        return list;
    }
}
