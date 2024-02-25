import static org.junit.Assert.*;

import com.calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest{
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculateAddition() {
        assertEquals(5, calculator.calculateAddition(2, 3));
        assertEquals(-1, calculator.calculateAddition(-4, 3));
        assertEquals(0, calculator.calculateAddition(0));
    }

    @Test
    public void testCalculateSubtraction() {
        assertEquals(2, calculator.calculateSubtraction(5, 3));
        assertEquals(-7, calculator.calculateSubtraction(0, 7));
        assertEquals(0, calculator.calculateSubtraction(5, 5));
    }

    @Test
    public void testCalculateMultiplication() {
        assertEquals(15, calculator.calculateMultiplication(3, 5));
        assertEquals(0, calculator.calculateMultiplication(0, 7));
        assertEquals(-20, calculator.calculateMultiplication(4, -5));
    }

    @Test
    public void testCalculateDivision() {
        assertEquals(2.0, calculator.calculateDivision(10, 5), 0.001);
        assertEquals(-3.0, calculator.calculateDivision(15, -5), 0.001);

        // Testing division by zero
        try {
            calculator.calculateDivision(5, 0);
            fail("Expected ArithmeticException was not thrown");
        } catch (ArithmeticException e) {
            // Expected exception

        }
    }

    @Test
    public void testCalculateSquareRoot() {
        assertEquals(2.0, calculator.calculateSquareRoot(4), 0.001);
        assertEquals(0.0, calculator.calculateSquareRoot(0), 0.001);

        // Test negative input
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateSquareRoot(-4));
    }

    @Test
    public void testCalculateLog() {
        assertEquals(1.0, calculator.calculateLog(Math.E), 0.001);
        assertEquals(0.0, calculator.calculateLog(1), 0.001);

        // Testing log of a non-positive number
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateLog(0));

    }

    @Test
    public void testCalculateFactorial() {
        assertEquals(120, calculator.calculateFactorial(5));
        assertEquals(1, calculator.calculateFactorial(0));

        // Testing factorial of a negative number
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateFactorial(-3));
    }

    @Test
    public void testCalculatePower() {
        assertEquals(8, calculator.calculatePower(2, 3));
        assertEquals(1, calculator.calculatePower(5, 0));
        assertEquals(1, calculator.calculatePower(-3, 0));

        // Testing power with a negative exponent
        assertThrows(IllegalArgumentException.class, () -> calculator.calculatePower(2, -3));
    }
}


