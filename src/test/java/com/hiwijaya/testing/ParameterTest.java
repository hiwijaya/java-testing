package com.hiwijaya.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

/**
 * @author Happy Indra Wijaya
 */
public class ParameterTest {

    private Calculator calculator = new Calculator();

    public static List<Integer> parameterSource(){
        return List.of(1, 2, 4, 5, 10);
    }


    @DisplayName("Test ValueSource")
    @ParameterizedTest(name = "{displayName} with parameter {0}")
    @ValueSource(ints = {1, 2, 3, 5, 10, 18, 23, 0})
    public void testWithValueSource(int value){
        var result = calculator.add(value, value);
        var expected = value + value;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test MethodSource")
    @ParameterizedTest(name = "{displayName} with parameter {0}")
    @MethodSource({"parameterSource"})
    public void testWithMethodSource(int value){
        var result = calculator.add(value, value);
        var expected = value + value;

        Assertions.assertEquals(expected, result);
    }

}
