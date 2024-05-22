package belajar.test.junit.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        var result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testRemoveSuccess() {
        var result = calculator.remove(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(20, 10);
        assertEquals(2, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(20, 0);
        });
    }
}
