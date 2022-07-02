package com.rainhu;

import java.util.Arrays;

/**
 * 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts (Medium)
 * 
 * You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
 *      + horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut.
 *      + verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
 * Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts.
 * Since the answer can be a large number, return this modulo 109 + 7.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/3
 * @apiNote: 
 */

public class n1465_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts{
    int mod = (int)1e+9 + 7;
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts){
        long maxw = 0;
        long maxh = 0;
        if (horizontalCuts.length == 0){
            maxw = w;
        } else {
            Arrays.sort(verticalCuts);
            maxw = verticalCuts[0];
            for (int i = 1; i < verticalCuts.length; i++)
                maxw = Math.max(verticalCuts[i] - verticalCuts[i-1], maxw);
            maxw = verticalCuts.length == 0 ? w : Math.max(w - verticalCuts[verticalCuts.length - 1], maxw);
        }
        if (verticalCuts.length == 0){
            maxh = h;
        } else {
            Arrays.sort(horizontalCuts);
            maxh = horizontalCuts[0];
            for (int i = 1; i < horizontalCuts.length; i++)
                maxh = Math.max(horizontalCuts[i] - horizontalCuts[i-1], maxh);
            maxh = horizontalCuts.length == 0 ? h : Math.max(h - horizontalCuts[horizontalCuts.length - 1], maxh);
        }
        return (int)(maxw * maxh % mod) ;
    }
}