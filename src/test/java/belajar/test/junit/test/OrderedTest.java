package belajar.test.junit.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    @Test
    @Order(3)
    public void test3() {

    }

    @Test
    @Order(1)
    public void test1() {

    }
}
