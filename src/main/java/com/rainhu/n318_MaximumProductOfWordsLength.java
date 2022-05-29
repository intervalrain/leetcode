package com.rainhu;

/**
 * 318. Maximum Product of Words Length (Medium)
 * 
 * Given a string words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters.
 * if no such two words exist return 0;
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/29
 * @apiNote: bit manipulation
 */

public class n318_MaximumProductOfWordsLength {
    public int maxProduct(String[] words){
        int[] mask = maskify(words);
        int res = 0;
        for (int i = 0; i < mask.length-1; i++){
            for (int j = i+1; j < mask.length; j++){
                if ((mask[i] & mask[j]) == 0){
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }
    public int[] maskify(String[] words){
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            for (char ch : word.toCharArray()){
                res[i] |= (1 << (ch - 'a'));
            }
        }
        return res;
    }

}
