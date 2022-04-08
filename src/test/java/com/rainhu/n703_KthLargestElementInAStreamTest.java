package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n703_KthLargestElementInAStreamTest {
    
    @Test
    public void test1(){
        n703_KthLargestElementInAStream kthLargest = new n703_KthLargestElementInAStream(3, new int[]{4,5,8,2});
        assertEquals(kthLargest.add(3), 4);
        assertEquals(kthLargest.add(5), 5);
        assertEquals(kthLargest.add(10), 5);
        assertEquals(kthLargest.add(9), 8);
        assertEquals(kthLargest.add(4), 8);
    }
    
    @Test
    public void test2(){
        n703_KthLargestElementInAStream kthLargest = new n703_KthLargestElementInAStream(1, new int[]{});
        assertEquals(kthLargest.add(-3), -3);
        assertEquals(kthLargest.add(-2), -2);
        assertEquals(kthLargest.add(-2), -2);
        assertEquals(kthLargest.add(0), 0);
        assertEquals(kthLargest.add(4), 4);
    }
}
