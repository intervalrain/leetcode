package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class n284_PeekingIteratorTest {
    
    @Test
    public void test1(){
    Iterator<Integer> iterator = Arrays.asList(1,2,3).iterator();
    n284_PeekingIterator clz = new n284_PeekingIterator(iterator);
    assertEquals(clz.next(), 1);
    assertEquals(clz.peek(), 2);
    assertEquals(clz.next(), 2);
    assertEquals(clz.next(), 3);
    assertEquals(clz.hasNext(), false);
    }

}
