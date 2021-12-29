package com.rainhu.DioUtility;

import java.util.Arrays;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node(){}

    public Node(int _val){
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next){
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    private static Node arrayToTree(int[] array, int index){
        if (index < array.length)
            return new Node(array[index], arrayToTree(array, index*2+1), arrayToTree(array, index*2+2), null);;
        return null;
    }

    public static Node arrayToTree(int[] array){
        return arrayToTree(array, 0);
    }

    private static Node arrayToTree(Integer[] array, int index) {
        if (index >= array.length || array[index] == null)
            return null;
        if (index < array.length)
            return new Node(array[index], arrayToTree(array, index*2+1), arrayToTree(array, index*2+2), null);;
        return null;
    }

    public static Node arrayToTree(Integer[] array){
        return arrayToTree(array, 0);
    }
    public static int size(Node root){
        if (root == null) return 0;
        return sizeSub(root, 0) + 1;
    }
    private static int sizeSub(Node root, int curr){
        if (root.left == null && root.right == null)
            return curr;
        else if (root.left == null && root.right != null)
            return sizeSub(root.right, curr * 2 + 2);
        else if (root.left != null && root.right == null)
            return sizeSub(root.left, curr * 2 + 1);
        return Math.max(sizeSub(root.left, curr * 2 + 1), sizeSub(root.right, curr * 2 + 2));
    }
    private static Integer[] treeToArray(Node root){
        if (root == null) return null;
        Integer[] array = new Integer[Node.size(root)];
        treeToArraySub(root, 0, array);
        return array;
    }

    private static void treeToArraySub(Node root, int index, Integer[] array){
        if (root == null) return;
        array[index] = root.val;
        treeToArraySub(root.left, index * 2 + 1, array);
        treeToArraySub(root.right, index * 2 + 2, array);
    }

    public static boolean Equals(Node a, Node b){
        return Arrays.toString(treeToArray(a)).equals(Arrays.toString(treeToArray(b)));
    }  

    public String toString(){
        return Arrays.toString(Node.treeToArray(this));
    }
}
