package com.rainhu;

/**
 * 85. Maximal Rectangle (Hard)
 * 
 * Given a rows x cols binary matrix filled with 0's and 1's,
 * find the largest rectangle containing only 1's and return its area.
 * 
 * @author: Rain Hu
 * @version: 
 * @since: 2021/12/1
 * @apiNote: 
 */

public class n85_MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int[] height = new int[matrix[0].length];
        for(int i = 0; i < matrix[0].length; i ++){
            if(matrix[0][i] == '1') height[i] = 1;
        }
        int result = largestInLine(height);
        for(int i = 1; i < matrix.length; i ++){
            resetHeight(matrix, height, i);
            result = Math.max(result, largestInLine(height));
        }

        return result;
    }

    private void resetHeight(char[][] matrix, int[] height, int idx){
        for(int i = 0; i < matrix[0].length; i ++){
            if(matrix[idx][i] == '1') height[i] += 1;
            else height[i] = 0;
        }
    }

    public int largestInLine(int[] heights) {
        int[] stack = new int[heights.length + 1];
        int top = -1;
        int ret = 0;
        for(int i = 0; i <= heights.length; i++) {
            int height = (i == heights.length ? 0 : heights[i]);
            while(top > -1 && height < heights[stack[top]]) {
                int idx = stack[top--];
                int preIndex = top > -1 ? stack[top] + 1: 0;
                ret = Math.max(ret, heights[idx] * (i - preIndex));
            }

            stack[++top] = i;
        }
        return ret;
    }
}
