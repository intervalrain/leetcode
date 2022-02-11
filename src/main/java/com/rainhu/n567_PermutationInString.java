package com.rainhu;

/**
 * 567. Permutation in String (Medium)
 * 
 * Given two strings si and s2,
 * return true if s2 contains a permutation of s1,
 * or false otherwise.
 * 
 * In other words,
 * return true if one of s1's permutations is the substring of s2.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/2/11
 * @apiNote:
 */

public class n567_PermutationInString{
    public boolean checkInclusion(String s1, String s2){
        int[] map = new int[26];
        for (char ch:s1.toCharArray()){
            map[ch-'a']++;
        }

        int i = 0;
        int len = s1.length();
        char[] c = s2.toCharArray();

        while (i < s2.length()){
            int[] cpy = new int[26];
            System.arraycopy(map, 0, cpy, 0, map.length);
            if (map[c[i] - 'a'] > 0 && helper(cpy, c, i, len)){
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean helper(int[] map, char[] ch, int start, int len){
        if (start + len > ch.length)
            return false;
        for (int i = start; i < start + len; i++){
            if (map[ch[i] - 'a'] == 0)
                return false;
            map[ch[i] - 'a']--;
        }
        return true;
    }

    /** best solution */
    public boolean checkInclusion2(String s1, String s2){
        int s = s1.length(), t = s2.length();
        if (s > t) return false;

        int[] map = new int[26];
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < s; i++){
            map[c1[i] - 'a']++;
            map[c2[i] - 'a']--;
        }
        if (zeroCnt(map)) return true;

        for (int i = s; i < t; i++){
            map[c2[i] - 'a']--;
            map[c2[i - s] - 'a']++;
            if (zeroCnt(map)) return true;
        }

        return false;
    }

    private boolean zeroCnt(int[] map){
        for (int i = 0; i < 26; i++){
            if (map[i] != 0)
                return false;
        }
        return true;
    }
}
 