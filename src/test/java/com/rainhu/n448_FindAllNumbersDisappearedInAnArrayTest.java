package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n448_FindAllNumbersDisappearedInAnArrayTest {
    
    n448_FindAllNumbersDisappearedInAnArray clz = new n448_FindAllNumbersDisappearedInAnArray();
    int[] nums;
    List<Integer> expected;
    List<Integer> actual;

    public boolean assertListEquals(List<Integer> expected, List<Integer> actual){
        if (expected.size() != actual.size()) return false;
        for (int i=0; i<expected.size(); i++){
            if (expected.get(i) != actual.get(i)){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1(){
        nums = new int[]{4,3,2,7,8,2,3,1};
        expected = List.of(5,6);
        actual = clz.findDisappearNumbers(nums);
        assertTrue(assertListEquals(expected, actual));
    }

    @Test
    public void test2(){
        nums = new int[]{1,1};
        expected = List.of(2);
        actual = clz.findDisappearNumbers(nums);
        assertTrue(assertListEquals(expected, actual));
    }

    @Test
    public void test3(){
        nums = new int[]{3,3,3,3,3,3,3,3,3,4};
        expected = List.of(1,2,5,6,7,8,9,10);
        actual = clz.findDisappearNumbers(nums);
        assertTrue(assertListEquals(expected, actual));
    }

    @Test
    public void test4(){
        nums = new int[]{1,3,5,7,9,11,3,5,7,9,11};
        expected = List.of(2,4,6,8,10);
        actual = clz.findDisappearNumbers(nums);
        assertTrue(assertListEquals(expected, actual));
    }
}
