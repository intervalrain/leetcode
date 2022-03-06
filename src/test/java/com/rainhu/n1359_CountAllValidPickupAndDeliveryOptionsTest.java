package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1359_CountAllValidPickupAndDeliveryOptionsTest {
    
    n1359_CountAllValidPickupAndDeliveryOptions clz = new n1359_CountAllValidPickupAndDeliveryOptions();
    int n;
    int expected, actual;

    @Test
    public void test1(){
        n = 1;
        expected = 1;
        actual = clz.countOrders(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 2;
        expected = 6;
        actual = clz.countOrders(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 3;
        expected = 90;
        actual = clz.countOrders(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 7;
        expected = 681080400;
        actual = clz.countOrders(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        n = 8;
        expected = 729647433;
        actual = clz.countOrders(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        n = 18;
        expected = 368349166;
        actual = clz.countOrders(n);
        assertEquals(expected, actual);
    }
}
