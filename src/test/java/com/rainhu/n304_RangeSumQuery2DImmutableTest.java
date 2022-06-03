package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n304_RangeSumQuery2DImmutableTest {
    
    @Test
    public void test1(){
        int[][] matrix = new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        n304_RangeSumQuery2DImmutable clz = new n304_RangeSumQuery2DImmutable(matrix);
        assertEquals(clz.sumRegion(2, 1, 4, 3), 8);
        assertEquals(clz.sumRegion(1, 1, 2, 2), 11);
        assertEquals(clz.sumRegion(1, 2, 2, 4), 12);
    }
    

    
}
