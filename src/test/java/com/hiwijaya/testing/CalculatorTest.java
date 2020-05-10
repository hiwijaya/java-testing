package com.hiwijaya.testing;

import org.junit.*;

/**
 * @author Happy Indra Wijaya
 */
public class CalculatorTest {

    @BeforeClass
    public static void initGlobal(){
        System.out.println("Initiate for global usage.");
    }

    @AfterClass
    public static void cleanupGlobal(){
        System.out.println("Reset the global usage.");
    }

    @Before
    public void initTest(){
        System.out.println("Initiate for test unit");
    }

    @After
    public void cleanupTest(){
        System.out.println("Reset the test unit");
    }

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        System.out.println("10 + 5 = " + result);

        Assert.assertEquals("10 + 5 = 15", 15, calculator.add(10, 5));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 15);
        System.out.println("10 - 15 = " + result);

        Assert.assertEquals("10 - 15 = -5", -5, calculator.subtract(10, 15));
    }

}
