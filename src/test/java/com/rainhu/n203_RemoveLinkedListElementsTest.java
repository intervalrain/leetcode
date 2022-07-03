package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n203_RemoveLinkedListElementsTest {
    
    n203_RemoveLinkedListElements clz = new n203_RemoveLinkedListElements();
    ListNode head;
    int val;
    ListNode expected;
    ListNode actual;

    public boolean iterateListNode(ListNode node1, ListNode node2){
        while (node1 != null){
            if (node2 == null) 
                return false;
            assertEquals(node1.val, node2.val);
            node1 = node1.next;
            node2 = node2.next;
        }
        if (node2 != null)
            return false;
        return true;
    }

    @Test
    public void test1(){
        head = new ListNode(1,2,6,3,4,5,6);
        actual = clz.removeElements(head, 6);
        expected = new ListNode(1,2,3,4,5);
        assertTrue(new n203_RemoveLinkedListElementsTest().iterateListNode(expected, actual));
    }
    
    @Test
    public void test3(){
        head = new ListNode();
        actual = clz.removeElements(head, 1);
        expected = new ListNode();
        assertTrue(new n203_RemoveLinkedListElementsTest().iterateListNode(expected, actual));
    }        

    @Test
    public void test2(){
        head = new ListNode(7,7,7,7);
        actual = clz.removeElements(head, 7);
        expected = null;
        assertTrue(new n203_RemoveLinkedListElementsTest().iterateListNode(expected, actual));
    }
        
    
}
