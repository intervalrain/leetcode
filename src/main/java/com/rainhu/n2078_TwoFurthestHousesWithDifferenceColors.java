package com.rainhu;

/**
 * 2078. Two Furthest Houses With Difference Colors (Easy)
 * 
 * There are n houses evenly lined up on the street,
 * and each house is beautifully painted.
 * You are given a 0-indexed integer array colors of length n,
 * where colors[i] represents the color of the ith house.
 * 
 * Return the maximum between the ith and jth houses is abs(i-j),
 * where abs(x) is the absolute value of x.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/9
 * @apiNote
 */

public class n2078_TwoFurthestHousesWithDifferenceColors {
    public int maxDistance(int[] colors){
        int len = colors.length;
        int n = len - 1;
        while (n > 0){
            for (int i = 0; i + n < len; i++)
                if (colors[i] != colors[i+n]) return n;
            n--;
        }
        return 1;
    }
}
