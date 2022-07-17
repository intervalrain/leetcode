package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n151_MaximumProductSubarrayTest {
    
    n151_MaximumProductSubarray clz = new n151_MaximumProductSubarray();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[2,3,-2,4]");
        expected = 6;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[-2,0,-1]");
        expected = 0;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = Snippet.stringToIntegerArray("[1,40,0,2,-5,-2,-4,3]");
        expected = 40;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = Snippet.stringToIntegerArray("[1,0,2,-5,-2,-4,3]");
        expected = 24;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }
}
