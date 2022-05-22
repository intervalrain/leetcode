package com.rainhu;

/**
 * 647. Palindromic Substrings (Medium)
 * 
 * Given a string s,
 * return the number of palindromic substrings in it.
 * A string is a palindrome when it reads the same backward as forward.
 * A substring is a contiguous sequence of characters within the string.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/22
 * @apiNote:
 */

public class n647_PalindromicSubstrings {
    public int countSubstrings(String s){
        if (s == null || s.length() == 0) return 0;

        int cnt = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++){
            for (int l = i, r = i; l >= 0 && r < n; l--, r++){
                if (s.charAt(l) != s.charAt(r)) break;
                cnt++;
            }
            for (int l = i, r = i + 1; l >= 0 && r < n; l--, r++){
                if (s.charAt(l) != s.charAt(r)) break;
                cnt++;
            }
        }
        return cnt;
    }
}