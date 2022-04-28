package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n1202_SmallestStringWithSwapsTest {
    
    n1202_SmallestStringWithSwaps clz = new n1202_SmallestStringWithSwaps();
    String s;
    List<List<Integer>> pairs;
    String expected, actual;
    
    @Test
    public void test1(){
        s = "dcab";
        pairs = Arrays.asList(Arrays.asList(0,3), Arrays.asList(1,2));
        expected = "bacd";
        actual = clz.smallestStringWithSwaps(s, pairs);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "dcab";
        pairs = Arrays.asList(Arrays.asList(0,3), Arrays.asList(1,2), Arrays.asList(0,2));
        expected = "abcd";
        actual = clz.smallestStringWithSwaps(s, pairs);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "cba";
        pairs = Arrays.asList(Arrays.asList(0,1),Arrays.asList(1,2));
        expected = "abc";
        actual = clz.smallestStringWithSwaps(s, pairs);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "zbxxxdgmbz";
        pairs = Arrays.asList(Arrays.asList(1,0),Arrays.asList(7,1),Arrays.asList(9,1),Arrays.asList(3,0),Arrays.asList(7,1),Arrays.asList(0,4),Arrays.asList(6,5),Arrays.asList(2,6),Arrays.asList(6,4),Arrays.asList(6,0));
        expected = "bdgmxxxzbz";
        actual = clz.smallestStringWithSwaps(s, pairs);
        assertEquals(expected, actual);
    }
}

