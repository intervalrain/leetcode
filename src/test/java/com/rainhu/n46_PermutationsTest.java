package com.rainhu;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

public class n46_PermutationsTest{

    n46_Permutations clz = new n46_Permutations();
    int[] nums;
    List<List<Integer>> expected;
    List<List<Integer>> actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3};
        expected = List.of(List.of(1,2,3), List.of(1,3,2), List.of(2,1,3), List.of(2,3,1), List.of(3,1,2), List.of(3,2,1));
        actual = clz.permute(nums);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test2(){
        nums = new int[]{0,1};
        expected = List.of(List.of(0,1), List.of(1,0));
        actual = clz.permute(nums);
        assertTrue(equals(expected, actual));
    }
    
    @Test
    public void test3(){
        nums = new int[]{1};
        expected = List.of(List.of(1));
        actual = clz.permute(nums);
        assertTrue(equals(expected, actual));
    }    


    public boolean equals(List<List<Integer>> a, List<List<Integer>> b){
        if (a == null && b == null) return false;
        if ((a == null && b != null) || (a != null && b == null) || a.size() != b.size()) return false;
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
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
}