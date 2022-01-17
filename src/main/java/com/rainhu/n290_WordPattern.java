package com.rainhu;

import java.util.HashSet;

/**
 * 290. Word Pattern (Easy)
 * 
 * Given a pattern and a string s, find if s follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/18
 * @apiNote: 
 */

public class n290_WordPattern {
    public boolean wordPattern(String pattern, String s){
        String[] tmpStr = s.split(" ");
        String[] patAry = new String[26];
        HashSet<String> store = new HashSet<>();
        if (pattern.length() != tmpStr.length) 
            return false;
        for (int i = 0; i < pattern.length(); i++){
            if (patAry[pattern.charAt(i) - 'a'] == null){
                patAry[pattern.charAt(i) - 'a'] = tmpStr[i];
                if (store.contains(tmpStr[i])) return false;
                store.add(tmpStr[i]);
            } else {
                if (!patAry[pattern.charAt(i) - 'a'].equals(tmpStr[i]))
                    return false;
            }
        }
        return true;
    }
}
