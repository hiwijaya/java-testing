package com.hiwijaya.testing;

import com.hiwijaya.testing.util.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

/**
 * @author Happy Indra Wijaya
 */
@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testRandom(TestInfo info, Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        System.out.println(info.getDisplayName());
        System.out.println(a + " + " + b + " = " + result);

        Assertions.assertEquals(expected, result);
    }

}
