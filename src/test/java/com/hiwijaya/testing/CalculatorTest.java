package com.hiwijaya.testing;

import com.hiwijaya.testing.util.CustomDisplayNameGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Happy Indra Wijaya
 */
//@DisplayName("Run test on Calculator class")
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@DisplayNameGeneration(CustomDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
//    @DisplayName("Test add(), expected ok")
    public void testAddSuccess(){
        var result = calculator.add(5, 10);
        assertEquals(15, result);
    }

    @Test
//    @DisplayName("Test divide(), expected ok")
    public void testDivideSuccess(){
        var result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
//    @DisplayName("Test method divide(), expected thrown expected thrown exception")
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}
