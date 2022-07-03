package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n142_LinkedListCycleIITest {
    
    n142_LinkedListCycleII clz = new n142_LinkedListCycleII();
    ListNode head;
    ListNode expected;
    ListNode actual;

    static void connect(ListNode head, int pos){
        ListNode curr = head;
        if (pos == -1)
            return;
        int cnt = 0;
        while (cnt != pos){
            curr = curr.next;
            cnt++;
        }
        ListNode start = curr;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = start;
    }

    static ListNode getListNode(ListNode head, int index){
        for (int i = 0; i < index; i++){
            head = head.next;
        }
        return head;
    }

    @Test
    public void test1(){
        ListNode head = new ListNode(3,2,0,-4);
        connect(head, 1);
        expected = getListNode(head, 1);
        actual = clz.detectCycle(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        ListNode head = new ListNode(1,2);
        connect(head, 0);
        expected = getListNode(head, 0);
        actual = clz.detectCycle(head);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        ListNode head = new ListNode(1);
        expected = null;
        actual = clz.detectCycle(head);
        assertEquals(expected, actual);
    }

}
