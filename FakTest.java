import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakTest {
    @Test
    public void factorial() {
        assertEquals(120, Faktorial.factorial(5));
        assertEquals(720, Faktorial.factorial(6));
    }
}
