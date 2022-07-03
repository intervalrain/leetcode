package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.Snippet;

import org.junit.jupiter.api.Test;

public class n1710_MaximumUnitsOnATruckTest {
    
    n1710_MaximumUnitsOnATruck clz = new n1710_MaximumUnitsOnATruck();
    int[][] boxTypes;
    int truckSize;
    int expected, actual;

    @Test
    public void test1(){
        boxTypes = Snippet.stringToInt2dArray("[[1,3],[2,2],[3,1]]");
        truckSize = 4;
        expected = 8;
        actual = clz.maximumUnits(boxTypes, truckSize);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        boxTypes = Snippet.stringToInt2dArray("[[5,10],[2,5],[4,7],[3,9]]");
        truckSize = 10;
        expected = 91;
        actual = clz.maximumUnits(boxTypes, truckSize);
        assertEquals(expected, actual);

    }
    
}
