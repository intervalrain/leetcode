package com.rainhu;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * 15. 3Sum(Medium)
 * 
 * Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
 * and nums[i] + nums[j] + nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 */



public class n15_3Sum {
    public List<List<Integer>> threeSum(int[] nums){
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int negNums = 0;
        int posNums = 0;
        int zeroNums = 0;
        List<List<Integer>> result = new LinkedList<>();

        // to judge array condition
        for (int num : nums){
            if (num < minVal) minVal = Math.min(num, minVal);
            if (num > maxVal) maxVal = Math.max(num, maxVal);
            if (num == 0)
                zeroNums++;
            else if (num > 0)
                posNums++;
            else
                negNums++;
        }

        // to quickly solve special case
        if (zeroNums >= 3) result.add(Arrays.asList(0, 0, 0));
        if (posNums==0 || negNums==0) return result;
        if (maxVal + 2 * minVal > 0) maxVal = -2 * minVal;
        if (minVal + 2 * maxVal < 0) minVal = -2 * maxVal;

        int posStart = 0;
        int[] negNumMap = new int[negNums];
        int[] posNumMap = new int[posNums];
        byte[] numMap = new byte[maxVal - minVal + 1];

        negNums = 0;
        posNums = 0;

        for (int num : nums){
            if (num >= minVal && num <= maxVal){
                // select non-repeating item
                if (numMap[num-minVal]++ != 0){
                    numMap[num-minVal] = 2;
                } else {
                    if (num > 0)
                        posNumMap[posNums++] = num;
                    else if(num < 0)
                        negNumMap[negNums++] = num;
                        
                }   
            }
        }

        // sort by ascending order
        Arrays.parallelSort(posNumMap, 0, posNums);
        Arrays.parallelSort(negNumMap, 0, negNums);

        // from the most negative integer
        for (int i = negNums - 1; i>=0; i--){
            int nv = negNumMap[i];
            int minpv = (-nv) / 2;

            while (posStart < posNums && posNumMap[posStart] < minpv)
                posStart++;

            for (int j = posStart; j < posNums; j++){
                int pv = posNumMap[j];
                int ln = 0 - nv - pv;

                if (ln >= nv && ln <= pv){
                    if (numMap[ln - minVal] == 0) {
                        continue;
                    } else if (ln == pv || ln == nv){
                        if (numMap[ln - minVal] > 1)
                            result.add(Arrays.asList(nv, pv, ln));
                    } else {
                        result.add(Arrays.asList(nv, pv, ln));
                    }
                } else if (ln < nv) {
                    break;
                }
            }
        }
        return result;
    }
}
