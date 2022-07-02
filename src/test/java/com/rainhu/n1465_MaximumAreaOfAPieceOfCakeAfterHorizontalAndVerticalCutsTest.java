package com.rainhu;

import com.rainhu.ToolUtility.Snippet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class n1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {
    
    n1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts clz = new n1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();
    int h, w;
    int[] horizontalCuts, verticalCuts;
    int expected, actual;

    @Test
    public void test1(){
        h = 5;
        w = 4;
        horizontalCuts = Snippet.stringToIntegerArray("[1,2,4]");
        verticalCuts = Snippet.stringToIntegerArray("[1,3]");
        expected = 4;
        actual = clz.maxArea(h, w, horizontalCuts, verticalCuts);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        h = 5;
        w = 4;
        horizontalCuts = Snippet.stringToIntegerArray("[3,1]");
        verticalCuts = Snippet.stringToIntegerArray("[1]");
        expected = 6;
        actual = clz.maxArea(h, w, horizontalCuts, verticalCuts);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        h = 5;
        w = 4;
        horizontalCuts = Snippet.stringToIntegerArray("[3]");
        verticalCuts = Snippet.stringToIntegerArray("[3]");
        expected = 9;
        actual = clz.maxArea(h, w, horizontalCuts, verticalCuts);
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        h = 6;
        w = 3;
        horizontalCuts = Snippet.stringToIntegerArray("[5,4,1,2,3]");
        verticalCuts = Snippet.stringToIntegerArray("[2,1]");
        expected = 1;
        actual = clz.maxArea(h, w, horizontalCuts, verticalCuts);
        assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        h = (int)1e+9;
        w = (int)1e+9;
        horizontalCuts = Snippet.stringToIntegerArray("[2]");
        verticalCuts = Snippet.stringToIntegerArray("[2]");
        expected = 81;
        actual = clz.maxArea(h, w, horizontalCuts, verticalCuts);
        assertEquals(expected, actual);
    }
}
