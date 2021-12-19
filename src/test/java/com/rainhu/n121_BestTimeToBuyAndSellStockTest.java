package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n121_BestTimeToBuyAndSellStockTest {
    
    n121_BestTimeToBuyAndSellStock clz = new n121_BestTimeToBuyAndSellStock();
    int[] prices;
    int expected;
    int actual;

    @Test
    public void test1(){
        prices = new int[]{7,1,5,3,6,4};
        expected = 5;
        actual = clz.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        prices = new int[]{7,6,4,3,1};
        expected = 0;
        actual = clz.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        prices = new int[]{2,4,1};
        expected = 2;
        actual = clz.maxProfit(prices);
        assertEquals(expected, actual);
    }
}
