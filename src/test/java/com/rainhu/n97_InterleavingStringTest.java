package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class n97_InterleavingStringTest {
    
    n97_InterleavingString clz = new n97_InterleavingString();
    String s1, s2, s3;
    boolean expected, actual;

    @Test
    public void test1(){
        s1 = "aabcc";
        s2 = "dbbca";
        s3 = "aadbbcbcac";
        expected = true;
        actual = clz.isInterleave(s1, s2, s3);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s1 = "aabcc";
        s2 = "dbbca";
        s3 = "aadbbbaccc";
        expected = false;
        actual = clz.isInterleave(s1, s2, s3);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s1 = "";
        s2 = "";
        s3 = "";
        expected = true;
        actual = clz.isInterleave(s1, s2, s3);
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        s1 = "ab";
        s2 = "bc";
        s3 = "bbac";
        expected = false;
        actual = clz.isInterleave(s1, s2, s3);
        assertEquals(expected, actual);
    }
}
