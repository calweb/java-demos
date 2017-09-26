import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


/**
 * Created by calvinwebster on 9/26/17.
 */
public class GenericTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void isEvenTestWithInputs () throws BadInputException {
        System.out.println("Running isEvenTest");

        assertTrue("Testing Even Number", JUnitDemo.isEvenUnder100(2));
        assertFalse("Testing Odd Number", JUnitDemo.isEvenUnder100(1));


    }
    @Test
    public void isEventTestWithBadInputs () throws BadInputException {
        expected.expect(BadInputException.class);
        JUnitDemo.isEvenUnder100(100);
    }

    @Test
    public void sum2NumberTest () {
        assertEquals(JUnitDemo.sum2Numbers(2,4), 6);
        assertEquals(JUnitDemo.sum2Numbers(10,10), 20);
    }

    @Test
    public void sum2NumberTestNegativeNums () {
        assertEquals(JUnitDemo.sum2Numbers(-2, 2), 0);
        assertNotEquals(JUnitDemo.sum2Numbers(2, 3), 4);
    }

}
