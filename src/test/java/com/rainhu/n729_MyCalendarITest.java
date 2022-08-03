package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.rainhu.util.Snippet;

public class n729_MyCalendarITest {

    @Test
    public void test1(){
        n729_MyCalendarI clz = new n729_MyCalendarI();
        int[][] nums = Snippet.stringToInt2dArray("[[10,20],[15,25],[20,30]]");
        boolean[] actual = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++){
            actual[i] = clz.book(nums[i][0], nums[i][1]);
        }
        boolean[] expected = Snippet.stringToBooleanArray("[true,false,true]");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        n729_MyCalendarI clz = new n729_MyCalendarI();
        int[][] nums = Snippet.stringToInt2dArray("[[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]");
        boolean[] actual = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++){
            actual[i] = clz.book(nums[i][0], nums[i][1]);
        }
        boolean[] expected = Snippet.stringToBooleanArray("[true,true,false,false,true,false,true,true,true,false]");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        n729_MyCalendarI clz = new n729_MyCalendarI();
        int[][] nums = Snippet.stringToInt2dArray("[[23,32],[42,50],[6,14],[0,7],[21,30],[26,31],[46,50],[28,36],[0,6],[27,36],[6,11],[20,25],[32,37],[14,20],[7,16],[13,22],[39,47],[37,46],[42,50],[9,17],[49,50],[31,37],[43,49],[2,10],[3,12],[8,14],[14,21],[42,47],[43,49],[36,43]]");
        boolean[] actual = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++){
            actual[i] = clz.book(nums[i][0], nums[i][1]);
        }
        boolean[] expected = Snippet.stringToBooleanArray("[true,true,true,false,false,false,false,false,true,false,false,false,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false]");
        assertArrayEquals(expected, actual);
    }

}
