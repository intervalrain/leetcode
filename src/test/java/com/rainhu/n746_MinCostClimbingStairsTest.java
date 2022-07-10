package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n746_MinCostClimbingStairsTest {
    
    n746_MinCostClimbingStairs clz = new n746_MinCostClimbingStairs();
    int[] cost;
    int expected, actual;

    @Test
    public void test1(){
        cost = Snippet.stringToIntegerArray("[10,15,20]");
        expected = 15;
        actual = clz.MinCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        cost = Snippet.stringToIntegerArray("[1,100,1,1,1,100,1,1,100,1]");
        expected = 6;
        actual = clz.MinCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }
}
