package com.rainhu;

import java.util.Map;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 881. Boats to Save People (Medium)
 * 
 * You are given an array people where people[i] is the weight of the ith person,
 * and an infinite number of boats where each boat can carry a maximum weight of limit.
 * Each boat carries at most two people at the same time,
 * provided the sum of the weight of those people is at most limit.
 * 
 * Return the minimum number of boats to carry every given person.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/24;
 * @apiNote: array
 */

public class n881_BoatsToSavePeople {
    
    // best solution
    public int numRescueBoats(int[] people, int limit){
        int[] buckets = new int[limit + 1];
        for (int p : people) buckets[p]++;
        int start = 0;
        int end = buckets.length - 1;
        int cnt = 0;
        while (start <= end){
            while (start <= end && buckets[start] <= 0) start++;
            while (start <= end && buckets[end] <= 0) end--;
            if (buckets[start] <= 0 && buckets[end] <= 0) break;
            cnt++;
            if (start + end <= limit) buckets[start]--;
            buckets[end]--;
        }
        return cnt;
    }

    public int numRescueBoats1(int[] people, int limit){
        Arrays.sort(people);
        int i, j;
        for (i = 0, j = people.length - 1; i <= j; j--){
            if (people[i] + people[j] <= limit) i++;
        }
        return people.length - i - j;
    }
}
