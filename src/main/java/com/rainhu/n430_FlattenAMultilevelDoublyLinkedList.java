package com.rainhu;

import com.rainhu.DioUtility.TriNode;
import java.util.Stack;

/**
 * 430. Flatten a Multi-level Doubly Linked LIst (Median)
 * 
 * You are given a doubly linked list which in addition to the next and previous pointers,
 * it could have a child pointer, which may or may not point to a separate doubly linked list.
 * These child lists may have one or more children of their own, and so on,
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list. 
 * You are given the head of the first level of the list.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/11/2
 * @apiNote (1) Using recursion  (2) Using stack
 *   
 */

public class n430_FlattenAMultilevelDoublyLinkedList{
    
    public TriNode flatten(TriNode head){
        Stack<TriNode> stack = new Stack<>();
        TriNode curr = head;
        while (curr != null || !stack.isEmpty()){
            if (curr.child != null){
                if (curr.next != null)
                    stack.add(curr.next);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            } else if (!stack.isEmpty() && curr.next == null){
                TriNode branch = stack.pop();
                if (branch != null)
                    branch.prev = curr;
                curr.next = branch;
            }
            curr = curr.next;
        }
        return head;
    }



    /** 
     * @author: Rain Hu
     * @version: 1.0
     * @since: 2021/11/1
     */

    // public TriNode flatten(TriNode head){
    //     if (head == null)
    //         return head;
    //     flattenSub(head);
    //     return head;   
    // }

    // public void flattenSub(TriNode head){
    //     TriNode curr = head;
    //     curr = getBranch(curr);
    //     if (curr == null)
    //         return;
    //     flattenSub(curr.child);
    //     branchConcat(curr);
    // }

    // public TriNode getBranch(TriNode curr){
    //     if (curr.child != null)
    //         return curr;
    //     if (curr.next == null)
    //         return null;
    //     return getBranch(curr.next);
    // }

    // public void branchConcat(TriNode branch){
    //     if (branch.next == null){
    //         branch.next = branch.child;
    //         branch.child = null;
    //         branch.next.prev = branch;
    //     } else {
    //         TriNode curr = branch.child;
    //         while (curr.next != null)
    //             curr = curr.next;
    //         curr.next = branch.next;
    //         branch.next.prev = curr;
    //         branch.child.prev = curr;
    //         branch.next = branch.child;
    //         branch.child = null;
    //     }
    // }
}