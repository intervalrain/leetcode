package com.rainhu;

/**
 * 941. Valid Mountain Array (Easy)
 * 
 * Given an array of integers arr,
 * return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *     + arr.length >= 3
 *     + There exists some i with 0 < i < arr.length -1 such that: 
 *         + arr[0] < arr[1] < ... < arr[i-1] < arr[i]
 *         + arr[i] < arr[i + 1] > ,,, > arr[arr.length - 1]
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/25
 * @apiNote:
 */

public class n941_ValidMountainArray{
	public boolean validMountainArray(int[] arr){
		if (arr.length < 3)
			return false;
		int i = 0;
		while (i < arr.length - 1){
			if (arr[i] > arr[i + 1])
				break;
			else if (arr[i] == arr[i + 1])
				return false;
			i++;	
		}
		if (i == arr.length - 1 || i == 0)
			return false;
		while (i < arr.length - 1){
			if (arr[i] <= arr[i + 1])
				return false;
			i++;
		}
		return true;
	}
}
