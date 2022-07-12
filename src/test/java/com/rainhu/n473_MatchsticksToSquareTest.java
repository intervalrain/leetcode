package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n473_MatchsticksToSquareTest {
    
    n473_MatchsticksToSquare clz = new n473_MatchsticksToSquare();
    int[] matchsticks;
    boolean expected, actual;

    @Test
    public void test1(){
        matchsticks = Snippet.stringToIntegerArray("[1,1,2,2,2]");
        expected = true;
        actual = clz.makesquare(matchsticks);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        matchsticks = Snippet.stringToIntegerArray("[3,3,3,3,4]");
        expected = false;
        actual = clz.makesquare(matchsticks);
        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        matchsticks = Snippet.stringToIntegerArray("[1]");
        expected = false;
        actual = clz.makesquare(matchsticks);
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        matchsticks = Snippet.stringToIntegerArray("[5,5,5,5,4,4,4,4,3,3,3,3]");
        expected = true;
        actual = clz.makesquare(matchsticks);
        assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        matchsticks = Snippet.stringToIntegerArray("[10,6,5,5,5,3,3,3,2,2,2,2]");
        expected = true;
        actual = clz.makesquare(matchsticks);
        assertEquals(expected, actual);
    }
}
