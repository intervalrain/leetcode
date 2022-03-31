package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n322_CoinChangeTest {
    
    n322_CoinChange clz = new n322_CoinChange();
    int[] coins;
    int amount;
    int expected, actual;
    
    @Test
    public void test1(){
        coins = new int[]{1,2,5};
        amount = 11;
        expected = 3;
        actual = clz.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        coins = new int[]{2};
        amount = 3;
        expected = -1;
        actual = clz.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        coins = new int[]{1};
        amount = 0;
        expected = 0;
        actual = clz.coinChange(coins, amount);
        assertEquals(expected, actual);
    }
}
