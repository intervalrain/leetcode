package com.rainhu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 820. Short Encoding of Words (Medium)
 * 
 * A valid encoding of an array of words is any reference s and array of indices such that:
 *      + words.length == indices.length
 *      + The reference string s ends with '#' character.
 *      + For each index indeces[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].
 * 
 * Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/21
 * @apiNote:
 */

public class n820_ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words){
        Set<String> s = new HashSet<>(Arrays.asList(words));
        for (String w : words){
            for (int i = 1; i < w.length(); i++){
                s.remove(w.substring(i));
            }
        }
        int res = 0;
        for (String w : s){
            res += (w.length() + 1);
        }
        return res;
    }
}
