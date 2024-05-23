package belajar.test.junit.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("integration-test")
public class SampleIntegrationTest {
    @Test
    public void integrationTest() {
        System.out.println("Integration Test 1");
    }

    @Test
    public void integrationTest2() {
        System.out.println("Integration Test 2");
    }
}
