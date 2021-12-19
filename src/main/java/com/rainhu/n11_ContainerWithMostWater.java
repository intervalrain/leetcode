package com.rainhu;

/**
 * 11. Container With Most Water (Medium)
 * 
 * Given n non-negative integers a1, a2, ... , an,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
 * Find two lines, which together with the x-axis forms a container, 
 * such that the container contains the most water.
 * 
 * Notice that you may not slant the container.
 */
public class n11_ContainerWithMostWater {

    public int maxArea(int[] height){
        int left = 0;
        int right = height.length-1; 
        int area = calArea(height, left, right);

        while(left<right){
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
            if(area < calArea(height, left, right)){
                area = calArea(height, left, right);
            };
        }
        
        return area;
    }
    
    public int calArea(int[] height, int a, int b){
        return Math.min(height[a], height[b]) * Math.abs(b-a);
    }
}