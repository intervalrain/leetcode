package com.rainhu;

import com.rainhu.util.ListNode;

/**
 * 148. Sort List (Medium)
 * 
 * Given the head of a linked list, return the list after sorting it in a ascending order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/24
 * @apiNote: merge sort
 */

public class n148_SortList {
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }

    ListNode merge(ListNode l1, ListNode l2){
        ListNode dmy = new ListNode(0), curr = dmy;
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
        if (l1 != null){
            curr.next = l1;
        } else {
            curr.next = l2;
        }
        return dmy.next;
    }
}
