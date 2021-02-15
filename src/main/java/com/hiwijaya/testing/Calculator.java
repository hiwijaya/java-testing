package com.hiwijaya.testing;

/**
 * @author Happy Indra Wijaya
 */
public class Calculator {

    public int add(int val1, int val2){
        return val1 + val2;
    }

    public int subtract(int val1, int val2){
        return val1 - val2;
    }

    public int divide(int val1, int val2){
        if(val2 == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        System.out.println("[run divide]");
        return val1 / val2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }

}
