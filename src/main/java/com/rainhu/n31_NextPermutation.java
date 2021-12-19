package com.rainhu;

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
 */

public class n31_NextPermutation {

    public void nextPermutation(int[] nums){
        if (nums.length == 1)
            return;
        int len = nums.length;
        if(nums[len-1] > nums[len-2]){
            swap(nums, len-1, len-2);
            return;
        } else {
            int left = len-1;
            for (int i = len - 2; i >= 0; i--){
                if (nums[i] < nums[i+1]){
                    left = i;
                    break;
                }
            }
            if (left == len-1){
                reverse(nums, 0, len-1);
                return;
            }
            int right = left + 1;
            for (int i = right; i < len; i++){
                if (nums[i] > nums[left] && nums[i] <= nums[right])
                    right = i;
            }
            swap(nums, left, right);
            reverse(nums, left+1, len-1);
        }   
    }
    private void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
    /**
     * 1. Find the largest index k such that nums[k] < nums[k+1]. If no such index exists, just reverse nums.
     * 2. Find the largest inedx l > k such that nums[k] < nums[l].
     * 3. Swap nums[k] and nums[l].
     * 4. Reverse the sub-array nums[k + 1:].
     *      by Narayana Pandita
     */

    /**
     * 1,2,3
     * 1,3,2 -> is next permutation of 1,2,3
     * 2,1,3 -> is next permutation of 1,3,2
     * 2,3,1 -> is next permutation of 2,1,3
     * 3,1,2 -> is next permutation of 2,3,1
     * 3,2,1 -> is next permutation of 3,1,2
     * 1,2,3 -> no next permutation. So return 1,2,3
     */