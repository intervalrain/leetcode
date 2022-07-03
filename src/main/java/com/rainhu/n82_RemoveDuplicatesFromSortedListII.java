package com.rainhu;

import com.rainhu.util.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II (Medium)
 * 
 * Given the head of a sorted linked list,
 * delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * Return the linked list sorted as well.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/10
 * @apiNote: Linked List
 */

public class n82_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head){
        if (head == null) return head;
        ListNode curr = head;
        int[] map = new int[201];
        while (curr != null){
            map[curr.val+100]++;
            curr = curr.next;
        }
        ListNode dummy = new ListNode();
        curr = dummy;
        for (int i = 0; i < 201; i++){
            if (map[i] == 1){
                curr.next = new ListNode(i-100);
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    /** best solution */
    public ListNode deleteDups(ListNode head){
        if (head == null) return null;
        if (head.next == null) return head;
        if (head.next.next == null){
            if (head.val == head.next.val){
                return null;
            }
            return head;
        }
        
        head = new ListNode(0, head);
        ListNode second = head;

        while (head != null){
            ListNode node = head.next;
            ListNode nextNode = node != null ? node.next : null;
            boolean isok = false;
            while (nextNode != null && node != null && node.val == nextNode.val){
                isok = true;
                node = node.next;
            }
            head.next = node;
            if (!isok){
                head = head.next;
            }
        }
        return second.next;
    }
}
