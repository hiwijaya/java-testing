package com.hiwijaya.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Happy Indra Wijaya
 */
@DisplayName("Run test on Calculator class")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void setup(){
        System.out.println("@BeforeAll - executes once before all test methods in this class.");
    }

    @BeforeEach
    public void init(){
        System.out.println("@BeforeEach - executes before each test method in this class.");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("@AfterEach - executed after each test method.");
    }

    @AfterAll
    public static void done(){
        System.out.println("@AfterAll - executed after all test methods.");
    }


    @Test
    @DisplayName("Test add(), expected ok")
    public void testAddSuccess(){
        var result = calculator.add(5, 10);
        assertEquals(15, result);
    }

    @Test
    @Disabled
    @DisplayName("Test divide(), expected ok")
    public void testDivideSuccess(){
        var result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Test method divide(), expected thrown expected thrown exception")
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}
