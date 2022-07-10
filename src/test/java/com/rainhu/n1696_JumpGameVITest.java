package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n1696_JumpGameVITest {
    
    n1696_JumpGameVI clz = new n1696_JumpGameVI();
    int[] nums;
    int k;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[1,-1,-2,4,-7,3]");
        k = 2;
        expected = 7;
        actual = clz.maxResult(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[10,-5,-2,4,0,3]");
        k = 3;
        expected = 17;
        actual = clz.maxResult(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = Snippet.stringToIntegerArray("[1,-5,-20,4,-1,3,-6,-3]");
        k = 2;
        expected = 0;
        actual = clz.maxResult(nums, k);
        assertEquals(expected, actual);
    }

}
