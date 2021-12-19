package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 19. Remove Nth Node From End of List (Medium)
 * 
 * Given the head of linked list, 
 * remove the nth node from the end of the list and return its head.
 */

public class n19_RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n){
        if(n==1 && head.next == null)
            return null;
        
        int size = 1;
        ListNode runner = head;
        ListNode tracer = head;
        
        for (int i=0; i<n; i++){
            runner = runner.next;
            size++;
        }
        if(runner == null)
            return head.next;

        while(runner.next != null){
            runner = runner.next;
            tracer = tracer.next;
            size++;
        }
        if(n==1){
            tracer.next = null;
        } else if(n==size){
            return head.next;
        } else {
            tracer.next = tracer.next.next;
        }
        return head;
    }
}
