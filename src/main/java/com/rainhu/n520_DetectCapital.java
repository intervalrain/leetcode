package com.rainhu;

/**
 * 520. Detect Capital (Easy)
 * 
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *     + All letters in this word are capitals, like "USA".
 *     + All letters in this word are not capitals, like "leetcode".
 *     + Only the first letter in this word is capital, like "Google".
 * 
 * Given a string word, return true if the usage of capitals in it is right.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/25
 * @apiNote
 */

public class n520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (char c: word.toCharArray()) {
            if('Z' - c >= 0)
                cnt++;
        }
        return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
    }
}
