package com.rainhu;

/**
 * 167. Two Sum II - Input Array Is Sorted (Medium)
 * 
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * 
 * Return the indices of thw two numbers, index1 and index2, added by one as an integerarray [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution.
 * You may not use the same elements twice.
 * 
 * Your solution must use only constant extra space.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/6/10
 * @apiNote: binary search
 */

public class n167_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target){
        int left = 0, right = numbers.length - 1;
        
        while (left < right){
            int mid = left + (right - left);
            int curr = numbers[left] + numbers[right];

            if (curr == target){
                break;
            } else if (curr < target){
                if (numbers[mid] + numbers[right] < target){
                    left = mid + 1;
                } else {
                    left++;
                }
            } else {
                if (numbers[mid] + numbers[left] > target){
                    right = mid - 1;
                } else {
                    right--;
                }
            }
        }
        return new int[]{left+1, right+1};
    }
    public int[] twoSum2(int[] numbers, int target){
        int i = 0, find = 0;
        for (i = 0; i < numbers.length - 1; i++){
            find = binarySearch(numbers, i + 1, numbers.length - 1, target - numbers[i]);
            if (find != -1) break;
        }
        return new int[]{i + 1, find + 1};
    }

    public int binarySearch(int[] arr, int left, int right, int target){
        while (left <= right){
            int mid = left + (right - left)/2;
            if (arr[mid] == target) 
                return mid;
            else if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
        }
        return -1;
    }
}
