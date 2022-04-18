package com.rainhu;

/**
 * 42. Trapping Rain Water (Hard)
 * 
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/19
 * @apiNote:
 */

public class n42_TrappingRainWater {
    public int trap2(int[] height) {
        int n = height.length;
        if (n == 1 || n == 2) return 0;
        int max = height[0];
        int ix = 0;
        for (int i = 1; i < n; i++){
            if (height[i] > max){
                max = height[i];
                ix = i;
            }
        }
        int[] arr = new int[n];
        int curr = height[0];
        for (int i = 0; i < ix; i++){
            curr = Math.max(curr, height[i]);
            arr[i] = curr;
        }
        arr[ix] = max;
        curr = height[n-1];
        for (int i = n - 1; i > ix; i--){
            curr = Math.max(curr, height[i]);
            arr[i] = curr;
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += (arr[i] - height[i]);
        }
        return sum;
    }
    public int trap(int[] height){
        int n = height.length;
        if (n == 1 || n == 2) return 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        for (int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += Math.min(left[i], right[i]) - height[i];
        }
        return sum;
    }
}
