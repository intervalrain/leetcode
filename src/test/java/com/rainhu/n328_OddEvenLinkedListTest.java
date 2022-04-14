package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n328_OddEvenLinkedListTest {
    
    n328_OddEvenLinkedList clz = new n328_OddEvenLinkedList();
    ListNode head;
    ListNode expected;
    ListNode actual;

    @Test
    public void test1(){
        head = new ListNode(1,2,3,4,5);
        expected = new ListNode(1,3,5,2,4);
        actual = clz.oddEvenList(head);
        assertTrue(expected.toString().equals(actual.toString()));
    }

    @Test
    public void test2(){
        head = new ListNode(2,1,3,5,6,4,7);
        expected = new ListNode(2,3,6,7,1,5,4);
        actual = clz.oddEvenList(head);
        assertTrue(expected.toString().equals(actual.toString()));
    }
}
