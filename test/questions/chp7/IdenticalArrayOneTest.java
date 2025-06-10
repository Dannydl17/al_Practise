package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdenticalArrayOneTest {

    @Test
    public void testThatIdenticalArrayCanReturnAResponseTest(){
        int[] list1 = {5, 2, 5, 6, 6, 1};
        list1 = IdenticalArrayOne.canSort(list1);
        int[] list2 = {5, 5, 2, 6, 1, 6};
        list2 = IdenticalArrayOne.canSort(list2);
        boolean result = IdenticalArrayOne.canCheckForEqualsElementAndIndex(list1, list2);
        assertTrue(result);
    }

    @Test
    public void testThatIdenticalArrayCanReturnASecondResponseTest(){
        int[] list1 = {5, 5, 5, 6, 6, 1};
        list1 = IdenticalArrayOne.canSort(list1);
        int[] list2 = {5, 2, 5, 6, 1, 6};
        list2 = IdenticalArrayOne.canSort(list2);
        boolean result = IdenticalArrayOne.canCheckForEqualsElementAndIndex(list1, list2);
        assertFalse(result);
    }
}
