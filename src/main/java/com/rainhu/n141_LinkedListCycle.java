
package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 141. Linked List Cycle (Easy)
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached 
 */

public class n141_LinkedListCycle {
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
