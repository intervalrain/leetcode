package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.Snippet;
public class n1713_MinimumOperationsToMakeASubsequenceTest {

    n1713_MinimumOperationsToMakeASubsequence clz = new n1713_MinimumOperationsToMakeASubsequence();
    int[] target;
    int[] arr;
    int expected, actual;

    @Test
    public void test1(){
        target = Snippet.stringToIntegerArray("[5,1,3]");        
        arr = Snippet.stringToIntegerArray("[9,4,2,3,4]");
        expected = 2;
        actual = clz.minOperations(target, arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        target = Snippet.stringToIntegerArray("[6,4,8,1,3,2]");
        arr = Snippet.stringToIntegerArray("[4,7,6,2,3,8,6,1]");
        expected = 3;
        actual = clz.minOperations(target, arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        target = Snippet.stringToIntegerArray("[16,7,20,11,15,13,10,14,6,8]");
        arr = Snippet.stringToIntegerArray("[11,14,15,7,5,5,6,10,11,6]");
        expected = 6;
        actual = clz.minOperations(target, arr);
        assertEquals(expected, actual);
    }
}
