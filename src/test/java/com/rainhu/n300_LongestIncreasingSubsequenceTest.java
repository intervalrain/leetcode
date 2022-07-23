package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n300_LongestIncreasingSubsequenceTest {
    
    n300_LongestIncreasingSubsequence clz = new n300_LongestIncreasingSubsequence();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[10,9,2,5,3,7,101,18]");
        expected = 4;
        actual = clz.lengthOfList(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[0,1,0,3,2,3]");
        expected = 4;
        actual = clz.lengthOfList(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = Snippet.stringToIntegerArray("[7,7,7,7,7,7,7]");
        expected = 1;
        actual = clz.lengthOfList(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = Snippet.stringToIntegerArray("[10,9,2,5,6,3,7,101,18]");
        expected = 5;
        actual = clz.lengthOfList(nums);
        assertEquals(expected, actual);
    }
}
