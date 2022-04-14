package com.rainhu;

import com.rainhu.ToolUtility.ListNode;

public class n83_RemoveDuplicatesFromSortedList {
    
    public ListNode deleteDuplicates(ListNode head){
        if (head == null) return head;

        ListNode p = head;
        ListNode q = head.next;
        while(true){
            if (q == null) {
                p.next = null;
                break;
            } else if (p.val == q.val){
                q = q.next;
            } else {
                p.next = q;
                p = q;
                q = q.next;
            }
        }
        return head;
    }
}
