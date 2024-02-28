package nextdate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class NextDateTest {

    @Test
    public void testNextDate() {
        assertEquals("Next date should be (1, 2, 2000)",
                "2/1/2000", NextDate.nextDate(1, 1, 2000));
        assertEquals("Next date should be (1, 1, 2000)",
                "1/1/2000", NextDate.nextDate(31, 12, 1999));
        assertEquals("Next date should be (29, 2, 2000) for leap year",
                "29/2/2000", NextDate.nextDate(28, 2, 2000));
        assertEquals("Next date should be (1, 3, 2000) for leap year",
                "1/3/2000", NextDate.nextDate(29, 2, 2000));
        assertEquals("Next date should be (1, 1, 2001)",
                "1/1/2001", NextDate.nextDate(31, 12, 2000));
        assertEquals("Next date should be (1, 1, 1997)",
                "1/1/1997", NextDate.nextDate(31, 12, 1996));
        assertEquals("Next date should be (1, 5, 1996)",
                "1/5/1996", NextDate.nextDate(30, 4, 1996));
        assertEquals("Next date should be (1, 6, 1996)",
                "1/6/1996", NextDate.nextDate(31, 5, 1996));
        assertEquals("Next date should be (1, 7, 1996)",
                "1/7/1996", NextDate.nextDate(30, 6, 1996));
        assertEquals("Next date should be (1, 8, 1996)",
                "1/8/1996", NextDate.nextDate(31, 7, 1996));
        assertEquals("Next date should be (1, 9, 1996)",
                "1/9/1996", NextDate.nextDate(31, 8, 1996));
        assertEquals("Next date should be (1, 10, 1996)",
                "1/10/1996", NextDate.nextDate(30, 9, 1996));
        assertEquals("Next date should be (1, 11, 1996)",
                "1/11/1996", NextDate.nextDate(31, 10, 1996));
        assertEquals("Next date should be (1, 12, 1996)",
                "1/12/1996", NextDate.nextDate(30, 11, 1996));
        assertEquals("Next date should be (1, 2, 2000)",
                "1/2/2000", NextDate.nextDate(31, 1, 2000));
        assertEquals("Next date should be (1, 7, 2000)",
                "1/7/2000", NextDate.nextDate(30, 6, 2000));
        assertEquals("Next date should be (1, 1, 2001)",
                "1/1/2001", NextDate.nextDate(31, 12, 2000));
        assertEquals("Next date should be (1, 3, 1900)",
                "1/3/1900", NextDate.nextDate(29, 2, 1900));
        assertEquals("Next date should be (1, 3, 1900)",
                "1/3/1899", NextDate.nextDate(28, 2, 1899));
        assertEquals("Next date should be (1, 3, 2001)",
                "1/3/2001", NextDate.nextDate(28, 2, 2001));
        try {
            NextDate.nextDate(31, 2, 2001);
            fail("Should throw an exception for invalid input");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input", e.getMessage());
        }
        try {
            NextDate.nextDate(32, 1, 2000);
            fail("Should throw an exception for invalid input");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input", e.getMessage());
        }
        try {
            NextDate.nextDate(29, 2, 2001);
            fail("Should throw an exception for invalid input");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input", e.getMessage());
        }
    }
}
