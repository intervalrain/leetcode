package com.rainhu;

/**
 * 1641. Count Sorted Vowel Strings
 * 
 * Given an integer n, return the nuber of strings of length n that consist only of vowels(a, e, i, o, u) and are lexicographically sorted.
 * 
 * A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/14
 * @apiNote:
 */

public class n1641_CountSortedVowelStrings {
    public int countVowelStrings(int n){
        return (n+1) * (n+2) * (n+3) * (n+4) / 24;
    }
    public int countVowelStrings2(int n){
        int[] count = new int[1];
        traverse(n, 1, count);
        return count[0];
    }
    public void traverse(int n, int ix, int[] count){
        if (n == 0) {
            count[0]++;
            return;
        }
        for (int i = ix; i <= 5; i++){
            traverse(--n, i, count);
            ++n;
        }
    }
}
