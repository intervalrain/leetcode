package com.rainhu;

import java.util.Arrays;

/**
 * 1029. Two City Scheduling (Medium)
 * 
 * A company is planning to interview 2n people. 
 * Given the array costs where costs[i] = [aCosti, bCosti], 
 * the cost of flying the ith person to city a is aCosti, 
 * and the cost of flying the ith person to city b is bCosti.
 * 
 * Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/25
 * @apiNote: dfs
 */

public class n1029_TwoCityScheduling {
    // best solution
    int[][] costs;
    int[][] dp;
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        this.costs = costs;
        dp = new int[(n/2) + 1][(n/2) + 1]; 
        return dfs(n-1,n/2,n/2);
    }
    
    int dfs(int index, int a, int b) {
        if (index < 0) return 0;
        if (dp[a][b] > 0) return dp[a][b];
        int[] curr = costs[index];
        int ans = 0;
        
        if (a == 0){
            ans = curr[1] + dfs(index-1, a, b-1);
        } else if (b == 0){
            ans = curr[0] + dfs(index-1, a-1, b);
        } else {
            ans = Math.min(curr[0] + dfs(index-1, a-1, b), curr[1] + dfs(index-1, a, b-1));
        }
        dp[a][b] = ans;
        return dp[a][b];
    }
    
    
    public int twoCitySchedCost1(int[][] costs){
        int N = costs.length/2;
        int[] refund = new int[N * 2];
        int minCost = 0, index = 0;
        for(int[] cost : costs){
            refund[index++] = cost[1] - cost[0];
            minCost += cost[0];
        }
        Arrays.sort(refund);
        for(int i = 0; i < N; i++){
            minCost += refund[i];
        }
        return minCost;
    }
}
