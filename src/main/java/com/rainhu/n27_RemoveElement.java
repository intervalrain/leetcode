package com.rainhu;

/**
 * 27. Remove Element (Easy)
 * 
 * Given an integer array nums and integer val,
 * remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 * 
 * Since it is impossible to change the length of array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class n27_RemoveElement {
    public int removeElement(int[] nums, int val){
        int size = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[size++] = nums[i];
            }
        }
        return size;
    }
}
