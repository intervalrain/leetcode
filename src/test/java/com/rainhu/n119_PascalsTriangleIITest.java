package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n119_PascalsTriangleIITest {
    
    n119_PascalsTriangleII clz = new n119_PascalsTriangleII();
    int rowIndex;
    Integer[] expected;
    List<Integer> actual;

    @Test
    public void test1(){
        rowIndex = 3;
        expected = new Integer[]{1,3,3,1};
        actual = clz.getRow(rowIndex);
        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void test2(){
        rowIndex = 0;
        expected = new Integer[]{1};
        actual = clz.getRow(rowIndex);
        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void test3(){
        rowIndex = 1;
        expected = new Integer[]{1,1};
        actual = clz.getRow(rowIndex);
        assertArrayEquals(expected, actual.toArray());
    }
}
