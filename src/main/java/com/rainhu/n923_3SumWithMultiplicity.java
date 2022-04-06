package com.rainhu;

import java.util.Map;
import java.util.HashMap;

/**
 * 923. 3Sum With Multiplicity (Medium)
 * 
 * Given an integer array arr, and an integer target,
 * return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target
 * 
 * As the answer can be very large, return it modulo 10^9 + 7.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/6
 * @apiNote: Hash Map
 */

public class n923_3SumWithMultiplicity {
    public int threeSumMulti(int[] arr, int target) {
        Map<Long, Long> map = new HashMap<>();
        long cnt = 0;
        for (long num : arr){
           map.put(num, map.getOrDefault(num, 0l) + 1);
        }
   
        for (long i : map.keySet()){
            for (long j : map.keySet()){
                long k = target - i - j;
                if (map.containsKey(k)){
                    if (i > j || j > k) continue;
                    if (i == j && j == k)
                        cnt += CN3(map.get(i));
                    else if (i == j)
                        cnt += CN2(map.get(i)) * map.get(k);
                    else if (j == k)
                        cnt += CN2(map.get(j)) * map.get(i);
                    else if (k == i)
                        cnt += CN2(map.get(k)) * map.get(j);
                    else
                        cnt += (map.get(i) * map.get(j) * map.get(k));
                }
            }
        }

        return (int)(cnt % 1000000007);
    }
   
    public static long CN3(long n){
        return n * (n-1) * (n-2) / (3 * 2);
    }

    public static long CN2(long n){
        return n * (n-1) / 2;
    }
}
