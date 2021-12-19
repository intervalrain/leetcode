package com.rainhu;

/**
 * 540. Single Element in a Sorted Array (Medium)
 * 
 * You are given a sorted array consisting of only integers where every element apeears exactli twice,
 * except for one element which appears exactly one.
 * 
 * Return the single element that appears only once.
 * 
 * Your solution must run in O(log n) time and O(1) space.
 */

public class n540_SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums){
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (right > left){
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;
            
            if (nums[mid] != nums[mid+1]){
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}


/**
 * [ 3, 7, 7,10,10,11,11]
 * [ 0  1  2  3  4  5  6]
 * [ l        m        r]
 * [ l     m           r]
 * [ l  m  r]
 * [ m     r]
 * [ r      ]
 */