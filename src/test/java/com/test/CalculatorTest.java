package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAdd() throws InterruptedException {
        System.out.println("Add thread id:" + Thread.currentThread().getId() + "Timestamp :" + LocalDateTime.now());
        Assert.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void shouldMulitply() {
        System.out.println("Multiply thread id:" + Thread.currentThread().getId() + "Timestamp :" + LocalDateTime.now());
        Assert.assertEquals(2, calculator.multiply(1,2));
    }

}