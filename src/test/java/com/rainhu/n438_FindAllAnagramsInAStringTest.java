package com.rainhu;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

public class n438_FindAllAnagramsInAStringTest {

    n438_FindAllAnagramsInAString clz = new n438_FindAllAnagramsInAString();
    String s, p;
    List<Integer> expected, actual;

    @Test
    public void test1(){
        s = "cbaebabacd";
        p = "abc";
        expected = List.of(0,6);
        actual = clz.findAnagrams(s, p);
        assertTrue(equalsAnyOrder(expected, actual));
    }

    @Test
    public void test2(){
        s = "abab";
        p = "ab";
        expected = List.of(0,1,2);
        actual = clz.findAnagrams(s, p);
        assertTrue(equalsAnyOrder(expected, actual));
    }

    @Test
    public void test3(){
        s = "baa";
        p = "aa";
        expected = List.of(1);
        actual = clz.findAnagrams(s, p);
        assertTrue(equalsAnyOrder(expected, actual));
    }


    public static boolean equalsAnyOrder(List<Integer> expected, List<Integer> actual){
        if (expected == null && actual == null) return false;
        if ((expected == null && actual != null) || (expected != null && actual == null) || expected.size() != actual.size()) return false;

        Object[] exp = expected.toArray();
        Object[] act = actual.toArray();
        Arrays.sort(exp);
        Arrays.sort(act);
        
        return Arrays.toString(exp).equals(Arrays.toString(act));
    }
}
