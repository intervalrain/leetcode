package com.rainhu;

import java.util.Arrays;
import java.util.List;


/**
 * 1202. Smallest String With Swaps (Medium)
 * 
 * You are given a string s,
 * and an array of pairs of indices in the string pairs where pairs[i] = [a, b] indicates 2 indices(0-indexed) of the string.
 * 
 * You can swap the characters at any pair of indices in the given pairs any number of times.
 * 
 * Return the lexicographically smallest string that s can be changed to after using the swaps.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/28
 * @apiNote:
 */

public class n1202_SmallestStringWithSwaps {
    int[] root;
    int[] rank;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        root = new int[s.length()];
        rank = new int[root.length];
        for(int i = 0; i < root.length; i++){
            root[i] = i;
            rank[i] = 1;
        }
        for(List<Integer> list : pairs){
            union((int)list.get(0), (int)list.get(1));
        }
        char[][] arr = new char[root.length][];
        int[] ind = new int[root.length];
        char[] sChar = s.toCharArray();
        for(int i = 0; i < root.length; i++){  
            int root = find(i);
            if(arr[root] == null){
            arr[root] = new char[rank[root]];
            }
            arr[root][ind[root]++] = sChar[i];
        }
        for(char[] sub : arr){
            if(sub == null)
                continue;
            Arrays.sort(sub);
        }
        ind = new int[root.length];
        for(int i = 0; i < sChar.length; i++){
            int root = find(i);
            sChar[i] = arr[root][ind[root]++];
        }
        return new String(sChar);
    }
    public int find(int x) {
        if (root[x] == x)
            return x;
        return root[x] = find(root[x]);
    }
     public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
                rank[rootX] += rank[rootY];
            } else {
                root[rootX] = rootY;
                rank[rootY] += rank[rootX];
            }
        }
    }
}
