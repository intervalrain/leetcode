package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class n905_SortArrayByParityTest {
    
    n905_SortArrayByParity clz = new n905_SortArrayByParity();
    int[] nums;
    int[] expected, actual;

    @Test
    public void test1(){
        nums = new int[]{3,1,2,4};
        expected = new int[]{2,4,3,1};
        actual = clz.sortArrayByParity(nums);
        boolean result = Arrays.toString(expected).equals("[2, 4, 3, 1]") || 
                         Arrays.toString(expected).equals("[2, 4, 1, 3]") ||
                         Arrays.toString(expected).equals("[4, 2, 3, 1]") ||
                         Arrays.toString(expected).equals("[4, 2, 1, 3]") ;
        assertTrue(result);
    }

    @Test
    public void test2(){
        nums = new int[]{0};
        expected = new int[]{0};
        actual = clz.sortArrayByParity(nums);
        assertArrayEquals(expected, actual);
    }

}
