package com.rainhu;

/**
 * 3. Longest Substring Without Repeating Characters (Medium)
 * 
 * Given a string s,
 * find the length of the longest substring without repeating characters.
 * 
 * 
 */

public class n3_LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s){
		int max = 0;
		int start = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++){
			for (int j = start; j < i; j++){
				if (chars[i] == chars[j]){
					max = Math.max(max, i-start);
					start = j+1;
					break;
				}
			}
		}
		return Math.max(max, chars.length-start);
	}
}
