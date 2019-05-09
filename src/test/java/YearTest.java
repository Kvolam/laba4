import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;


public class YearTest {

    @Test
    public void run() throws InterruptedException {
        Year year = new Year("Марс",2400);
        year.start();
        sleep(7200);
        year.interrupt();
        int actual = year.getDegree();
        int expected = 3;
        assertEquals(actual,expected);
    }
}
