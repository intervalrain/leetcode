package com.rainhu;

import java.util.HashMap;
import java.util.Map;
// import java.util.LinkedList;
// import java.util.List;

/**
 * 211. Design Add and Search Words Data Structure
 * 
 * Design a data structure that supports adding new words and finding if a string matches any previous add string.
 * 
 * Implement the class with:
 *     + Initialize the object.
 *     + void addWord(word) Adds word to the data structure, it can be matched later.
 *     + bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise.
 *       word may contain dots '.' where dots can be matched with any letter.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/1/28
 * @apiNote: Trie
 */

public class n211_DesignAddandSearchWordsDataStructure{

    private class TrieNode{
        boolean isEnd;
        Map<Character, TrieNode> child;
        TrieNode(){
            this.isEnd = false;
            this.child = new HashMap<>();
        }
    }

    TrieNode root = new TrieNode();

    public void addWord(String word){
        TrieNode node = root;
        for (char c : word.toCharArray()){
            if (!node.child.containsKey(c)){
                node.child.put(c, new TrieNode());
            }
            node = node.child.get(c);
        }
        node.isEnd = true;
    }

    public boolean search(String word){
        return match(word.toCharArray(), 0, root);
    }

    private boolean match(char[] chs, int k, TrieNode node){
        if (k == chs.length) return node.isEnd;
        if (chs[k] != '.'){
            return node.child.containsKey(chs[k]) && match(chs, k + 1, node.child.get(chs[k]));
        } else {
            for (Character ch : node.child.keySet()){
                if (match(chs, k + 1, node.child.get(ch)))
                    return true;
            }
        }
        return false;
    }
}

/** best solution */
// public class wordDictionary{
//     private final List[] list;

//     public wordDictionary(){
//         list = new List[501];
        
//         for (int i = 0; i < list.length; i++){
//             list[i] = new LinkedList<>();
//         }
//     }
    
//     public void addWord(String word){
//         List<String> lst = list[word.length()];
//         lst.add(word);
//     }

//     public boolean search(String word){
//         List<String> lst = list[word.length()];
//         for (String wrd:lst){
//             if (compare(wrd, word))
//                 return true;
//         }
//         return false;
//     }

//     private boolean compare (String src, String pattern){
//         for (int i = 0; i < src.length(); i++){
//             char ptn = pattern.charAt(i);
//             if (ptn == '.')
//                 continue;

//             if (src.charAt(i) != ptn)
//                 return false;
//         }
//         return true;
//     }
// }