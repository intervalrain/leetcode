package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.Snippet;

public class n376_WiggleSubsequenceTest {
    
    n376_WiggleSubsequence clz = new n376_WiggleSubsequence();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[1,7,4,9,2,5]");
        expected = 6;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[1,17,5,10,13,15,10,5,16,8]");
        expected = 7;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = Snippet.stringToIntegerArray("[1,2,3,4,5,6,7,8,9]");
        expected = 2;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = Snippet.stringToIntegerArray("[1,7,4,5,5]");
        expected = 4;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        nums = Snippet.stringToIntegerArray("[1]");
        expected = 1;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        nums = Snippet.stringToIntegerArray("[1,2]");
        expected = 2;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test7(){
        nums = Snippet.stringToIntegerArray("[1,1]");
        expected = 1;
        actual = clz.wiggleMaxLength(nums);
        assertEquals(expected, actual);
    }
}
