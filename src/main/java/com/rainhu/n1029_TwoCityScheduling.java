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
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int[][] memo = new int[(n/2) + 1][(n/2) + 1]; 
        return dfs(n - 1, n / 2, n / 2, costs, memo);
    }
    
    int dfs(int index, int num_a, int num_b, int[][] costs, int[][] memo) {
        if (index < 0) {
            return 0;
        }
        
        if (memo[num_a][num_b] > 0) return memo[num_a][num_b];

        int[] currCosts = costs[index];
        int ans = 0;
        
        if (num_a == 0) {
            ans = currCosts[1] + dfs(index - 1, num_a, num_b - 1, costs, memo); 
        } else if (num_b == 0) {
            ans = currCosts[0] + dfs(index - 1, num_a - 1, num_b, costs, memo);
        } else {
            int min_b = currCosts[1] + dfs(index - 1, num_a, num_b - 1, costs, memo);
            int min_a = currCosts[0] + dfs(index - 1, num_a - 1, num_b, costs, memo);
            ans = Math.min(min_b, min_a);
        }
        
        memo[num_a][num_b] = ans;
        return memo[num_a][num_b];
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
