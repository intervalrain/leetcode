package com.rainhu;

import java.util.Random;

import com.rainhu.DioUtility.ListNode;

/**
 * 382. Linked List Random Node (Medium)
 * 
 * Given a singly linked list, return a random node's value from the linked list.
 * Each node must have the same probability of being chosen.
 * 
 * Implement the solution class:
 *     + Solution(ListNode head) initializes the object with the integer array nums.
 *     + int getRandom() chooses a node randomly from the list and returns its value.
 *       All the nodes of the list should be eqaully likely to be choosen.
 */

public class n382_LinkedListRandomNode{

    Random rand;
    ListNode _head;
    int n;

    public n382_LinkedListRandomNode(ListNode head){
        rand = new Random();
        _head = head;
        n = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            n++;
        }
    }

    public int getRandom(){
        ListNode curr = _head;
        int k = rand.nextInt(n);

        while (curr != null){
            if (k == 0)
                return curr.val;
            curr = curr.next;
            --k;
        }

        return -1;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(3,2,4);
        n382_LinkedListRandomNode obj = new n382_LinkedListRandomNode(head);
        int param_1 = obj.getRandom();
        System.out.println(param_1);
    }

}