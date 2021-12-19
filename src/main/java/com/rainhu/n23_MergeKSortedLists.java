package com.rainhu;

/**
 * 23. Merge k Sorted Lists (Hard) 
 * 
 * You are given an array of k linked-lists lists,
 * each linked-lists is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 */

import com.rainhu.DioUtility.ListNode;

public class n23_MergeKSortedLists {
    
    public static ListNode mergeKLists(ListNode[] lists){
        if (lists == null || lists.length == 0)
            return null;
        int len = lists.length;
        while(len > 1){
            int interval = (len+1)/2;
            for(int i=0; i<len/2; i++){
                lists[i] = subMerge(lists[i], lists[i+interval]);
            }
            len = interval;
        }
        return lists[0];
    }
    private static ListNode subMerge(ListNode l1, ListNode l2){
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
}
