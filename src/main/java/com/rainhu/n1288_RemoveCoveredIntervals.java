package com.rainhu;

import java.util.Arrays;

/**
 * 1288. RemoveCoveredIntervals (Medium)
 * 
 * Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri),
 * remove all intervals that are covered by another interval in the list.
 * The interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d.
 * 
 * Return the number of remaining intervals.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/20
 * @apiNote: Comparator
 */

public class n1288_RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        int cut = 0, left = -1, right = -1;
        Arrays.sort(intervals, (a,b)->((a[0]-b[0]==0)?(b[1]-a[1]):(a[0]-b[0])));
        for (int[] val : intervals){
            if (val[0] == left){
                cut++;
            } else {
                left = val[0];
                if (val[1] > right){
                    right = val[1];
                    continue;
                } 
                cut++;
            }
        }
        return intervals.length - cut;
    }
}
