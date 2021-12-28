package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 876. Middle of the Linked List (Easy)
 * 
 * Given the head of singly linked list,
 * return the middle node of the linked list.
 * 
 * If there are two middle nodes, return the second middle node.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/28
 * @apiNote
 */

public class n876_MiddleOfTheLinkedList{
    public ListNode middleNode(ListNode head){
        ListNode lead = head;
        while (lead != null && lead.next != null){
            lead = lead.next.next;
            head = head.next;
        }
        return head;
    }
}