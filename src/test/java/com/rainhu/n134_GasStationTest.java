package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n134_GasStationTest {
    
    n134_GasStation clz = new n134_GasStation();
    int[] gas;
    int[] cost;
    int expected;
    int actual;

    @Test
    public void test1(){
        gas = new int[]{1,2,3,4,5};
        cost = new int[]{3,4,5,1,2};
        expected = 3;
        actual = clz.canCompleteCircuit(gas, cost);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
        gas = new int[]{2,3,4};
        cost = new int[]{3,4,3};
        expected = -1;
        actual = clz.canCompleteCircuit(gas, cost);
        assertEquals(expected, actual);
    }
}
