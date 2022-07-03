package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.ListNode;

import org.junit.jupiter.api.Test;

public class n160_IntersectionOfTwoLinkedListTest {
    
    n160_IntersectionOfTwoLinkedList clz = new n160_IntersectionOfTwoLinkedList();
    ListNode headA, headB;
    ListNode listA, listB;
    int skipA, skipB;
    
    public boolean judge(ListNode headA, ListNode headB, ListNode listA, ListNode listB, int skipA, int skipB){
        if (!listA.toString().equals(headA.toString())) return false;
        if (!listB.toString().equals(headB.toString())) return false;
        for (int i = 0; i < skipA; i++){
            headA = headA.next;
        }
        for (int i = 0; i < skipB; i++){
            headB = headB.next;
        }
        if (headA == null && headB == null) return true;
        return headA.val == headB.val;
    }

    public void connect(ListNode headB, ListNode headA, int index){
        ListNode currA = headA;
        ListNode currB = headB;
        while (currB.next != null)
            currB = currB.next;
        for (int i = 0; i < index; i++)
            currA = currA.next;
        currB.next = currA;
    }

    public ListNode getNode(ListNode node, int skip){
        ListNode curr = node;
        for (int i = 0; i < skip; i++)
            curr = curr.next;
        return curr;
    }

    @Test
    public void test1(){
        headA = new ListNode(4,1,8,4,5);
        headB = new ListNode(5,6,1);
        connect(headB, headA, 2);
        listA = new ListNode(4,1,8,4,5);
        listB = new ListNode(5,6,1,8,4,5);
        skipA = 2;
        skipB = 3;
        judge(headA, headB, listA, listB, skipA, skipB);
        assertEquals(getNode(headA, skipA), getNode(headB, skipB));
        assertEquals(getNode(headA, skipA).val, 8);
    }

    @Test
    public void test2(){
        headA = new ListNode(1,9,1,2,4);
        headB = new ListNode(3);
        connect(headB, headA, 3);
        listA = new ListNode(1,9,1,2,4);
        listB = new ListNode(3,2,4);
        skipA = 3;
        skipB = 1;
        judge(headA, headB, listA, listB, skipA, skipB);
        assertEquals(getNode(headA, skipA), getNode(headB, skipB));
        assertEquals(getNode(headA, skipA).val, 2);
    }

    @Test
    public void test3(){
        headA = new ListNode(2,6,4);
        headB = new ListNode(3);
        listA = new ListNode(2,6,4);
        listB = new ListNode(3);
        skipA = 3;
        skipB = 1;
        judge(headA, headB, listA, listB, skipA, skipB);
        assertEquals(getNode(headA, skipA), getNode(headB, skipB));
        assertEquals(getNode(headA, skipA), null);
    }
}
