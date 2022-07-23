package com.rainhu;

/**
 * 629. K Inverse Pairs Array (Hard)
 * 
 * For an integer array nums, 
 * an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].
 * 
 * Given two integers n and k, 
 * return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. 
 * Since the answer can be huge, return it modulo 109 + 7.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/19
 * @apiNote: dynamic programming
 */

public class n629_KInversePairsArray {
    int[][] dp;
    public int kInversePairs(int n, int k){
        dp = new int[n+1][k+1];
        if (k > (n+1)*n/2) return 0;
        dp[0][0] = 1;
        if (dp[n][k] > 0)
            return dp[n][k];
        for (int N = 1; N <= n; ++N)
            for (int K = 0; K <= k; ++K) {
                dp[N][K] = (dp[N - 1][K] + (K > 0 ? dp[N][K - 1] : 0)) % 1000000007;
                if (K >= N)
                    dp[N][K] = (1000000007 + dp[N][K] - dp[N - 1][K - N]) % 1000000007;
            }
        return dp[n][k];
    }
}

//   1 2 3 4 5
// 0 1 1 1 1 1
// 1 0 1 2 3 4
// 2 0 0 2 5 9
// 3 0 0 1 6 15
// 4 0 0 0 5 20
// 5 0 0 0 3 22
// 6 0 0 0 1 20
// 7 0 0 0 0 15
// 8 0 0 0 0 9
// 9 0 0 0 0 4
//10 0 0 0 0 1
