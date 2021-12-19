package com.rainhu;

/**
 * 4. Median of Two Sorted Arrays (Hard)
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log(m+n))
 */

public class n4_MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2){
		int totalLength = nums1.length + nums2.length;
		if ((totalLength & 1) == 1){
			return findKthSmallest(nums1, 0, nums2, 0, (totalLength >> 1) + 1);
		} else {
			return (findKthSmallest(nums1, 0, nums2, 0, (totalLength >> 1) + 1) + findKthSmallest(nums1, 0, nums2, 0, (totalLength >> 1))) / 2.0;
		}
	}

	private double findKthSmallest(int[] nums1, int start1, int[] nums2, int start2, int k){
		if (nums1.length == start1)
			return nums2[start2 + k - 1];
		if (nums2.length == start2)
			return nums1[start1 + k - 1];
		if (k == 1)
			return Math.min(nums1[start1], nums2[start2]);
		int midA = Integer.MAX_VALUE;
		int midB = Integer.MAX_VALUE;
		if (start1 + (k >> 1) - 1 < nums1.length)
			midA = nums1[start1 + (k >> 1) - 1];
		if (start2 + (k >> 1) - 1 < nums2.length)
			midB = nums2[start2 + (k >> 1) - 1];
		if (midA < midB){
			return findKthSmallest(nums1, start1 + (k >> 1), nums2, start2, k - (k >> 1));
		} else {
			return findKthSmallest(nums1, start1, nums2, start2 + (k >> 1), k - (k >> 1));
		}
	}
}
/**
 * Analysis:
 *   1. len(left_part) == len(right_part)
 *   2. max(left_part) <= min(right_part)
 * 
 *  ==> median = (max(left_part) + min(right_part))/2
 *
 */