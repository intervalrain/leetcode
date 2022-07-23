package com.rainhu;

import java.util.HashMap;

/**
 * 792. Number of Matching Subsequences (Medium)
 * 
 * Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.
 * 
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *      + For example, "ace" is a subsequence of "abcde";
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/7/21
 * @apiNote: Trie
 */

public class n792_NumberOfMatchingSubsequences {

    public int numMatchingSubseq(String s, String[] words){
        Trie[] heads = new Trie[5];
        for (int i = 0; i < 5; i++)
            heads[i] = new Trie("", 0);
        for (String word : words){
            Trie head = heads[word.charAt(0) - 'a'];
            Trie newTrie = new Trie(word, 0);
            newTrie.next = head.next;
            head.next = newTrie;
        }
        int ans = 0;
        for (char c : s.toCharArray()){
            Trie head = heads[c - 'a'];
            Trie curr = head.next;
            head.next = null;
            while (curr != null){
                Trie next = curr.next;
                if (curr.index == curr.word.length()-1){
                    ans++;
                } else {
                    curr.index++;
                    Trie nextHead = heads[curr.word.charAt(curr.index) - 'a'];
                    curr.next = nextHead.next;
                    nextHead.next = curr;
                }
                curr = next;
            }
        }
        return ans;
    }
    class Trie {
        String word;
        int index;
        Trie next;
        Trie(String word, int index){
            this.word = word;
            this.index = index;
        }
        @Override
        public
        String toString(){
            return word;
        }
    }



    HashMap<String, Boolean> map = new HashMap<>();
    public int numMatchingSubseq1(String s, String[] words){
        int cnt = 0;
        for (int i = 0; i < words.length; i++){
            if (isSubsequence(s, words[i])) cnt++;
        }
        return cnt;
    }
    private boolean isSubsequence(String s, String d){
        if (s.length() < d.length()) return false;
        if (map.containsKey(d)) return map.get(d);
        int j = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == d.charAt(j)){
                j++;
            }
            if (j == d.length()){
                map.put(d, true);
                return true;
            }
        }
        map.put(d, false);
        return false;
    }
}
