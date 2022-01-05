package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n2089_FindTargetIndicesAfterSortingArrayTest {
    
    n2089_FindTargetIndicesAfterSortingArray clz = new n2089_FindTargetIndicesAfterSortingArray();
    int[] nums;
    int target;
    List<Integer> expected;
    List<Integer> actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,5,2,3};
        target = 2;
        expected = List.of(1,2);
        actual = clz.targetIndices(nums, target);
        assertTrue(expected.equals(actual));
    }
    
}
