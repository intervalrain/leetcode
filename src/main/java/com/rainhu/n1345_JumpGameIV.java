package com.rainhu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

/**
 * 1345. Jump Game IV (Hard)
 * 
 * Given an array of integers arr, you are initially positioned at the first index of the array.
 * 
 * In one step you can jump from index i to index:
 *     i + 1 where: i + 1 < arr.length.
 *     i - 1 where: i - 1 >= 0.
 *     j where: arr[i] == arr[j] and i != j.
 * 
 * Return the minimum number of steps to reach the last index of the array.
 * 
 * Notice that you can not jump outside of the array at any time.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/15
 * @apiNote:
 */

public class n1345_JumpGameIV {
    public int minJumps(int[] arr){
        if (arr.length == 1) return 0;
        if (arr[0] == arr[arr.length - 1] || arr.length == 2) return 1;
        if (arr[0] == arr[arr.length - 2]) return 2;
        
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, List<Integer>> ind = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!ind.containsKey(arr[i])) {
                ind.put(arr[i], new ArrayList<>());
            }
            ind.get(arr[i]).add(i);
        }
        q.add(arr.length - 1);
        boolean[] seen = new boolean[arr.length];
        int level = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int s = 0; s < sz; s++) {
                int state = q.poll();
                if (state == 0) return level;
                if (state + 1 < arr.length && !seen[state + 1]) {
                    seen[state + 1] = true;
                    if (state + 1 == 0) return level + 1;
                    
                    q.add(state + 1);
                }
                if (state - 1 >= 0 && !seen[state - 1]) {
                    seen[state - 1] = true;
                    if (state - 1 == 0) return level + 1;
                    q.add(state - 1);
                }
                List<Integer> same = ind.get(arr[state]);     
                for (int i : same) {
                    if (i == state || seen[i]) continue;
                    seen[i] = true;
                    if (i == 0) return level + 1;
                    q.add(i);
                }
            }
            level++;
        }
        return -1;
        
    }

}
