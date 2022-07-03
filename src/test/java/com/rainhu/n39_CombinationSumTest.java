package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.rainhu.util.ListTest;

import org.junit.jupiter.api.Test;

public class n39_CombinationSumTest {
    
    n39_CombinationSum clz = new n39_CombinationSum();
    int[] candidates;
    int target;
    List<List<Integer>> expected, actual;

    @Test
    public void test1(){
        candidates = new int[]{2,3,6,7};
        target = 7;
        expected = List.of(List.of(2,2,3), List.of(7));
        actual = clz.combinationSum(candidates, target);
        assertTrue(ListTest.intEquals(expected, actual));
    }

    @Test
    public void test2(){
        candidates = new int[]{2,3,5};
        target = 8;
        expected = List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5));
        actual = clz.combinationSum(candidates, target);
        assertTrue(ListTest.intEquals(expected, actual));
    }

    @Test
    public void test3(){
        candidates = new int[]{2};
        target = 1;
        expected = List.of();
        actual = clz.combinationSum(candidates, target);
        assertTrue(ListTest.intEquals(expected, actual));
    }



}
