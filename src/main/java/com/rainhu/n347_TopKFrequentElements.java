package com.rainhu;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 347. Top K Frequent Elements (Medium)
 * 
 * Given an integer array nums and an integer k,
 * return the k most frequent elements.
 * You may return the answer in any order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/9
 * @apiNote: heap sort
 */

public class n347_TopKFrequentElements {
    
    // best solution
    @SuppressWarnings("unchecked")
    public int[] topKFrequent(int[] nums, int k){
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        int[] cnt = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++){
            cnt[nums[i] - min]++;
        }
        List<Integer>[] c2n = new List[nums.length + 1];
        for (int i = 0; i < cnt.length; i++){
            if (cnt[i] == 0) continue;
            int n = i + min;
            if (c2n[cnt[i]] == null)
                c2n[cnt[i]] = new ArrayList<>();
            c2n[cnt[i]].add(n);
        }
        int[] result = new int[k];
        for (int i = c2n.length - 1; i >= 0 && k > 0; i--){
            if (c2n[i] != null){
                for (int n : c2n[i]){
                    result[--k] = n;
                    if (k == 0) return result;
                }
            }
        }
        return result;
    } 


    // my solution by heap sort
    Map<Integer, Integer> map;
    int[] arr;

    public int[] topKFrequent2(int[] nums, int k){
        map = new HashMap<>();
        map.put(Integer.MIN_VALUE, 0);
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        arr = new int[k];
        Arrays.fill(arr, Integer.MIN_VALUE);
        for (Integer key: map.keySet()){
            add(key);
        }
        return arr;
    }

    void add(int key){
        if (map.get(key) > map.get(arr[0])){
            arr[0] = key;
            heapify(arr, 0);
        }
    }

    void heapify(int[] arr, int i){
        int min = i;
        int n = arr.length;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && map.get(arr[left]) < map.get(arr[min]))
            min = left;
        if (right < n && map.get(arr[right]) < map.get(arr[min]))
            min = right;
        if (min != i){
            swap(arr, min, i);
            heapify(arr, min);
        }
    }

    void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
