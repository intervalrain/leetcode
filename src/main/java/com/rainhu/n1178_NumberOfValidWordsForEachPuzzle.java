package com.rainhu;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 1178. Number of Valid Words for Each Puzzle (Hard)
 * 
 * With respect to a given puzzle string,
 * a word is valid if both the following conditions are satisfied.
 *   + word contains the first letter of puzzle.
 *   + For each letter in word, that letter is in puzzle.
 *     + For example, if the puzzle is abcdefg, then valid words are 
 *       "faced", "cabbage", and "baggage", while 
 *     + invalid words are "beefed" (does not include 'a') and "based" (includes 's' which is not in the puzzle).
 * 
 * Return any array answer, where answer[i] is the number of words in the given word list words 
 * that is valid with respect to the puzzle puzzles[i].
 * 
 * constraint: 
 *   + 1 <= words.length <= 10^5
 *   + 4 <= words[i].length <= 50
 *   + 1 <= puzzles.length <= 10^4
 *   + puzzles[i].length == 7
 *   + words[i] and puzzles[i] consist of lowercase English letters.
 *   + Each puzzles[i] does not contain repeated characters.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/10
 * @apiNote: bitmask and hashmap
 */

public class n1178_NumberOfValidWordsForEachPuzzle {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles){
        Map<Integer, Integer> map = new HashMap<>();
        for (String word : words){
            int mask = bitmask(word);
            map.put(mask, map.getOrDefault(mask, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (String puzzle : puzzles){
            int first = 1 << (puzzle.charAt(0) - 'a');
            int count = map.getOrDefault(first, 0);
            int mask = bitmask(puzzle.substring(1));
            for (int i = mask; i > 0; i = (i - 1) & mask){
                count += map.getOrDefault(i | first, 0);
            }
            res.add(count);
        }
        return res;
    }
    public int bitmask(String s){
        int mask = 0;
        for (char ch : s.toCharArray())
            mask |= 1 << (ch - 'a');
        return mask;
    }
    public static void main(String[] args){
        n1178_NumberOfValidWordsForEachPuzzle clz = new n1178_NumberOfValidWordsForEachPuzzle();
        String[] words;
        String[] puzzles;
        List<Integer> actual;
        
        words = new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        puzzles = new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        actual = clz.findNumOfValidWords(words, puzzles);
        System.out.println(Arrays.toString(actual.toArray()));
    }
}

/**
 * Illustration
 * 
 * bitmask: 
 *          [zywxvutsrqponmlkjihgfedcba]   ->    1 << (letter - 'a');
 *    aaaa :[00000000000000000000000001] : stored as 1
 *    asas :[00000001000000000000000001] : stored as 262145
 *    able :[00000000000000100000010011] : stored as 2067
 * 
 * sample of puzzle ("abslute" for example)
 * 
 * abslute :[zywxvutsrqponmlkjihgfedcba]
 *   first :[00000000000000000000000001]
 *    mask :[00000111000000100000010010]
 *    able :[00000000000000100000010011]
 * 
 * submask :[00000111000000100000010010] -> iterate from the first bit
 *     m-1 :[00000111000000100000010001]
 *  & mask :[00000111000000100000010010]
 * --------------------------------------
 * submask :[00000111000000100000010000] -> iterate to the second bit
 *     m-1 :[00000111000000100000001111]
 *  & mask :[00000111000000100000010010]
 * --------------------------------------
 * submask :[00000111000000100000000010] -> iterrate to the next one, and so on.
 * ...
 * 
 *                                              -> submask = (submask - 1) & mask
 *          mask :[00000111000000100000010010]  -> [111111]
 *       submask :[00000111000000100000010010]  -> [111111]
 *       submask :[00000111000000100000010000]  -> [111110]
 *       submask :[00000111000000100000000010]  -> [111101]
 *       submask :[00000111000000100000000000]  -> [111100]
 *       submask :[00000111000000000000010010]  -> [111011]
 *       submask :[00000111000000000000010000]  -> [111010]
 *       submask :[00000111000000000000000010]  -> [111001]
 *                     ....                           ...
 *       submask :[00000000000000000000000010]  -> [000001]
 *       submask :[00000000000000000000000000]  -> [000000]
 */
