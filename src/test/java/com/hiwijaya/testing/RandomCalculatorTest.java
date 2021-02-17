package com.hiwijaya.testing;

import com.hiwijaya.testing.util.RandomParameterResolver;
import org.junit.jupiter.api.*;
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

    @DisplayName("Test Calculator Random")
    @RepeatedTest(
        value = 5,
        name = "{displayName} ke {currentRepetition}"
    )
    public void testRandom(TestInfo info, RepetitionInfo repetitionInfo, Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        System.out.println(info.getDisplayName() + "/" + repetitionInfo.getTotalRepetitions());
        System.out.println(a + " + " + b + " = " + result);

        Assertions.assertEquals(expected, result);
    }

}
