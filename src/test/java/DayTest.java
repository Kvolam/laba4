import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class DayTest {

    @Test
    public void run() throws InterruptedException {
        Day day = new Day("Марс",2400);
        day.start();
        sleep(7200);
        day.interrupt();
        int actual = day.getDegree();
        int expected = 3;
        assertEquals(actual,expected);
    }
}