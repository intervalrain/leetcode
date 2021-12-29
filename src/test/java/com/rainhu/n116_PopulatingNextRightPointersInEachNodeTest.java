package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.DioUtility.Node;

import org.junit.jupiter.api.Test;

public class n116_PopulatingNextRightPointersInEachNodeTest{
    
    n116_PopulatingNextRightPointersInEachNode clz = new n116_PopulatingNextRightPointersInEachNode();
    Node root;
    Node expected;
    Node actual;

    @Test
    public void test1(){
        root = Node.arrayToTree(new Integer[]{1,2,3,4,5,6,7});
        expected = connect(root);
        actual = clz.connect(root);
        assertTrue(equal(expected, actual));
    }

    @Test
    public void test2(){
        root = Node.arrayToTree(new Integer[]{});
        expected = connect(root);
        actual = clz.connect(root);
        assertTrue(equal(expected, actual));
    }

    private Node connect(Node root){
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

    private boolean equal(Node a, Node b){
        if (Node.size(a) != Node.size(b))
        if (a == null && b == null) return true;
        if (a.val != b.val) return false;
        return equal(a.left, b.left) && equal(a.right, b.right) && equal(a.next, b.next);
    }
}