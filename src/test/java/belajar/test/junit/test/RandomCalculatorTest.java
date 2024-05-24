package belajar.test.junit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expect = a + b;

        Assertions.assertEquals(expect, result);
    }
}
