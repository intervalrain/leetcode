package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.Snippet;

public class n792_NumberOfMatchingSubsequencesTest {
    
    n792_NumberOfMatchingSubsequences clz = new n792_NumberOfMatchingSubsequences();
    String s;
    String[] words;
    int expected, actual;

    @Test
    public void test1(){
        s = "abcde";
        words = Snippet.stringToStringArray("[a,bb,acd,ace]");
        expected = 3;
        actual = clz.numMatchingSubseq(s, words);
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        s = "dsahjpjauf";
        words = Snippet.stringToStringArray("[ahjpjau,ja,ahbwzgqnuk,tnmlanowax]");
        expected = 2;
        actual = clz.numMatchingSubseq(s, words);
        assertEquals(expected, actual);
    }
}
