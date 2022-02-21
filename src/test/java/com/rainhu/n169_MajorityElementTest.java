package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n169_MajorityElementTest{

    n169_MajorityElement clz = new n169_MajorityElement();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{3,2,3};
        expected = 3;
        actual = clz.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{2,2,1,1,1,2,2};
        expected = 2;
        actual = clz.majorityElement(nums);
        assertEquals(expected, actual);
    }
}
