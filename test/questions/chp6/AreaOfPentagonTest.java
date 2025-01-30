package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfPentagonTest {

    @Test
    public void testThatAreaOfPentagonCanBeCalculatedTest(){
        double side = 5.5;
        double area = AreaOfPentagon.canCalculateArea(side);
        assertEquals(52.04444136781625, area);
    }
}
