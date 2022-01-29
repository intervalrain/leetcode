package com.rainhu;

/**
 * 84. Largest Rectangle in Histogram (Hard)
 * 
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
 * return the area of the largest rectangle in the histogram.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/29
 * @apiNote: dynamic programming
 *           1. get the available width by obtain left[] and right[],
 *              where left[] means the index of the first bar height less than ith bar from the ith bar to the left.
 *                    right[] means the index of the first bar height less than ith bar from the ith bar to the right.
 *           2. max area = ith bar's height * available width
 *           3. iterate ith bar and calculate each max area referring to the ith bar.
 * 
 *                 @
 *               @ @
 *               @ @
 *               @ @   @
 *           @   @ @ @ @
 *           @ @ @ @ @ @
 *             p i
 * 
 *           case left: start from p = i - 1, and left[0] = -1;
 *           if h[p] >= h[i], p = left[p]
 *           if h[p] < h[i], left[i] = p
 * 
 *           case right: start from p = i + 1, and right[height.length - 1] = height.length;
 *           if h[p] >= h[i], p = right[p]
 *           if h[p] > h[i], right[i] = p
 */

public class n84_LargestRectangleInHistogram{
    public int largestRectangleArea(int[] heights){
        if (heights == null || heights.length == 0)
            return 0;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        left[0] = -1;
        right[heights.length-1] = heights.length;

        for (int i = 1; i < heights.length; ++i){
            int p = i - 1;
            while (p >= 0 && heights[p] >= heights[i]){
                p = left[p];
            }
            left[i] = p;
        }

        for (int i = heights.length - 2; i >= 0; --i){
            int p = i + 1;
            while (p < heights.length && heights[p] >= heights[i]){
                p = right[p];
            }
            right[i] = p;
        }

        int max = 0;
        for (int i = 0; i < heights.length; ++i){
            max = Math.max(max, heights[i] * (right[i] - left[i] - 1));
        }
        return max;
    }
}