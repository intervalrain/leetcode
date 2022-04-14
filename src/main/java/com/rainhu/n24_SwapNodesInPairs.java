package com.rainhu;

import com.rainhu.ToolUtility.ListNode;

public class n24_SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode p = head.next;
        head.next = swapPairs(head.next.next);
        p.next = head;
        
        return p;
    }
}
