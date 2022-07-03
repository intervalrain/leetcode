package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n147_InsertionSortListTest {
    
    n147_InsertionSortList clz = new n147_InsertionSortList();
    ListNode head;
    ListNode expected;
    ListNode actual;

    @Test
    public void test1(){
        head = new ListNode(4,2,1,3);
        expected = new ListNode(1,2,3,4);
        actual = clz.insertionSortList(head);
        assertTrue(expected.toString().equals(actual.toString()));
    }

    @Test
    public void test2(){
        head = new ListNode(-1,5,3,4,0);
        expected = new ListNode(-1,0,3,4,5);
        actual = clz.insertionSortList(head);
        assertTrue(expected.toString().equals(actual.toString()));
    }
}
