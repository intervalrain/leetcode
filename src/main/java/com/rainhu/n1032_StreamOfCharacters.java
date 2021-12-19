package com.rainhu;

import java.lang.StringBuilder;

/**
 * 1032. Stream of Characters (Hard)
 * 
 * Design an algorithm that accepts a stream of characters and 
 * checks if a suffix of these characters is string of given array of string words.
 * 
 * For example, if words = ["abc", "xyz"] and the stream added the four characters (one by one)
 * 'a', 'x', 'y' and 'z', your algorithm should detect that the suffix "xyz" of the characters "axyz" matches "xyz" from words.
 * 
 * Implement the StreamChecker Class:
 *   StreamChecker(String[] words) Initialzes the object with the strings array words.
 *   boolean query(char letter) Accepts a new character from the stream and returns true 
 *     if any non-empty suffix from the stream froms a word that is in words.
 * 
 * @author: Rain Hu
 */

public class n1032_StreamOfCharacters {
    public class StreamChecker{
        class TrieNode{
            boolean isWord;
            TrieNode[] neighbors = new TrieNode[26];
        }

        private TrieNode root = new TrieNode();
        StringBuilder sb = new StringBuilder();

        public StreamChecker(String[] words){
            for (String word : words){
                TrieNode cur = root;
                int len = word.length();
                for (int i = len - 1; i >= 0; i--){
                    int index = word.charAt(i) - 'a';
                    if (cur.neighbors[index] == null){
                        cur.neighbors[index] = new TrieNode();
                    }
                    cur = cur.neighbors[index];
                }
                cur.isWord = true;
            }
        }

        public boolean query(char letter){
            sb.append(letter);
            TrieNode cur = root;
            int len = sb.length();
            for (int i = len - 1; i >= 0; i--){
                char c = sb.charAt(i);
                cur = cur.neighbors[c - 'a'];
                if (cur == null) return false;
                if (cur != null && cur.isWord) return true;
            }
            return false;
        }
        
    }
}
