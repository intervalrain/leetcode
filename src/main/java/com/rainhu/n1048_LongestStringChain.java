package com.rainhu;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * 1048. Longest String Chain (Medium)
 * 
 * You are given an array of words where each word consists of lowercase English letters.
 * 
 * wordA is a predecessor of wordsB if and only if we can insert exactly one letter anywhere in wordA 
 * without changing the order of the other characters to make it equal to words.
 * 
 *      + For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
 * 
 * A word chain is sequence of words [word1, word2, ..., wordk] with k >= 1,
 * where word1 is predecessor of word2, word2 is predecessor of word3, and so on.
 * A single word is trivially a word chain with k = 1.
 * 
 * Return the length of the longest possible word chain with words chosen from the given list of words.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/16
 * @apiNote: HashMap
 */

public class n1048_LongestStringChain {
    public int longestStrChain(String[] words){
        Arrays.sort(words, (String x, String y) -> x.length() - y.length());
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        map.put("", 0);
        for (String word : words){
            int max = 1;
            for (int i = 0; i < word.length(); i++){
                String target = trimCharAt(word, i);
                if (map.containsKey(target)){
                    max = Math.max(max, map.get(target) + 1);
                }
                if (max > res) break;
            }
            map.put(word, max);
            res = Math.max(res, max);
        }

        return res;
    }
    public String trimCharAt(String s, int i){
        StringBuilder sb = new StringBuilder(s);
        return sb.deleteCharAt(i).toString();
    }
}
