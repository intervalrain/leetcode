package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class n1672_RichestCustomerWealthTest{

    n1672_RichestCustomerWealth clz = new n1672_RichestCustomerWealth();
    int[][] accounts;
    int expected;
    int actual;

    @Test
    public void test1(){
        accounts = new int[][]{{1,2,3},{3,2,1}};
        expected = 6;
        actual = clz.maximumWealth(accounts);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        accounts = new int[][]{{1,5},{7,3},{3,5}};
        expected = 10;
        actual = clz.maximumWealth(accounts);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        accounts = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        expected = 17;
        actual = clz.maximumWealth(accounts);
        assertEquals(expected, actual);
    }
}
