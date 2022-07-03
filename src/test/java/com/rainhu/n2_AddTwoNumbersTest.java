package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n2_AddTwoNumbersTest {
    n2_AddTwoNumbers clz = new n2_AddTwoNumbers();

    ListNode l1, l2;
    ListNode actual, expected;
    
    @Test
    public void test1(){
        l1 = new ListNode(2,4,3);
        l2 = new ListNode(5,6,4);
        actual = clz.addTwoNumbers(l1, l2);
        expected = new ListNode(7,0,8);
        assertEquals(actual.size(), expected.size());
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test2(){
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        actual = clz.addTwoNumbers(l1, l2);
        expected = new ListNode(0);
        assertEquals(actual.size(), expected.size());
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test3(){
        l1 = new ListNode(9,9,9,9,9,9,9);
        l2 = new ListNode(9,9,9,9);
        actual = clz.addTwoNumbers(l1, l2);
        expected = new ListNode(8,9,9,9,0,0,0,1);
        assertEquals(expected.size(), actual.size());
        assertEquals(expected.toString(), actual.toString());
    }
    
}
