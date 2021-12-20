package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n1200_MinimumAbsoluteDifferenceTest {
    
    n1200_MinimumAbsoluteDifference clz = new n1200_MinimumAbsoluteDifference();
    int[] arr;
    List<List<Integer>> expected;
    List<List<Integer>> actual;

    @Test
    public void test1(){
        arr = new int[]{4,2,1,3};
        expected = List.of(List.of(1,2), List.of(2,3), List.of(3,4));
        actual = clz.minimumAbsDifference(arr);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test2(){
        arr = new int[]{1,3,6,10,15};
        expected = List.of(List.of(1,3));
        actual = clz.minimumAbsDifference(arr);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test3(){
        arr = new int[]{3,8,-10,23,19,-4,-14,27};
        expected = List.of(List.of(-14,-10), List.of(19, 23), List.of(23,27));
        actual = clz.minimumAbsDifference(arr);
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
