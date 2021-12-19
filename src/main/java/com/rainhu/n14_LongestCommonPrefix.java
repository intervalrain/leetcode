package com.rainhu;

/**
 * 14. Longest Common Prefix (Easy)
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 */

public class n14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs.length==1)
            return strs[0];
        String tmpStr = getPrefix(strs[0], strs[1]);
        for(int i=2; i<strs.length; i++){
            tmpStr = getPrefix(tmpStr, strs[i]);
        }
        return tmpStr;
    }
    private String getPrefix(String s1, String s2){
        int i=0;
        for(; i<Math.min(s1.length(),s2.length()); i++){
            if(s1.charAt(i) != s2.charAt(i))
                break;
        }
        return s1.substring(0,i);
    }
}
