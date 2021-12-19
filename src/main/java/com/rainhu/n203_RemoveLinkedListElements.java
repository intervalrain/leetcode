package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 203. Remove Linked List Elements (Easy)
 * 
 * Given the head of a linked list and an integer val, 
 * remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/13
 * @apiNote: easy
 */

public class n203_RemoveLinkedListElements{
    public ListNode removeElements(ListNode head, int val){
        while (head != null && head.val == val){
            head = head.next;
        }
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head;
    }
    public static void main(String[] args){
        ListNode list = new ListNode(1,2,6,3,4,5,6);
        new n203_RemoveLinkedListElements().removeElements(list, 6);
        System.out.println(list.toString());
    }    
}


