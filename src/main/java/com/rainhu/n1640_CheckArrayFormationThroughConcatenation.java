package com.rainhu;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/**
 * 1640. Check Array Formation Through Concatenation (Easy)
 * 
 * You are given an array of distinct integers arr and an array of integer arrays pieces,
 * where the integers in pieces are distinct.
 * Your goal is to form arr by concatenating the arrays in pieces in any order.
 * However, you are not allowed to reorder the integers in each array pieces[i].
 * 
 * Return true if it is possible to form the array arr from pieces.
 * Otherswise, return false.
 */

public class n1640_CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces){
        Map<Integer, int[]> map = new HashMap<>();

        for (int[] piece : pieces){
            map.put(piece[0], piece);
        }

        int[] res = new int[arr.length];
        int i = 0;
        for (int a : arr){
            if (map.containsKey(a)){
                for (int p : map.get(a)){
                    res[i++] += p;
                }
            }
        }
        return Arrays.equals(arr, res);
    }
}
