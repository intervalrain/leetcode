package com.rainhu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 973. K Closest Points to Origin
 * 
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 * 
 * The distance between two points on the X-Y plane is the Euclidean distance.
 * 
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/27
 * @apiNote:
 */

public class n973_KClosestPointsToOrigin{
    public int[][] KClosest(int[][] points, int k){
        int[][] res = new int[k][];
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {     
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        for (int i = 0; i < k; i++)
            res[i] = points[i];

        return res;
    }
}