package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 21. Merge Two Sorted Lists (Easy)
 * 
 * Merge two sorted linked lists and return it as a sorted lists.
 * The list should be made by splicing together the noeds of the first two lists.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/3/7
 * @apiNote: LinkedList
 */

public class n21_MergeTwoSortedLists{

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null){
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        return dummy.next;
    }
}