package com.rainhu;

import com.rainhu.util.ListNode;

/**
 * 61. Rotate List (Medium)
 * 
 * Given the head of a linked list, rotate the list to the right by k places
 */

public class n61_RotateList {
    ListNode rotateRight(ListNode head, int k){
        if (head == null || k == 0) return head;
        ListNode curr = head;
        // int n = head.size();
        int n = 0;
        while (curr != null){
            curr = curr.next;
            n++;
        }
        curr = head;
        k = k > n ? (n - (k % n)) : n - k;
        if (k == 0) return head;
        k--;
        while (k > 0){
            curr = curr.next;
            k--;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        curr = newHead;
        if (curr == null) return head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = head;
        return newHead;
    }   
}
