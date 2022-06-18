package com.rainhu;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import java.util.HashSet;

/**
 * 745. Prfix and Suffix Wearch(Hard)
 *
 * Design a special dictionary with smoe words that searchs the words in it by a prefix and a suffix.
 *
 * Implement the WordFilter class:
 *    + WordFilter(string[] words) Initializes the object with the object with the words in the dictionary.
 *    + f(string prefix, string suffix) Returns the index of the word in the dictionary, which has the prefix and the suffix.
 *      If there is more than one valid index, return the largest of them.
 *      If there is no such word in the dictionary, return -1.
 *
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/18
 * @apiNote: Trie
 */

public class n745_PrefixAndSuffixSearch{

    static final int DEFAULT_ENTRY_NUM = 26;

    public class TrieNode{
        TrieNode[] entry;
        char c;
        boolean end;
        int index;
        String str;

        TrieNode(char c){
            this.entry = new TrieNode[DEFAULT_ENTRY_NUM];
            this.c = c;
            this.end = false;
            this.index = -1;
            this.str = "";
        }
    }

    public class Trie{
        
        TrieNode root;
        Set<String> dp = new HashSet<>();
        
        Trie(String[] wordDict){
            root = new TrieNode('-');
            for (int i = 0; i < wordDict.length; i++){
                add(wordDict[i], i);
            }
        }

        public void add(String s, int index){
            TrieNode curr = root;
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                int ix = c - 'a';
                if (curr.entry[ix] == null){
                    curr.entry[ix] = new TrieNode(c);
                    curr.entry[ix].str = curr.str + Character.toString(c);
                }
                curr = curr.entry[ix];
            }
            curr.end = true;
            curr.index = index;
        }

        @Override
        public String toString(){
            if (root == null)
                return "";
            List<String> list = new ArrayList<>();
            for (int i = 0; i < DEFAULT_ENTRY_NUM; i++){
                if (root.entry[i] != null)
                    traverse(root.entry[i], "", list);
            }
            return Arrays.toString(list.toArray());
        }

        private void traverse(TrieNode node, String s, List<String> list){
            if (node.end){
                list.add(s + node.c);
            }
            for (int i = 0; i < DEFAULT_ENTRY_NUM; i++){
                if (node.entry[i] != null)
                    traverse(node.entry[i], s + node.c, list);
            }
        }

        private void getChildren(TrieNode node, String s, List<TrieNode> list){
            if (node.end){
                list.add(node);
            }
            for (int i = 0; i < DEFAULT_ENTRY_NUM; i++){
                if (node.entry[i] != null)
                    getChildren(node.entry[i], s + node.c, list);
            }
        }

        public boolean contains(String s){
            if (dp.contains(s)) return false;
            TrieNode curr = root;
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (curr.end){
                    if (contains(s.substring(i)))
                        return true;
                }
                if (curr.entry[c - 'a'] != null){
                    curr = curr.entry[c - 'a'];
                } else {
                    dp.add(s);
                    return false;
                }
            }
            return curr.end;
        }

        public ArrayList<TrieNode> findPrefix(String prefix){
            ArrayList<TrieNode> res = new ArrayList<>();
            TrieNode curr = root;
            for (int i = 0; i < prefix.length(); i++){
                char c = prefix.charAt(i);
                if (curr.entry[c - 'a'] != null){
                    curr = curr.entry[c - 'a'];
                } else {
                    return null;
                }
            }
            getChildren(curr, prefix, res);
            return res;
        }
    }    

    Trie trie;

    public n745_PrefixAndSuffixSearch(String[] words){
        trie = new Trie(words);
    }
    public int f(String prefix, String suffix){
        ArrayList<TrieNode> candidates = trie.findPrefix(prefix);
        if (candidates == null) return -1;
        int res = -1;
        int n = suffix.length();
        for (TrieNode node : candidates){
            String word = node.str;
            int len = word.length();
            if (suffix.length() > word.length()) continue;
            if (word.substring(len-n, len).equals(suffix)){
                res = Math.max(res, node.index);
            }
        }
        return res;
    }
}

