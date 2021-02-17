package com.hiwijaya.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * @author Happy Indra Wijaya
 */
public class SlowTest {

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    public void testSlow() throws InterruptedException {
        Thread.sleep(10_000);   // milliseconds
    }

}
