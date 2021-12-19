package com.rainhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 986. Interval List Intersections (Medium)
 * 
 * You are given two lists of closed intervals,
 * firstList and secondList,
 * where firstList[i] = [start_i, end_i] and secondList[j] = [start_j, end_j].
 * Each list of intervals is pairwise disjoin and in sorted order.
 * 
 * Return the intersection of these two interval lists.
 * 
 * A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
 * 
 * The intersection of two closed intervals is a set of real numbers that are either empty or represented as closed interval.
 * For example, the intersection of [1, 3] and [2, 4] is [2, 3];
 */

public class n986_IntervalListIntersections {
    int[][] intervalIntersection(int[][] firstList, int[][] secondList){
        int i = 0;
        int j = 0;
        List<int[]> res = new ArrayList<>();
        while (i<firstList.length && j < secondList.length){
            int left = Math.max(firstList[i][0], secondList[j][0]);
            int right = Math.min(firstList[i][1], secondList[j][1]);
            int[] arr = new int[]{left, right};
            if(left <= right)
                res.add(arr);
            if (firstList[i][1] < secondList[j][1])
                i++;
            else
                j++;
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args){
        int[][] firstList = new int[][]{{0,2}, {5,10}, {13,23}, {24,25}};
        int[][] secondList = new int[][]{{1,5}, {8,12}, {15,24}, {25,26}};
        
        int[][] res = new n986_IntervalListIntersections().intervalIntersection(firstList, secondList);
        for (int i=0; i<res.length; i++)
            System.out.println(Arrays.toString(res[i]));
    }

}
