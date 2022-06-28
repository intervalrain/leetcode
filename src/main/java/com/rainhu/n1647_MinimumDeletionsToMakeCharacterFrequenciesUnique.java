package com.rainhu;

import java.util.HashSet;
import java.util.Set;

/**
 * A string s is called good if there are no two different characters in s that have the same frequency.
 * Given a string s, return the minimum number of characters you need to delete to make s good.
 * The frequecy of a character in a string is the number of times it appears in the string.
 * For example, in the string "aab", the frequency of 'a' is 2,
 * while the frequency of 'b' is 1.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/28
 * @apiNote: HashSet
 */

public class n1647_MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s){
        int[] map = new int[26];
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int val = ++map[ch - 'a'];
            max = Math.max(val, max);
        }
        int sum = 0;
        for (int i = 0; i < 26; i++){
            int a;
            if ((a = map[i]) == 0) continue;
            while (set.contains(a) & a != 0) a--;
            set.add(a);
            sum += a;
        }
        return s.length() - sum;
    }
}
