package com.rainhu;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, 
 * but instead be stored inside the array nums1. To accommodate this, 
 * nums1 has a length of m + n, 
 * where the first m elements denote the elements that should be merged, 
 * and the last n elements are set to 0 and should be ignored. 
 * nums2 has a length of n.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/7
 * @apiNote: 
 */

public class n88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        m--; n--;
        while (m >= 0 && n >= 0){
            if (nums1[m] > nums2[n]){
                nums1[m+n+1] = nums1[m--];
            } else {
                nums1[m+n+1] = nums2[n--];
            }
        }
        while (m >= 0){
            nums1[m] = nums1[m--];
        }
        while (n >= 0){
            nums1[n] = nums2[n--];
        }
    }
}
