package com.rainhu;

/**
 * 58. Length of Last Word (Easy)
 * 
 * Given a string s consisting of some words separated by some number of spaces,
 * return the length of the last word in the string.
 * 
 * A word is a maximum substring consisting of non-space characters only.
 */

public class n58_LengthOfLastWord {
    public int lengthOfLastWord(String s){
        s = s.trim();
        int i = 0;
        for(; i < s.length(); i++){
            if (s.charAt(s.length()-1-i) == ' ') break;
        }
        return i;
    }
}
