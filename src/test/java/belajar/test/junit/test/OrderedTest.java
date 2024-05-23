package belajar.test.junit.test;

import org.junit.jupiter.api.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    private int count = 0;

    @Test
    @Order(3)
    public void test3() {
        count++;
        System.out.println(count);
    }

    @Test
    @Order(1)
    public void test1() {
        count++;
        System.out.println(count);
    }

    @Test
    @Order(2)
    public void test2() {
        count++;
        System.out.println(count);
    }
}
