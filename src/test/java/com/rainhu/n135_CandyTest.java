package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n135_CandyTest {
    
    n135_Candy clz = new n135_Candy();
    int[] ratings;
    int expected, actual;

    @Test
    public void test1(){
        ratings = Snippet.stringToIntegerArray("[1,0,2]");
        expected = 5;
        actual = clz.candy(ratings);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        ratings = Snippet.stringToIntegerArray("[1,2,2]");
        expected = 4;
        actual = clz.candy(ratings);
        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        ratings = Snippet.stringToIntegerArray("[0]");
        expected = 1;
        actual = clz.candy(ratings);
        assertEquals(expected, actual);
    }
}
