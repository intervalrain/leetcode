package com.rainhu;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters (Medium)
 * 
 * Given a string s,
 * find the length of the longest substring without repeating characters.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/1/23
 * @apiNote: Hash Map
 */

public class n3_LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s){
		if (s.length() == 0)
			return 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0, j = 0; i < s.length(); i++){
			if (map.containsKey(s.charAt(i))){
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		return max;
	}

	public int lengthOfLongestSubstring2(String s){
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
