package com.rainhu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 763. You are given a string s.
 * We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 * 
 * Note that the partition is done so that after concatenating all the parts in order,
 * the resultant string should be s.
 * 
 * Return a list of integers representing the size of these parts.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/3/22
 * @apiNote: 
 */

public class n763_PartitionLabels {

    // best solution
    public List<Integer> partitionLabels(String s){
        List<Integer> res = new ArrayList<>();
        int[] lastIndex = new int[26];
        for (int i = 0; i < 26; i++){
            lastIndex[i] = s.lastIndexOf('a' + i);
        }

        int left = 0;
        int right;
        while (left < s.length()){
            right = lastIndex[s.charAt(left) - 'a'];
            for (int i = left; i < right; i++){
                right = Math.max(right, lastIndex[s.charAt(i) - 'a']);
            }
            res.add(right - left + 1);
            left = right + 1;
        }
        return res;
    }

    public List<Integer> partitionLabels2(String s){
        Queue<Character> q = new LinkedList<Character>();
        int[] lBound = new int[26];
        int[] rBound = new int[26];
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (!q.contains(ch)){
                q.add(ch);
                rBound[ch - 'a'] = lBound[ch - 'a'] = i;
            } else {
                rBound[ch - 'a'] = i;
            }
        }
        int start = lBound[q.peek() - 'a'];
        int curr = rBound[q.poll() - 'a'];
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()){
            if (curr > lBound[q.peek() - 'a']){
                curr = Math.max(curr, rBound[q.poll() - 'a']);
            } else {
                res.add(curr - start + 1);
                start = lBound[q.peek() - 'a'];
                curr = rBound[q.poll() - 'a'];
            }
        }
        res.add(curr - start + 1);
        return res;
    }
}
