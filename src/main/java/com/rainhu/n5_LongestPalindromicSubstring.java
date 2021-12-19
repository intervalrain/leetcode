package com.rainhu;

/**
 * 5. LongestPalindromicSubstring(Medium)
 * 
 * Given a string s, teturn the longest palindromic substring in s.
 */

public class n5_LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        if (s.length() < 2)
            return s;
        String max = "";
        for (int i=0; i<s.length() - 1; i++){
            if (max.length() > 2 * (s.length() - 1 - i))
                break;
            
            String s1 = extend(s, i, i+1);
            String s2 = extend(s, i, i);
            if (s1.length() > max.length()) max = s1;
            if (s2.length() > max.length()) max = s2;
        }
        return max;
    }
    public String extend(String s, int i, int j){
        while (i >= 0 && j < s.length()){
            if (s.charAt(i) != s.charAt(j))
                break;
            i--; j++;
        }
        return s.substring(i+1, j);
    }
}
