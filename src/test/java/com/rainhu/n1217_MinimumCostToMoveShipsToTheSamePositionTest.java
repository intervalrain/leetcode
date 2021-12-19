package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1217_MinimumCostToMoveShipsToTheSamePositionTest {
    
    n1217_MinimumCostToMoveChipsToTheSamePosition clz = new n1217_MinimumCostToMoveChipsToTheSamePosition();
    int[] position;
    int expected;
    int actual;

    @Test
    public void test1(){
        position = new int[]{1,2,3};
        expected = 1;
        actual = clz.minCostToMoveChips(position);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        position = new int[]{2,2,2,3,3};
        expected = 2;
        actual = clz.minCostToMoveChips(position);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        position = new int[]{1,1000000000};
        expected = 1;
        actual = clz.minCostToMoveChips(position);
        assertEquals(expected, actual);
    }

}
