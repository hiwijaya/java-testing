package com.hiwijaya.testing;

import org.junit.jupiter.api.*;

/**
 * @author Happy Indra Wijaya
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LifecycleTest {

    private int counter;

    @BeforeAll
    public void setup(){
        counter = 1;
    }

    @AfterAll
    public void done(){
        System.out.println("last counter: " + counter);
    }

    @Test
    @Order(1)
    public void test2(){
        counter++;
    }

    @Test
    @Order(2)
    public void test1(){
        counter++;
    }

    @Test
    @Order(3)
    public void test3(){
        counter++;
    }

}
