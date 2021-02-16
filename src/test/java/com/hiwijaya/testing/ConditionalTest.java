package com.hiwijaya.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.condition.OS;
import org.opentest4j.TestAbortedException;
import java.util.Properties;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * @author Happy Indra Wijaya
 */
public class ConditionalTest {

    @BeforeAll
    public static void setup(){
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("Aborted. Test only run on DEV environment.");
        }
    }

    @Test
    public void testAssumptions(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

        // test here
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void testEnabledOnProfileDev(){
        System.out.println("Test enabled when profile is DEV");
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testEnabledOnWindowsOS(){
        System.out.println("Test enabled when OS is Windows");
    }

}
