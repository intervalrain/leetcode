package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 147. Insertion Sort List
 * 
 * Given the head of a singly linked lits,
 * srot the list using insertion sort,
 * and return the sorted list's head.
 * 
 * The steps of the insertion sort algorithm:
 *     1. Insertion sort iterates, consuming one input element each repetition and growing a sorted outputist.
 *     2. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
 *     3. It repeats until no input elements remain.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/16
 * @apiNote
 */

public class n147_InsertionSortList {
    public ListNode insertionSortList(ListNode head){
        return sortList(head, null);
    }

    private ListNode sortList(ListNode head, ListNode tail){
        if (head == null) return head;
        if (head.next == tail){
            head.next = null;
            return head;
        }
        ListNode low = head, fast = head;
        while (fast != tail){
            fast = fast.next;
            low = low.next;
            if (fast != tail) fast = fast.next;
        }
        ListNode mid = low;
        ListNode l1 = sortList(head, mid);
        ListNode l2 = sortList(mid, tail);
        ListNode sorted = merge(l1, l2);
        return sorted;
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead, tmp1 = l1, tmp2 = l2;
        while (tmp1 != null && tmp2 != null){
            if (tmp1.val < tmp2.val){
                curr.next = tmp1;
                tmp1 = tmp1.next;
                curr = curr.next;
            } else {
                curr.next = tmp2;
                tmp2 = tmp2.next;
                curr = curr.next;
            }
        }

        if (tmp1 != null){
            curr.next = tmp1;
        } else if (tmp2 != null){
            curr.next = tmp2;
        }
        return dummyHead.next;
    }



    public static void main(String[] args){
        ListNode head = new ListNode(4,2,1,3);
        System.out.println(new n147_InsertionSortList().insertionSortList(head));
    }
}
