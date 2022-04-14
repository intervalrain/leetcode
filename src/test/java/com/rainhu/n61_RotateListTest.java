package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n61_RotateListTest {

    n61_RotateList clz = new n61_RotateList();
    ListNode head;
    int k;
    ListNode expected, actual;

    @Test
    public void test1(){
        head = new ListNode(1,2,3,4,5);
        k = 2;
        expected = new ListNode(4,5,1,2,3);
        actual = clz.rotateRight(head, k);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        head = new ListNode(0,1,2);
        k = 4;
        expected = new ListNode(2,0,1);
        actual = clz.rotateRight(head, k);
        assertTrue(expected.equals(actual));
    }

    @Test 
    public void test3(){
        head = null;
        k = 1;
        expected = null;
        actual = clz.rotateRight(head, k);
        assertNull(actual);
    }

    @Test
    public void test4(){
        head = new ListNode(1);
        k = 0;
        expected = head;
        actual = clz.rotateRight(head, k);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test5(){
        head = new ListNode(1);
        k = 99;
        expected = head;
        actual = clz.rotateRight(head, k);
        assertTrue(expected.equals(actual));
    }
}
