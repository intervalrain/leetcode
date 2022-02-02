package com.rainhu;

import java.util.List;
import java.util.LinkedList;

/**
 * 438. Find All Anagrams in a String (Medium)
 *
 * Given two strings s and p,
 * return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a differenct word or phrase,
 * typically using all the original letters exactly once.
 *
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/2
 * @apiNote:
 */

public class n438_FindAllAnagramsInAString{
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new LinkedList<>();
        if (s.length() < p.length()) return res;

        int[] map = new int [26];
        for (int i = 0; i < p.length(); i++){
            map[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++){
            map[s.charAt(i) - 'a']--;
            if (i >= p.length()){
                char last = s.charAt(i - p.length());
                map[last - 'a']++;
            }
            if (i >= p.length() - 1){
                boolean valid = true;
                for (int j = 0; j < 26; j++){
                    if (map[j] != 0){
                        valid = false;
                        break;
                    }
                }
                if (valid) res.add(i - p.length() + 1);
            }
        }
        return res;
    }
}
