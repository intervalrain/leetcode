package com.rainhu;

import com.rainhu.ToolUtility.ListNode;

public class n25_ReverseNodesInKgroup{
    
    public static ListNode reverseKGroup(ListNode head, int k){
        
        ListNode p = head;
        int count = 0;
        while (p != null && count != k){
            p = p.next;
            count++;
        }
        if (count == k){
            p = reverseKGroup(p, k);
            while(count-- > 0){
                ListNode n = head.next;
                head.next = p;
                p = head;
                head = n;
            }
            head = p;
        }
        
        return head;
    }
}