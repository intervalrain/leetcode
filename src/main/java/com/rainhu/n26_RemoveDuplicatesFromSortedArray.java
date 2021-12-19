package com.rainhu;

/**
 * 26. Remove Duplicates from Sorted Array (Easy)
 * 
 * Given an integer nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * 
 * Since it is impossible to change the length of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class n26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){
        if(nums.length==0)
            return 0;
        int curr = -101;
        int size = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=curr){
                curr = nums[i];
                nums[size++] = nums[i];
            }
        }
        return size;
    }
}
