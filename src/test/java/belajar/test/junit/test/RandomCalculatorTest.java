package belajar.test.junit.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {

    public static List<Integer> parameterSource() {
        return List.of(1,2,3,4,5);
    }

    @ParameterizedTest
    @MethodSource(value = {"parameterSource"})
    public void testWithMethodSource(Integer value) {
        var result = value + value;
        Assertions.assertEquals(result, calculator.add(value, value));
    }

    @DisplayName("Test Calculator with Parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @ValueSource(ints = {1,2,3,4,5})
    public void testWithParameter(int value) {
        var result = value + value;
        Assertions.assertEquals(result, calculator.add(value, value));
    }

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expect = a + b;

        Assertions.assertEquals(expect, result);
    }

    @DisplayName("Test Calculator Random")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeated(Random random, TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition());
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expect = a + b;

        Assertions.assertEquals(expect, result);
    }
}
