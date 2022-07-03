package com.rainhu;

import com.rainhu.util.ListNode;

/**
 * 328. Odd Even Linked List (Medium)
 * 
 * Given the head of a singly linked list,
 * group all the nodes with odd indices together followed by the nodes with even indices,
 * and return the reordered list.
 * 
 * The firstnodes is considered odd,
 * and the second node is even, ans so on.
 * 
 * Note that the relative order inside both the even and odd groups should remian as it was in the input.
 * 
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/2
 * @apiNote
 */

public class n328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head){
        if (head != null){
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while (even != null && even.next != null){
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
