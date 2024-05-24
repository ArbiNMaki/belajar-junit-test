package belajar.test.junit.test;

import belajar.test.junit.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

@Extensions(value = {
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expect = a + b;

        Assertions.assertEquals(expect, result);
    }
}
