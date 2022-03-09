package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.DioUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n82_RemoveDuplicatesFromSortedListIITest {

    n82_RemoveDuplicatesFromSortedListII clz = new n82_RemoveDuplicatesFromSortedListII();
    ListNode head;
    ListNode expected, actual;

    @Test
    public void test1(){
        head = new ListNode(1,2,3,3,4,4,5);
        expected = new ListNode(1,2,5);
        actual = clz.deleteDuplicates(head);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        head = new ListNode(1,1,1,2,3);
        expected = new ListNode(2,3);
        actual = clz.deleteDuplicates(head);
        assertTrue(expected.equals(actual));
    }
}
