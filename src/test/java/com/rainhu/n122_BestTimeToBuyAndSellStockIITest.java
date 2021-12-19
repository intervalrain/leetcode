package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n122_BestTimeToBuyAndSellStockIITest {
    
    n122_BestTimeToBuyAndSellStockII clz = new n122_BestTimeToBuyAndSellStockII();
    int[] prices;
    int expected;
    int actual;

    @Test
    public void test1(){
        prices = new int[]{7,1,5,3,6,4};
        expected = 7;
        actual = clz.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        prices = new int[]{1,2,3,4,5};
        expected = 4;
        actual = clz.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        prices = new int[]{7,6,4,3,1};
        expected = 0;
        actual = clz.maxProfit(prices);
        assertEquals(expected, actual);
    }
}
