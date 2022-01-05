package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n131_PalindromePartitioingTest {
    
    n131_PalindromePartitioing clz = new n131_PalindromePartitioing();
    String s = "aab";
    List<List<String>> expected;
    List<List<String>> actual;

    @Test
    public void test1(){
        s = "aab";
        expected = List.of(List.of("a","a","b"), List.of("aa","b"));
        actual = clz.partition(s);
        assertTrue(equals(expected, actual));
    }


    @Test
    public void test2(){
        s = "a";
        expected = List.of(List.of("a"));
        actual = clz.partition(s);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test3(){
        s = "aabaa";
        expected = List.of(List.of("a","a","b","a","a"), List.of("aa","b","a","a"), List.of("a","a","b","aa"), List.of("a","aba","a"), List.of("aabaa"), List.of("aa","b","aa"));
        actual = clz.partition(s);
        assertTrue(equals(expected, actual));
    }


    public boolean equals(List<List<String>> a, List<List<String>> b){
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
