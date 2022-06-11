package com.rainhu;

import java.util.Map;
import java.util.HashMap;

public class n1658_MinimumOperationsToReduceXtoZero {

    public int minOperations(int[] nums, int x){
        Map<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        int minStep = Integer.MAX_VALUE;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++){
            curr += nums[i];
            if (curr == x){
                minStep = i + 1;
                break;
            } 
            if (curr > x) break;
            map.put(curr, i);
        }
        curr = 0;
        for (int i = nums.length - 1; i >= 0; i--){
            curr += nums[i];
            if (curr > x) break;
            if (map.containsKey(x - curr)){
                int pos = map.get(x - curr);
                if (i <= pos) 
                    continue;
                else
                    minStep = Math.min(minStep, (nums.length - i) + (pos + 1));
            }
        }
        return minStep == Integer.MAX_VALUE ? -1 : minStep;
    }
}
