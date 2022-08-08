package com.rainhu;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 269. Alien Dictionary (Hard)
 * 
 * There is a new language which uses the latin alphabet.
 * However, the order among letters are unknown to you.
 * You receive a list of non-empty words from the dictionary,
 * where words are sorted lexicographically by the rules of this new language.
 * Derive the order of letters in this languages.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/8/6
 * @apiNote: topological sort
 */

public class n269_AlienDictionary {
    public String alienOrder(String[] words){
        Map<Character, Set<Character>> g = new HashMap<>();
        int[] indegree = new int[26];
        buildGraph(words, g, indegree);
        return bfs(g, indegree);
    }
    private void buildGraph(String[] words, Map<Character, Set<Character>> g, int[] indegree){
        for (String word : words){
            for (char c : word.toCharArray()){
                g.putIfAbsent(c, new HashSet<>());
            }
        }
        for (int i = 1; i < words.length; i++){
            String prev = words[i-1];
            String next = words[i];
            int len = Math.min(prev.length(), next.length());
            for (int j = 0; j < len; j++){
                if (prev.charAt(j) != next.charAt(j)){
                    char out = prev.charAt(j);
                    char in = next.charAt(j);
                    if (!g.get(out).contains(in)){
                        g.get(out).add(in);
                        indegree[in - 'a']++;
                    }
                    break;
                }
            }
        }
    }

    private String bfs(Map<Character, Set<Character>> g, int[] indegree){
        StringBuilder sb = new StringBuilder();
        int totalLength = g.size();
        Queue<Character> q = new LinkedList<>();
        for (char c : g.keySet()){
            if (indegree[c - 'a'] == 0){
                sb.append(c);
                q.offer(c);
            }
        }

        while (!q.isEmpty()){
            char out = q.poll();
            if (g.get(out) == null || g.get(out).size() == 0) continue;
            for (char in : g.get(out)){
                indegree[in - 'a']--;
                if (indegree[in - 'a'] == 0){
                    q.offer(in);
                    sb.append(in);
                }
            }
        }

        return sb.length() == totalLength ? sb.toString() : "";
    }
}
