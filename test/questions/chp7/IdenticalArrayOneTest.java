package questions.chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdenticalArrayOneTest {

    @Test
    public void testThatIdenticalArrayCanReturnAResponseTest(){
        int[] list1 = {5, 2, 5, 6, 1, 6};
        int[] list2 = {5, 2, 5, 6, 1, 6};
        boolean result = IdenticalArrayOne.canCheckForTheEqualsElement(list1, list2);
        assertTrue(result);
    }

    @Test
    public void testThatIdenticalArrayCanReturnASecondResponseTest(){
        int[] list1 = {5, 2, 5, 6, 6, 1};
        int[] list2 = {5, 2, 5, 6, 1, 6};
        boolean result = IdenticalArrayOne.canCheckForTheEqualsElement(list1, list2);
        assertFalse(result);
    }
}
