package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n141_LinkedListCycleTest {
    
    n141_LinkedListCycle clz = new n141_LinkedListCycle();
    ListNode head;
    boolean expected, actual;

    @Test
    public void test1(){
        head = new ListNode(3,2,0,4);
        head.next.next.next.next = head.next;
        expected = true;
        actual = clz.hasCycle(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        head = new ListNode(1,2);
        head.next.next = head;
        expected = true;
        actual = clz.hasCycle(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        head = new ListNode(1);
        expected = false;
        actual = clz.hasCycle(head);
        assertEquals(expected, actual);
    }
}

