package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.rainhu.ToolUtility.Snippet;

import org.junit.jupiter.api.Test;

public class n406_QueueReconstructionByHeightTest {
    
    n406_QueueReconstructionByHeight clz = new n406_QueueReconstructionByHeight();
    int[][] people;
    int[][] expected, actual;

    @Test
    public void test1(){
        people = Snippet.stringToInt2dArray("[[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]");
        expected = Snippet.stringToInt2dArray("[[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]");
        actual = clz.recontructQueue(people);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        people = Snippet.stringToInt2dArray("[[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]");
        expected = Snippet.stringToInt2dArray("[[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]]");
        actual = clz.recontructQueue(people);
        assertArrayEquals(expected, actual);
    }
}
