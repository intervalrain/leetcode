package com.rainhu;

import com.rainhu.ToolUtility.ListNode;

/**
 * 143. Reorder List (Medium)
 * 
 * You are given the head of a singly linked-list.
 * The list can be represented as:
 *     L0 -> L1 -> ... -> Ln-1 -> Ln
 * Reorder the list to be on the following form:
 *     L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 -> ...
 * You may not modify the values in the list's nodes.
 * Only nodes themselves may be changed.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/23
 * @apiNote: 1. Find the middle of the List
 *           2. Reverse the half after middle
 *           3. Start reorder one by one
 */
public class n143_ReorderList{
    public void reorderList(ListNode head){
        if (head == null || head.next == null) return;

        // Find the middle of the List
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // Reverse the half after middle
        ListNode mid = p1;
        ListNode curr = p1.next;
        while (curr.next != null){
            ListNode tmp = curr.next;
            curr.next = tmp.next;
            tmp.next = mid.next;
            mid.next = tmp;
        }

        // Start reorder one by one
        p1 = head;
        p2 = mid.next;
        while (p1 != mid){
            mid.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = mid.next;
        }

    }

}