import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class TestDivisionChecker
{
    @Test
    public void testDivisionCheck()
    {
        assertEquals("DivisionChecker.divisionCheck(5,6)","Not Divisible",DivisionChecker.divisionCheck(5,6));
        assertEquals("DivisionChecker.divisionCheck(12,6)","Divisible",DivisionChecker.divisionCheck(12,6));
        assertEquals("DivisionChecker.divisionCheck(0,12)","Divisible",DivisionChecker.divisionCheck(0,12));
        assertEquals("DivisionChecker.divisionCheck(-10,-5)","Divisible",DivisionChecker.divisionCheck(-10,-5));
    }
}
