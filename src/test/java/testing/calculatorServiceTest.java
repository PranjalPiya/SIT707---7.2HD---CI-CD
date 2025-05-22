package testing;


import org.junit.Before;
import org.junit.Test;

import ci_cddemo.calculatorService;

import static org.junit.Assert.*;

public class calculatorServiceTest {

    private calculatorService calculator;

    @Before
    public void setUp() {
        calculator = new calculatorService();
    }

    @Test
    public void testAddShouldPass() {
        int result = calculator.add(2, 3);
        assertEquals("2 + 3 should be 5", 5, result);
    }

    @Test
    public void testSubtractShouldPass() {
        int result = calculator.subtract(5, 3);
        assertEquals("5 - 3 should be 2", 2, result);
    }

    @Test
    public void testMultiplyShouldFailInitially() {
        int result = calculator.multiply(2, 3);
//        assertEquals("2 * 3 should be 6", 5, result);  // Intentionally wrong
        assertEquals("2 * 3 should be 6", 6, result); // Writing Correct value

    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroShouldThrow() {
        calculator.divide(10, 0);
    }

    @Test
    public void testDivideShouldPass() {
        int result = calculator.divide(10, 2);
        assertEquals("10 / 2 should be 5", 5, result);
    }
}
