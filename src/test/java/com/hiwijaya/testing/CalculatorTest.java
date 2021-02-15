package com.hiwijaya.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Happy Indra Wijaya
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess(){
        var result = calculator.add(5, 10);
        assertEquals(15, result);
    }


}
