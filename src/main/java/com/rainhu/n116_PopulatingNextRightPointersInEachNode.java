package com.rainhu;

import com.rainhu.util.Node;

/**
 * 116. Populating Next Right Pointers in Each Node (Medium)
 * 
 * You are given a perfect binary tree where all leaves are on the same level,
 * and every parent has two children.
 * 
 * Populate each next pointer to point to its next right node.
 * If there is no next right node,
 * the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/30
 * @apiNote:
 */

public class n116_PopulatingNextRightPointersInEachNode{
    public Node connect(Node root){
        if (root == null)
            return root;
        if (root.left != null){
            if (root.next != null)
                root.right.next = root.next.left;
            else 
                root.right.next = null;
            root.left.next = root.right;
            connect(root.left);
            connect(root.right);
        }
        return root;
    }
}