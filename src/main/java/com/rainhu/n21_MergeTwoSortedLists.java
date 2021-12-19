package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 21. Merge Two Sorted Lists (Easy)
 * 
 * Merge two sorted linked lists and return it as a sorted lists.
 * The list should be made by splicing together the noeds of the first two lists.
 */

public class n21_MergeTwoSortedLists{

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;

        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(0);
        ListNode run = head;
        
        while(p !=null && q != null){
            if (p.val < q.val){
                run.next = p;
                run = run.next;
                if(p.next == null){
                    p.next = q;
                    break;
                }
                p = p.next;
            } else {
                run.next = q;
                run = run.next;
                if(q.next == null){
                    q.next = p;
                    break;
                }
                q = q.next;
            }
        }
        
        return head.next;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1, 2, 4);
        ListNode l2 = new ListNode(1, 3, 4);

        ListNode l = mergeTwoLists(l1, l2);
        System.out.print(l.val);
        while(l.next != null){
            l = l.next;
            System.out.print(l.val);
        }
        System.out.println();
    }
}