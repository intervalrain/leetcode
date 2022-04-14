package com.rainhu;

import com.rainhu.ToolUtility.ListNode;

/**
 * 1290. Convert Binary Number in a Linked List to Integer (Easy)
 * 
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 * 
 * Return the decimal vlaue of the number in the linked list.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/8
 * @apiNote:
 */

public class n1290_ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head){
        if (head == null) return 0;
        int res = head.val;
        while (head.next != null){
            head = head.next;
            res = res * 2 + head.val;
        }
        return res;
    }
}
