package com.rainhu;

import com.rainhu.util.ListNode;

/**
 * 160. Intersection of Two LinkedLists (Easy)
 * 
 * Given the heads of two singly linked-lists headA and headB, 
 * return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
 * 
 * For example, the following two linked lists begin to intersect at node c1:
 * 
 *       a1 -> a2  ----> c1 -> c2  -> c3
 * b1 -> b2 -> b3  --|
 * 
 * The test cases are generated such that there are no cycles anywhere in the entire linked structure.
 * Note that the linked lists must retain their original structure after the function returns.
 * Custom Judge:
 * The inputs to the judge are given as follows (your program is not given these inputs):
 *      + intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
 *      + listA - The first linked list.
 *      + listB - The second linked list.
 *      + skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
 *      + skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
 * 
 * The judge will then create the linked structure based on these inputs and pass the two heads, 
 * headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/7
 * @apiNote: LinkedList
 */

public class n160_IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        ListNode front = lenA > lenB ? headB : headA; 
        ListNode back = lenA > lenB ? headA : headB;
        int diff = Math.abs(lenA - lenB);
        while (diff > 0){
            back = back.next;
            diff--;
        }
        while (front != back){
            front = front.next;
            back = back.next;
        }
        
        return front;
    }
    public int getLength(ListNode node){
        ListNode curr = node;
        int cnt = 0;
        while (curr != null){
            curr = curr.next;
            cnt++;
        }
        return cnt;
    }
}
