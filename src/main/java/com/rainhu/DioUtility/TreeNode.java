package com.rainhu.DioUtility;

import java.util.Arrays;

public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    private static TreeNode arrayToTree(int[] array, int index){
        if (index < array.length)
            return new TreeNode(array[index], arrayToTree(array, index*2+1), arrayToTree(array, index*2+2));;
        return null;
    }
    public static TreeNode arrayToTree(int[] array){
        return arrayToTree(array, 0);
    }

    private static TreeNode arrayToTree(Integer[] array, int index) {
        if (index >= array.length || array[index] == null)
            return null;
        if (index < array.length)
            return new TreeNode(array[index], arrayToTree(array, index*2+1), arrayToTree(array, index*2+2));;
        return null;
    }
    public static TreeNode arrayToTree(Integer[] array){
        return arrayToTree(array, 0);
    }
    public static int size(TreeNode root){
        if (root == null) return 0;
        return sizeSub(root, 0) + 1;
    }
    private static int sizeSub(TreeNode root, int curr){
        if (root.left == null && root.right == null)
            return curr;
        else if (root.left == null && root.right != null)
            return sizeSub(root.right, curr * 2 + 2);
        else if (root.left != null && root.right == null)
            return sizeSub(root.left, curr * 2 + 1);
        return Math.max(sizeSub(root.left, curr * 2 + 1), sizeSub(root.right, curr * 2 + 2));
    }
    private static Integer[] treeToArray(TreeNode root){
        if (root == null) return null;
        Integer[] array = new Integer[TreeNode.size(root)];
        treeToArraySub(root, 0, array);
        return array;
    }

    private static void treeToArraySub(TreeNode root, int index, Integer[] array){
        if (root == null) return;
        array[index] = root.val;
        treeToArraySub(root.left, index * 2 + 1, array);
        treeToArraySub(root.right, index * 2 + 2, array);
    }

    public static boolean Equals(TreeNode a, TreeNode b){
        return Arrays.toString(treeToArray(a)).equals(Arrays.toString(treeToArray(b)));
    }

    public static void main(String[] args){
        TreeNode root = arrayToTree(new Integer[]{1,3,2,null,null,null,8,null,null,null,null,null,null,9,1});
        System.out.println(root);
    }        

    public String toString(){
        return Arrays.toString(TreeNode.treeToArray(this));
    }
}
