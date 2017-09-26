import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by calvinwebster on 9/26/17.
 */
public class PersonTest {
    public Person spencer = new Person("Spencer Oakes", 32);


    @Test
    public void PersonTestName () {

        assertEquals(spencer.getName(), "Spencer Oakes");
        assertNotEquals(spencer.getName(), "Calvin Webster");
    }

    @Test
    public void PersonTestAge () {
        assertEquals(spencer.getAge(), 32);
        assertNotEquals(spencer.getAge(), 26);
    }
}
