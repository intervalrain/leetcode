package com.rainhu;

import java.util.Map;
import java.util.HashMap;

/**
 * 1. Two Sum(Easy)
 * 
 * Given an array of integers nums and an integer target,
 * indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/5
 * @apiNote: Hash Map
 */

public class n1_TwoSum {
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			if (map.containsKey(target-nums[i]))
				return new int[]{map.get(target-nums[i]), i};
			map.put(nums[i], i);
		}
		return null;
	}
}
