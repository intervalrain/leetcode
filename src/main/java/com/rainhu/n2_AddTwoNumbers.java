package com.rainhu;

import com.rainhu.ToolUtility.ListNode;

/**
 * 2. Add two Numbeds (Medium)
 * 
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order,
 * and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero,
 * except the number 0 itself.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/12/9
 * @apiNote: Linked List
 */

public class n2_AddTwoNumbers {
		
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return add(l1, l2, 0);
	}

	private ListNode add(ListNode l1, ListNode l2, int remain){
		ListNode res = new ListNode(l1.val + l2.val + remain);
		remain = res.val / 10;
		res.val %= 10;
		if (l1.next != null && l2.next != null)
			res.next = add(l1.next, l2.next, remain);
		else if (l1.next != null && l2.next == null)
			res.next = add(l1.next, new ListNode(), remain);
		else if (l1.next == null && l2.next != null)
			res.next = add(l2.next, new ListNode(), remain);
		else if (l1.next == null && l2.next == null && remain != 0)
			res.next = add(new ListNode(), new ListNode(), remain);
		return res;
	}
	public static void main(String[] args){
		ListNode l1 = new ListNode(9,9,9,9,9,9,9);
		ListNode l2 = new ListNode(9,9,9,9);
		System.out.println(new n2_AddTwoNumbers().addTwoNumbers(l1, l2));
	}
}
