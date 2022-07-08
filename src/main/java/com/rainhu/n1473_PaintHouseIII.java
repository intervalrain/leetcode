package com.rainhu;

/**
 * 1473. Paint House III (Hard)
 * 
 * There is a row of m houses in a small city, 
 * each house must be painted with one of the n colors (labeled from 1 to n), 
 * some houses that have been painted last summer should not be painted again.
 * 
 * A neighborhood is a maximal group of continuous houses that are painted with the same color.
 * 
 *      + For example: houses = [1,2,2,3,3,2,1,1] contains 5 neighborhoods [{1}, {2,2}, {3,3}, {2}, {1,1}].
 * 
 * Given an array houses, an m x n matrix cost and an integer target where:
 * 
 *      + houses[i]: is the color of the house i, and 0 if the house is not painted yet.
 *      + cost[i][j]: is the cost of paint the house i with the color j + 1.
 *      + Return the minimum cost of painting all the remaining houses in such a way that there are exactly target neighborhoods. 
 *        If it is not possible, return -1.


 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/9
 * @apiNote: dynamic programming
 */

public class n1473_PaintHouseIII {
    
    static final int MAX_COST = 1000001;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // dp(i, j, k): house, color, group
        int[][][] dp = new int[m][n][target]; 
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < target; k++) {
                    dp[i][j][k] = MAX_COST;
                }
            }
        }
         
        if (houses[0] == 0) {
            for (int j = 0; j < n; j++) {
                dp[0][j][target - 1] = cost[0][j];
            } 
        } else {
            int j = houses[0] - 1;
            dp[0][j][target - 1] = 0;
        }
        
        
        int lr = target - 1;
        
        for (int i = 1; i < m; i++) {
            int hr = m - i;
            if (hr >= target) {
                hr = target - 1;
            }
            
            if (houses[i] > 0) {
                int j = houses[i] - 1;
                for (int remaining = hr; remaining >= lr; remaining--) {
                    // not change
                    dp[i][j][remaining] = Math.min(dp[i][j][remaining], dp[i - 1][j][remaining]);
                    
                    // change
                    if (houses[i - 1] > 0 && houses[i - 1] - 1 != j) {
                        dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], dp[i - 1][houses[i - 1] - 1][remaining]);
                    } else {
                        dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], min(dp[i - 1], j, remaining));
                    }
                }
                
                if (lr == 1) {
                    dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0]);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    for (int remaining = hr; remaining >= lr; remaining--) {
                        // not change
                        dp[i][j][remaining] = Math.min(dp[i][j][remaining], dp[i - 1][j][remaining] + cost[i][j]);

                        // change
                        if (houses[i - 1] > 0 && houses[i - 1] - 1 != j) {
                            dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], dp[i - 1][houses[i - 1] - 1][remaining] + cost[i][j]);
                        } else {
                            dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], min(dp[i - 1], j, remaining) + cost[i][j]);
                        }
                    }

                    if (lr == 1) {
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0] + cost[i][j]);
                    }
                }
            }
            
            if (lr > 1) {
                lr--;
            }
        }
        
        int min = dp[m - 1][0][0];
        for (int j = 1; j < n; j++) {
            if (dp[m - 1][j][0] < min) {
                min = dp[m - 1][j][0];
            }
        }

        return min < MAX_COST ? min : -1;
    }
    
    private int min(int[][] minCost, int j, int remaining) {
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < minCost.length; k++) {
            if (k != j && minCost[k][remaining] < min) {
                min = minCost[k][remaining];
            }
        }
        
        return min;
    }
    
}