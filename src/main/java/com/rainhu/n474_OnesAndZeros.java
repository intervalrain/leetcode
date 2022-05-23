package com.rainhu;

/**
 * 474. Ones and Zeros (Medium)
 * 
 * You are given an array of binary strings strs and two integers m and n.
 * 
 * Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
 * A set x is a subset of a set y if all elements of x are also elements of y.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/23
 * @apiNote: dp
 */

public class n474_OnesAndZeros {
    public int findMaxForm(String[] strs, int m, int n){
        int[][] count = new int[strs.length][2];
        for (int i = 0; i < strs.length; i++){
            String str = strs[i];
            for (char ch : str.toCharArray()){
                if (ch == '0') count[i][0]++;
                if (ch == '1') count[i][1]++;
            }
        }
        int[][] dp = new int[m+1][n+1];
        for (int[] num :  count){
            for (int i = m; i >= num[0]; i--){
                for (int j = n; j >= num[1]; j--){
                    dp[i][j] = Math.max(dp[i][j], 1+dp[i-num[0]][j-num[1]]);
                }
            }
        }
        int res = dfs(count, m, n, 0, 0);
        System.out.println(res);
        return dp[m][n];
    }
    private int dfs(int[][] count, int m, int n, int i, int cnt){
        if (m < 0 || n < 0) return cnt-1;
        if (i == count.length) return cnt;
        int pick = dfs(count, m - count[i][0], n - count[i][1], i+1, cnt+1);
        int unpick = dfs(count, m, n, i+1, cnt);
        return Math.max(pick, unpick);
    }
}
