package com.rainhu;

/**
 * 138. Copy List with Random Pointer (Medium)
 * 
 * A linked list of length n is given such that each node contains an additional random pointer, 
 * which could point to any node in the list, or null.
 * 
 * Construct a deep copy of the list.
 * The deep copy should consist of exactly a brand new nodes,
 * where each new node has its value set to the value of its corresponding original node.
 * Both the next and random pointer of the new nodes should point to new nodes in the copiedlist such that
 * the pointers in the original list and copied list represent the same list state.
 * None of the pointers in the new list should point to nodes in the original list.
 * 
 * For example, if there are two nodes X and Y in the original list,
 * where X.random --> Y, then for the corresponding two nodes x and y in the copied list,
 * X.random --> Y.
 * 
 * Return the head of the copied linked list.
 * 
 * The linked list is represented in the input/output as a list of n nodes.
 * Each node is represented as a pair of [val, random_index] where:
 *   + val: an integer representing Nodes.val
 *   + random_index: the index
 * Your code will only be given the head of the original linked list.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/13
 * @apiNote: Linked List
 */
class Node {
    int val;
    Node next;
    Node random;
    
    public Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class n138_CopyListWithRandomPointer {
    public Node copyRandomList(Node head){
        Node iter = head, next;
        while (iter != null){
            next = iter.next;
            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = next;
            iter = next;
        }

        iter = head;
        while (iter != null){
            if (iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }

        iter = head;
        Node dummy = new Node(0);
        Node copy, copyIter = dummy;
        
        while (iter != null){
            next = iter.next.next;
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;
            iter.next = next;
            iter = next;
        }
        return dummy.next;
    }
}
