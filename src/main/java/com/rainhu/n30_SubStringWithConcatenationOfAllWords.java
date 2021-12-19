package com.rainhu;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 30. Substring with Concatenation of All Words (Hard)
 * 
 * You are given a stinrg s and an array of strings words of the same length.
 * Return all starting indices of substring(s) in s that is a concatenation of each word in wrods exactlty once,
 * in any orde, and without any intervening characters.
 * 
 * You can return the answer in any order.
 */


public class n30_SubStringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words){
        int wordLen = words[0].length();
        int wordCnt = words.length;
        if (s.length() < wordCnt * wordLen) return List.of();
        List<Integer> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.putIfAbsent(word, map.size());
        int[] count = new int[map.size()];
        for (String word : words)
            count[map.get(word)]++;
        for (int i = 0, limit = s.length() - wordCnt * wordLen, start; (start = i) < wordLen; i++){
            while (start <= limit){
                int end = start + wordCnt;
                int curNum = 0;
                int[] curCnt = new int[count.length];
                while (start < end){
                    String sub = s.substring(end - wordLen, end);
                    Integer index = map.get(sub);
                    if (index == null){
                        start = end;
                        break;
                    }
                    if(++curCnt[index] > count[index]){
                        start = end;
                        break;
                    }
                    if(++curNum >= wordCnt){
                        res.add(start);
                        start += wordLen;
                        break;
                    }
                    end -= wordLen;
                }
            }
        }
        return res;
    }
}
