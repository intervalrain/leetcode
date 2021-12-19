package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.DioUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n1290_ConvertBinaryNumberInALinkedListToIntegerTest {
    
    n1290_ConvertBinaryNumberInALinkedListToInteger clz = new n1290_ConvertBinaryNumberInALinkedListToInteger();
    ListNode head;
    int expected;
    int actual;

    @Test
    public void test1(){
        head = new ListNode(1,0,1);
        expected = 5;
        actual = clz.getDecimalValue(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        head = new ListNode(0);
        expected = 0;
        actual = clz.getDecimalValue(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        head = new ListNode(1);
        expected = 1;
        actual = clz.getDecimalValue(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        head = new ListNode(1,0,0,1,0,0,1,1,1,0,0,0,0,0,0);
        expected = 18880;
        actual = clz.getDecimalValue(head);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test5(){
        head = new ListNode(0,0);
        expected = 0;
        actual = clz.getDecimalValue(head);
        assertEquals(expected, actual);
    }
}
