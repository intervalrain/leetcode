package com.rainhu;

/**
 * 24. Swap Nodes in Pairs (Medium)
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes(i,e, only nodes themselves may be chnaged)
 */

import com.rainhu.DioUtility.ListNode;

public class n24_SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode p = head.next;
        head.next = swapPairs(head.next.next);
        p.next = head;
        
        return p;
    }
}
