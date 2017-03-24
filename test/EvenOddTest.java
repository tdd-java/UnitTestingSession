import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddTest {
    @Test
    public void isEvenShouldReturnTrueForNumber2() throws Exception {
        EvenOddNumber evenOdd = new EvenOddNumber(2);
        assertTrue(evenOdd.isEven());
    }

    @Test
    public void isEvenShouldReturnFalseForNumber3() throws Exception {
        EvenOddNumber evenOdd = new EvenOddNumber(3);
        assertFalse(evenOdd.isEven());
    }
}
