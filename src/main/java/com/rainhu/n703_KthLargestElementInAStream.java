package com.rainhu;

import java.util.Arrays;

/**
 * Design a class to find the Kth largest element in a stream.
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * 
 * Implement KthLargest class:
 *     + KthLargest(int k, int[] nums) initializes the object with the integer k and the stream of integers nums.
 *     + int add(int val) appeands the integer val to the stream and returns the element representing the kth largest element in the stream.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/9
 * @apiNote: heap sort
 */

public class n703_KthLargestElementInAStream {
    
    int[] arr;
    int n;

    public n703_KthLargestElementInAStream(int k, int[] nums){
        this.arr = new int[k];
        Arrays.fill(arr, Integer.MIN_VALUE);
        this.n = k;
        for (int num : nums)
            add(num);
    }

    public int add(int val){
        if (val > arr[0]){
            arr[0] = val;
            heapify(arr, 0);
        }
        return arr[0];
    }

    public void heapify(int[] array, int i){
        int min = i;
        int n = array.length;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[left] < array[min])
            min = left;
        if (right < n && array[right] < array[min])
            min = right;
        if (min != i){
            swap(arr, min, i);
            heapify(array, min);
        }
    }

    void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
