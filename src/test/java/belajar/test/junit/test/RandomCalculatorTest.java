package belajar.test.junit.test;

import org.junit.jupiter.api.*;

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
