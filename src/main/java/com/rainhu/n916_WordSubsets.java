package com.rainhu;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 916. Word Subsets (Medium)
 * 
 * You are given two string arrays words1 and words2.
 * 
 * A string b is a subset of string a if every letter in b occurs in a including multiplicity.
 * 
 *      + For example, "wrr" is a subset of "warrior" but is not a subset of "world".
 * 
 * A string a from word1 is universal if for every string b in words2, b is a subset of a.
 * 
 * Return an array of all the universal strings in words1. You may return the answer in any order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/30
 * @apiNote: 
 */

public class n916_WordSubsets {

    //["amazon","apple","facebook","google","leetcode"]
    //["e","oo"]
    // output: google, facebook
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] map = new int[26];
        int threshold = 0;
        List<String> res = new ArrayList<>();
        // to struct a map for the threshold of string's construction.
        for (String s : words2){
            Map<Integer, Integer> tmp = new HashMap<>();
            for (char c : s.toCharArray()){
                tmp.put(c-'a', tmp.getOrDefault(c-'a', 0) + 1);
            }
            for (HashMap.Entry<Integer, Integer> e : tmp.entrySet()){
                int idx = e.getKey();
                int time = e.getValue();
                if (map[idx] <= time){
                    threshold += (time - map[idx]);
                    map[idx] = time;
                }
            }
        }

        for (String s : words1){
            if (s.length() < threshold) continue;
            int cnt = threshold;
            int[] x = new int[26];
            System.arraycopy(map, 0, x, 0, 26);
            for (char c : s.toCharArray()){
                if (x[c-'a'] > 0){
                    cnt--;
                    x[c-'a']--;
                }
                if (cnt == 0){
                    res.add(s);
                    break;
                }
            }   
        }

        return res;
    }    
}
