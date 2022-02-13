package com.rainhu;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * A transformation sequence from word 'beginword' to word 'endword' using a dictionary 'wordlist' is a sequence of words
 * 'beginword' -> s1 -> s2 -> ... -> sk such that:
 *     + Every adjacent pair of words differs by a single letter
 *     + Every s1 for 1 <= i <= k is in 'wordlist'. Note that 'beginword' does not need to be in 'wordlist'
 *     + 'sk == endword'
 * Given two words, 'beginword' and 'endword', and a dictionary 'wordlist',
 * return the number of words in the shortest transformation sequence from 'beginword' to 'endword',
 * or 0 if no such sequence exists.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/12
 * @apiNote: BFS
 */

public class n127_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> dict = new HashSet<>(wordList), vis = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        for (int len = 1; !q.isEmpty(); len++) {
            for (int i = q.size(); i > 0; i--) {
                String w = q.poll();
                if (w.equals(endWord)) return len;

                for (int j = 0; j < w.length(); j++) {
                    char[] ch = w.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == w.charAt(j)) continue;
                        ch[j] = c;
                        String nb = String.valueOf(ch);
                        if (dict.contains(nb) && vis.add(nb)) q.offer(nb);
                    }
                }
            }
        }
        return 0;
    }
}
