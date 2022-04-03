package com.rainhu;

import java.util.Arrays;

/**
 * 31. Next Permutation (Medium)
 * 
 * Implement next permutation,
 * which rearranges numbers into the lexicographically next greater permutation of numbers.
 * 
 * If such an arrangement is not possible,
 * it must rearrange it as the lowest possible order (i.e., sorted in ascending order)
 * 
 * The replacement must be in place and use only constant extra memory.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/4/4
 * @apiNote: Find the largest index i, j such that nums[i] < nums[j]. If no such index exists, just reverse nums.
 *           Swap the nums[i] and nums[j] where (i, j) is the largest set meet the condition above.
 *           Reverse the sub-array nums[i + 1:].
 */

public class n31_NextPermutation {

    public void nextPermutation(int[] nums){
        for (int i = nums.length - 2; i >= 0; i--){
            for (int j = nums.length - 1; j > i; j--){
                if (nums[j] > nums[i]){
                    swap(nums, i, j);
                    reverse(nums, i + 1, nums.length - 1);
                    return;
                }
            }
        }
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right){
        while (left < right){
            swap(nums, left, right);
            left++; right--;
        }
    }

    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,5};
        n31_NextPermutation clz = new n31_NextPermutation();
        for (int i = 0; i <= 10; i++){
            System.out.println(Arrays.toString(nums));
            clz.nextPermutation(nums);
        }
    }
}