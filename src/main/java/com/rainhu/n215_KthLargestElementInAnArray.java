package com.rainhu;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array (Medium)
 * 
 * Given an integer array nums and an integer k,
 * return the kth largest element in the array.
 * 
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * 
 * @author: Rain Hu
 * @version: 3
 * @since: 2022/6/23
 * @apiNotew: priority queue, binarysearch
 */

public class n215_KthLargestElementInAnArray {
    // binary search
    public int findKthLargest(int[] nums, int k){
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

    
    // binary search
    public int findKthLargest2(int[] nums, int k){
        int cnt;
        int left = 0, right = nums.length-1;
        do {
            cnt = bs(nums, k, left, right);
            if (cnt > k){
                right = cnt - 2;
            } else {
                left = cnt;
            }
        } while (cnt != k);
        return nums[k - 1];
    }
    private int bs(int[] nums, int k, int left, int right){
        int pivot = right;
        int cnt = left;
        for (int i = left; i < right; i++){
            if (nums[i] > nums[pivot]){
                swap(nums, i, cnt++);
            }
        }
        swap(nums, pivot, cnt++);
        return cnt;
    }
    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    // priority queue
    public int findKthLargest3(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer o1, Integer o2)->{return o2 - o1;});
        for (int i = 0; i < nums.length; i++){
            pq.offer(nums[i]);
        }
        while (--k > 0){
            pq.poll();
        }
        return pq.peek();
    }
}
