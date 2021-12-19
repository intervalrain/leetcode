package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n509_FibonacciNumberTest {

    n509_FibonacciNumber clz = new n509_FibonacciNumber();
    
    @Test
    public void test1(){
        assertEquals(clz.fib(0), 0);  
    }

    @Test
    public void test2(){
        assertEquals(clz.fib(1), 1);
    }

    @Test
    public void test3(){
        assertEquals(clz.fib(2), 1);
    }

    @Test
    public void test4(){
        assertEquals(clz.fib(8), 21);
    }

    @Test
    public void test5(){
        assertEquals(clz.fib(12), 144);
    }
}
