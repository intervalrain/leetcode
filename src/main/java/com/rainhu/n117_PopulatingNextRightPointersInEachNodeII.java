package com.rainhu;

import java.util.ArrayDeque;
import java.util.Queue;

import com.rainhu.util.Node;

/**
 * 117. Populating Next Right Pointers in Each Node II (Medium)
 * 
 * Given an binary tree, populating each next pointer to point to its next right node.
 * If there is no next right node, the next pointer should be set to Null.
 * 
 * initially, all next pointer are se to NULL.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/13
 * @apiNote:
 */

public class n117_PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root){
        Queue<Node> q = new ArrayDeque<Node>();
        q.offer(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            Node head = curr;
            while (!q.isEmpty()){
                curr.next = q.peek();
                curr = q.poll();
            }
            while (head != null){
                if (head.left != null) q.offer((Node) head.left);
                if (head.right != null) q.offer((Node) head.right);
                head = head.next;
            }
        }
        return root;
    }
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1,2,3,4,5,null,7};
        Node root = Node.arrayToTree(arr);
        n117_PopulatingNextRightPointersInEachNodeII clz = new n117_PopulatingNextRightPointersInEachNodeII();
        clz.connect(root);
    }
}
