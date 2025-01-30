package questions.chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfRegularPolygonTest {

    @Test
    public void testThatAreaOfRegularPolygonCanBeCalculateTheAreaTest(){
        int numOfSides = 5;
        double side = 6.5;
        double area = AreaOfRegularPolygon.canCalculateAreaOfRegularPolygon(numOfSides, side);
        assertEquals(72.69017017488385, area);
    }
}
