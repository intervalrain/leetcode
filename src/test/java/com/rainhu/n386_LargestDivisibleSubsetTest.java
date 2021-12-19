package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class n386_LargestDivisibleSubsetTest {
    
    n386_LargestDivisibleSubset clz = new n386_LargestDivisibleSubset();
    int[] nums;
    List<Integer> expected;
    List<Integer> actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3};
        expected = List.of(1,2);
        actual = clz.largestDivisibleSubset(nums);
        Object[] ans = expected.toArray();
        Object[] res = actual.toArray();
        Arrays.sort(ans);
        Arrays.sort(res);
        assertArrayEquals(ans, res);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,4,8};
        expected = List.of(1,2,4,8);
        actual = clz.largestDivisibleSubset(nums);
        Object[] ans = expected.toArray();
        Object[] res = actual.toArray();
        Arrays.sort(ans);
        Arrays.sort(res);
        assertArrayEquals(ans, res);
    }

}
