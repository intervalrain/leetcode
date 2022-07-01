package com.rainhu;

import java.util.Arrays;

/**
 * 462. MinimumMovesToEqualArrayElementII (Medium)
 * 
 * Given an integer array nums of size n,
 * return the minimum number of moves required to make all array elements equal.
 * 
 * In one move, you can increment or decrement an element of the array by 1.
 * 
 * Test cases are designed so that the answer will fit in a 32-bit integer.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since 2022/6/30
 * @apiNote: 
 */

public class n462_MinimumMovesToEqualArrayElementII {
    public int minMoves2(int[] nums){
        int n = nums.length;
        int median = findKthElement(nums, (n+1)/2);
        int ans = 0;
        for(int num : nums){
            ans += Math.abs(num - median);
        }
        return ans;
    }

    public int findKthElement(int[] nums, int k){
        int left = 0, right = nums.length-1;
        k = nums.length - k;
        while (right - left > 5){
            int pivot = median3(nums, left, right);
            int i = left;
            int j = right - 1;
            while (true){
                do {
                    i++;
                } while (nums[i] < pivot);
                do {
                    j--;
                } while (nums[j] > pivot);
                if (i < j){
                    swap(nums, i, j);
                } else {
                    break;
                }
            }
            swap(nums, i, right - 1);
            if (i == k){
                return nums[i];
            } else if (i < k){
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        Arrays.sort(nums);
        return nums[k];
    }

    public void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    private int median3(int[] nums, int left, int right){
        int mid = left + (right - left)/2;
        if (nums[left] > nums[mid]){
            swap(nums, left, mid);
        }
        if (nums[mid] > nums[right]){
            swap(nums, mid, right);
        }
        if (nums[left] > nums[mid]){
            swap(nums, left, mid);
        }
        swap(nums, mid, right - 1);
        return nums[right - 1];
    }
}
