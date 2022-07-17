package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n153_FindMinimumInRotatedSortedArrayTest{
    
    n153_FindMinimumInRotatedSortedArray clz = new n153_FindMinimumInRotatedSortedArray();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[3,4,5,1,2]");
        expected = 1;
        actual = clz.findMin(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[4,5,6,7,0,1,2]");
        expected = 0;
        actual = clz.findMin(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = Snippet.stringToIntegerArray("[11,13,15,17]");   
        expected = 11;
        actual = clz.findMin(nums);
        assertEquals(expected, actual);
    }
}