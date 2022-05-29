package com.rainhu;

/**
 * 44. Wildcard Matching (Hard)
 * 
 * Given an input string (s) and a pattern (p), 
 * implement wildcard pattern matching with support for '?' and '*' where:
 *      + '?' Matches any single character.
 *      + '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/29
 * @apiNote: regular expression
 */

public class n44_WildcardMatching {    
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int ni = s.length(), nj = p.length();
        int sp = -1, pp = -1;
        
        if (p == "") return p == s;
        
        while(i < ni){
            if (i < ni && j < nj && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')){
                i++;
                j++;
            } else if (j < nj && p.charAt(j) == '*') {
                sp = i;
                pp = j++;
            } else {
                if (pp == -1) return false;
                i = ++sp;
                j = pp+1;
            }
        }
        while (j < nj){
            if (p.charAt(j) != '*') return false;
            j++;
        }
        return true;
    }
}
