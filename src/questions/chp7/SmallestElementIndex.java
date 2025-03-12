package questions.chp7;

public class SmallestElementIndex {
    public static int canFindTheNumberAndReturnTheIndex(double[] nums) {
        int index = 0;
        double countNum = nums[0];
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] < countNum && nums[count] > 1) {
                 index = count;
            }
        }
        return index;
    }
}
