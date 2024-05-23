package belajar.test.junit.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private String temp;

    @Test
    public void testA() {
        temp = "Arbi";
    }

    @Test
    public void testB() {
        System.out.println(temp);
    }
}
