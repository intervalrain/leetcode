package com.rainhu;

/**
 * 1446. Consecutive Chracters (Easy)
 * 
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 * 
 * Given a string s, return the power of s.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/14
 * @apiNote
 */

public class n1416_ConsecutiveCharacters {
    public int maxPower(String s){
        if (s.length() == 0) return 0;
        char curr = s.charAt(0);
        int max = 1;
        int cnt = 1;
        for (int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == curr){
                cnt++;
            } else {
                max = Math.max(max, cnt);
                curr = ch;
                cnt = 1;
            }
        }
        return Math.max(max, cnt);
    }
}
