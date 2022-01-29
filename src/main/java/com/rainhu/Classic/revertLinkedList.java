package com.rainhu;

import com.rainhu.DioUtility.ListNode;

public class revertLinkedList {
    
    /** Iterative Method
     * 
     * 1. Initialize three points prev as NULL, curr as head and next as NULL.
     * 2. Iterate through the linked list. In loop do 
     *    store next node
     *    change next of current
     *    move prev and curr one step forward
     */
    public ListNode reverseIterative(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    /** Recursive Method
     * 
     * 1. Divide the list in two parts - first node and rest of the linked list.
     * 2. Call reverse for the rest of the linked list.
     * 3. Link rest to first
     * 4. Fix head pointer
     */
    public ListNode reverseRecursive(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode rest = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    public static void main(String[] args){    
        ListNode node = new ListNode(1,2,3,4,5,6,7,8,9);
        revertLinkedList clz = new revertLinkedList();
        System.out.println(clz.reverseIterative(node).toString());
        node = new ListNode(1,2,3,4,5,6,7,8,9);
        System.out.println(clz.reverseRecursive(node).toString());
    }
}
