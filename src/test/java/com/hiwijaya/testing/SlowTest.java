package com.hiwijaya.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

/**
 * @author Happy Indra Wijaya
 */
@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testSlow1() throws InterruptedException {
        Thread.sleep(4_000);   // milliseconds
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testSlow2() throws InterruptedException {
        Thread.sleep(4_000);   // milliseconds
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testSlow3() throws InterruptedException {
        Thread.sleep(4_000);   // milliseconds
    }

}
