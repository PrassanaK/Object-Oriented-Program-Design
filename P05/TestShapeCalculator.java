import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class TestShapeCalculator
{
    @Test
    public void testCalcCircleArea()
    {
        assertEquals("calcCircleArea(16)",201.062,ShapeCalculator.calcCircleArea(16),0.001);
        assertEquals("calcCirlceArea(15.7)",193.593,ShapeCalculator.calcCircleArea(15.7),0.001);
        assertEquals("calcCircleArea(-16)",201.062,ShapeCalculator.calcCircleArea(-16),0.001);
        assertEquals("calcCircleArea(0)",0,ShapeCalculator.calcCircleArea(0),0.001);    
    } 

    @Test
    public void testCalcRecArea()
    {
        assertEquals("calcRecArea(2,2)",4,ShapeCalculator.calcRecArea(2,2),0.0001);
        assertEquals("calcRecArea(2.5,2.5)",6.25,ShapeCalculator.calcRecArea(2.5,2.5),0.0001);
        assertEquals("calcRecArea(-2,-2)",4,ShapeCalculator.calcRecArea(-2,-2),0.0001);
        assertEquals("calcRecArea(0,5)",0,ShapeCalculator.calcRecArea(0,5),0.0001);
    }

    @Test
    public void testCalcTriArea()
    {
        assertEquals("calcTriArea(6,6)",0.18,ShapeCalculator.calcTriArea(6,6),0.001);
        assertEquals("calcTriArea(3.3,4.5)",0.074,ShapeCalculator.calcTriArea(3.3,4.5),0.001);
    }

}
    
