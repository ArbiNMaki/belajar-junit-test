package belajar.test.junit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows() {
        //
    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisableOnWindows() {
        //
    }

    @Test
    @EnabledOnJre(value = {JRE.JAVA_22})
    public void testOnlyRunOnJava22() {
        //
    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_21})
    public void testDisabledRunOnJava21() {
        //
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_22)
    public void testOnlyRunOnJava14ToJava21() {
        //
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_21)
    public void testDisabledRunOnJava14ToJava21() {
        //
    }

    @Test
    public void testSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void testEnabledOnOracle() {
        //
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void testDisabledOnOracle() {
        //
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void testEnabledOnProfileDev() {
        //
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void testDisabledOnProfileDev() {
        //
    }
}
