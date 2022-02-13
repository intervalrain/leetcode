package com.rainhu;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class n78_SubsetsTest {
    
    n78_Subsets clz = new n78_Subsets();
    int[] nums;
    List<List<Integer>> expected, actual;

    public boolean equals(List<List<Integer>> a, List<List<Integer>> b){
        if (a == null && b == null) return false;
        if ((a == null && b != null) || (a != null && b == null) || a.size() != b.size()) return false;
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < a.size(); i++){
            c.add(a.get(i).toString());
            d.add(b.get(i).toString());
        }
        c = new ArrayList<String>(c);
        d = new ArrayList<String>(d);

        Collections.sort(c);
        Collections.sort(d);        
        
        return c.equals(d);
    }

    @Test
    public void test1(){
        nums = new int[]{1,2,3};
        expected = List.of(List.of(), List.of(1), List.of(2), List.of(1,2), List.of(3), List.of(1,3), List.of(2,3), List.of(1,2,3));
        actual = clz.subsets(nums);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test2(){
        nums = new int[]{0};
        expected = List.of(List.of(), List.of(0));
        actual = clz.subsets(nums);
        assertTrue(equals(expected, actual));
    }



}
