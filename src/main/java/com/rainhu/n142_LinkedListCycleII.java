package com.rainhu;

import com.rainhu.DioUtility.ListNode;

/**
 * 142. Linked List Cycle II (Medium)
 * 
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * 
 * Do not modify the linked list.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/20
 * @apiNote: 
 *          -------|-------m-------|
 *          <--a--> <--b--> <--c-->  
 *          fast: a + b + c + b 
 *          slow: a + b
 *          fast = 2 * slow
 *          a + b + c + b = 2 (a + b)
 *          a = c
 */

public class n142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode turt = head;
                while (turt != slow){
                    turt = turt.next;
                    slow = slow.next;
                }
                return turt;
            }
        }
        return null;
    }
}
