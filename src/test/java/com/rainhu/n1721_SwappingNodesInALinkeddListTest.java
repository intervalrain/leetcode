package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n1721_SwappingNodesInALinkeddListTest {
    
    n1721_SwappingNodesInALinkeddList clz = new n1721_SwappingNodesInALinkeddList();
    ListNode head;
    int k;
    ListNode expected, actual;

    @Test
    public void test1(){
        head = new ListNode(1,2,3,4,5);
        k = 2;
        expected = new ListNode(1,4,3,2,5);
        actual = clz.swapNodes(head, k);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        head = new ListNode(7,9,6,6,7,8,3,0,9,5);
        k = 5;
        expected = new ListNode(7,9,6,6,8,7,3,0,9,5);
        actual = clz.swapNodes(head, k);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test3(){
        head = new ListNode(1);
        k = 1;
        expected = new ListNode(1);
        actual = clz.swapNodes(head, k);
        assertTrue(expected.equals(actual));
    }


    @Test
    public void test4(){
        head = new ListNode(1,2);
        k = 1;
        expected = new ListNode(2,1);
        actual = clz.swapNodes(head, k);
        assertTrue(expected.equals(actual));
    }
}
