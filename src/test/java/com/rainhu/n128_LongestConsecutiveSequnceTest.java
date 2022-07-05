package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.Snippet;

public class n128_LongestConsecutiveSequnceTest {
    
    n128_LongestConsecutiveSequnce clz = new n128_LongestConsecutiveSequnce();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[100,4,200,1,3,2]");
        expected = 4;
        actual = clz.longestConsecutive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[0,3,7,2,5,8,4,6,0,1]");
        expected = 9;
        actual = clz.longestConsecutive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = Snippet.stringToIntegerArray("[4,2,2,-4,0,-2,4,-3,-4,-4,-5,1,4,-9,5,0,6,-8,-1,-3,6,5,-8,-1,-5,-1,2,-9,1]");
        expected = 8;
        actual = clz.longestConsecutive(nums);
        assertEquals(expected, actual);
    }
}
