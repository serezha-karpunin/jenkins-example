import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        assertEquals(3, calculator.sum(2,2));
    }
}