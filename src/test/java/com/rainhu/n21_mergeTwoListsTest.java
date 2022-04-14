package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n21_mergeTwoListsTest {
    
    n21_MergeTwoSortedLists clz = new n21_MergeTwoSortedLists();
    ListNode l1, l2;
    ListNode expected, actual;

    @Test
    public void test1(){
        l1 = new ListNode(1,2,4);
        l2 = new ListNode(1,3,4);
        expected = new ListNode(1,1,2,3,4,4);
        actual = clz.mergeTwoLists(l1, l2);
        assertTrue(actual.equals(expected));
    }

    @Test
    public void test2(){
        l1 = null;
        l2 = null;
        expected = null;
        actual = clz.mergeTwoLists(l1, l2);
        assertNull(actual);
    }

    @Test
    public void test3(){
        l1 = null;
        l2 = new ListNode(0);
        expected = l2;
        actual = clz.mergeTwoLists(l1, l2);
        assertTrue(actual.equals(expected));
        
    }
}
