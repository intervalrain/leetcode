package com.rainhu;

/**
 * 392. Is Subsequence (Easy)
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * A subsequence of a string is a new string that is formed from the original string by 
 * deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subseqience of "abcde" while aec is not).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/2
 * @apiNote
 */

public class n392_IsSubquence {
    public boolean isSubsequence(String s, String t){
        if (s.length() == 0) return true;
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
