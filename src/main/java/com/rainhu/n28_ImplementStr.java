package com.rainhu;

/**
 * 28. Implement strStr (Easy)
 * 
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * 
 * What should we return when needle is an emtpy string?
 * This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf();
 */


public class n28_ImplementStr {
    // kmp algorithm / prefix table

    public int strStr(String haystack, String needle){
        if(needle.length()==0)
            return 0;
        if(haystack.length()==0)
            return -1;
        char[] sentence = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        int[] prefix = getKMP(pattern);

        int len = 0, i = 0;
        while(i<sentence.length){
            if(sentence[i] == pattern[len]){
                i++;
                len++;
            } else if(len == 0 ){
                i++;
            } else {
                len = prefix[len-1];
            }
            if(len==pattern.length)
                return i - len;
        }
        return -1;
    }
    private int[] getKMP(char[] pattern){
        int[] prefix = new int[pattern.length];
        prefix[0] = 0;
        int len = 0, i = 1;
        while(i<pattern.length){
            if(pattern[len] == pattern[i]){
                prefix[i] = ++len;
                i++;
            } else {
                if(len == 0){
                    i++;
                } else {
                    len = prefix[len-1];
                }
            }
        }
        return prefix;
    }
}
