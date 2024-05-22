package belajar.test.junit.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Calculator class")
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test skenario sukses untuk method add(Integer, Integer)")
    public void testAddSuccess() {
        var result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    @DisplayName("Test skenario sukses untuk method remove(Integer, Integer)")
    public void testRemoveSuccess() {
        var result = calculator.remove(20, 10);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Test skenario sukses untuk method divide(Integer, Integer)")
    public void testDivideSuccess() {
        var result = calculator.divide(20, 10);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Test skenario failed untuk method divide(Integer, Integer)")
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(20, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {
        // TODO Coming Soon!
    }
}
