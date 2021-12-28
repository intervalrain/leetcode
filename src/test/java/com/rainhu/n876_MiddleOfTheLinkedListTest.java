package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.DioUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n876_MiddleOfTheLinkedListTest{

    n876_MiddleOfTheLinkedList clz = new n876_MiddleOfTheLinkedList();
    ListNode head;
    ListNode expected;
    ListNode actual;

    @Test
    public void test1(){
        head = new ListNode(1,2,3,4,5);
        expected = new ListNode(3,4,5);
        actual = clz.middleNode(head);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test2(){
        head = new ListNode(1,2,3,4,5,6);
        expected = new ListNode(4,5,6);
        actual = clz.middleNode(head);
        assertEquals(expected.toString(), actual.toString());
    }
}