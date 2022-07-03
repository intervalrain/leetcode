package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n143_ReorderListTest{

    n143_ReorderList clz = new n143_ReorderList();
    ListNode head;
    ListNode expected;

    @Test
    public void test1(){
        ListNode head = new ListNode(1,2,3,4);
        expected = new ListNode(1,4,2,3);
        clz.reorderList(head);
        assertTrue(head.toString().equals(expected.toString()));
    }

    @Test void test2(){
        ListNode head = new ListNode(1,2,3,4,5);
        expected = new ListNode(1,5,2,4,3);
        clz.reorderList(head);
        assertTrue(head.toString().equals(expected.toString()));
    }
}