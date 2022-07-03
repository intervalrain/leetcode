package com.rainhu;

import com.rainhu.util.ListNode;

/**
 * 1721. Swapping Nodes in a Linked List (Medium)
 * 
 * You are given the head of a linked list, and an integer k.
 * 
 * Return the head of the linked list after swapping the values of the kth node rfrom the beginning and the kth node from the end (the list is 1-indexed).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/4
 * @apiNote: LinkedList
 */

public class n1721_SwappingNodesInALinkeddList {
    public ListNode swapNodes(ListNode head, int k){
        ListNode n1 = null, n2 = null;
        for (ListNode curr = head; curr != null; curr = curr.next){
            n2 = n2 == null ? null : n2.next;
            if (--k == 0){
                n1 = curr;
                n2 = head;
            }
        }
        int tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
        return head;

    }
}
