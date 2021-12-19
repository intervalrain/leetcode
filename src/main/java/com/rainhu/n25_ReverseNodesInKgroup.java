package com.rainhu;

/**
 * 25. Reverse Nodes in k-Group (Hard)
 * 
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 */

import com.rainhu.DioUtility.ListNode;

public class n25_ReverseNodesInKgroup{
    
    public static ListNode reverseKGroup(ListNode head, int k){
        
        ListNode p = head;
        int count = 0;
        while (p != null && count != k){
            p = p.next;
            count++;
        }
        if (count == k){
            p = reverseKGroup(p, k);
            while(count-- > 0){
                ListNode n = head.next;
                head.next = p;
                p = head;
                head = n;
            }
            head = p;
        }
        
        return head;
    }
}