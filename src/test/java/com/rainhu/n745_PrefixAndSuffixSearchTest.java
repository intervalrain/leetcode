package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class n745_PrefixAndSuffixSearchTest{

    n745_PrefixAndSuffixSearch clz;

    @Test
    public void test1(){
        n745_PrefixAndSuffixSearch clz = new n745_PrefixAndSuffixSearch(new String[]{"apple"});
        assertEquals(clz.f("a", "e"), 0);
    }

    @Test
    public void test2(){
        n745_PrefixAndSuffixSearch clz = new n745_PrefixAndSuffixSearch(new String[]{"apple"});
        assertEquals(clz.f("b", "e"), -1);
    }

    @Test
    public void test3(){
        n745_PrefixAndSuffixSearch clz = new n745_PrefixAndSuffixSearch(new String[]{
            "cabaabaaaa",   // 0
            "ccbcababac",   // 1
            "bacaabccba",   // 2
            "bcbbcbacaa",   // 3 
            "abcaccbcaa",   // 4
            "accabaccaa",   // 5
            "cabcbbbcca",   // 6
            "ababccabcb",   // 7
            "caccbbcbab",   // 8
            "bccbacbcba"}); // 9
        assertEquals(clz.f("bccbacbcba", "a"), 9);
        assertEquals(clz.f("ab", "abcaccbcaa"), 4);
        assertEquals(clz.f("a", "aa"), 5);
        assertEquals(clz.f("cabaaba", "abaaaa"), 0);
        assertEquals(clz.f("cacc", "accbbcbab"), 8);
        assertEquals(clz.f("ccbcab", "bac"), 1);
        assertEquals(clz.f("bac", "cba"), 2);
        assertEquals(clz.f("ac", "accabaccaa"), 5);
        assertEquals(clz.f("bcbb", "aa"), 3);
        assertEquals(clz.f("ccbca", "cbcababac"), 1);
    }


}
