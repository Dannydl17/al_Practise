package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortedBoolTest {

    @Test
    public void testThatSortedBoolReturnTrueIfListIsSortedTest(){
        int[] nums = {10, 1, 1, 3, 4, 4, 5, 7, 9, 11, 21};
        boolean isSort = SortedBool.isSorted(nums);
        assertTrue(isSort);
    }

    @Test
    public void testThatSortedBoolReturnFalseIfListIsNotSortedTest(){
        int[] nums = {8, 10, 1, 5, 16, 61, 9, 11, 1};
        boolean isSort = SortedBool.isSorted(nums);
        assertFalse(isSort);
    }
}
