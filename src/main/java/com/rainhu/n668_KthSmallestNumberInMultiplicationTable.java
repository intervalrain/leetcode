package com.rainhu;

/**
 * 668. Kth Smallest Number in Multiplication Table (Hard)
 * 
 * Nearly everyone has used the Multiplication Table.
 * The multiplication table of size m x n is an integer matrix mat where mat[i][j] == i * j (1-indexed).
 * 
 * Given three integers m, n, and k,
 * return the kth smallest element in the m x n multiplication table.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/16
 * @apiNote: binary search
 */

public class n668_KthSmallestNumberInMultiplicationTable {
    
    public int findKthNumber(int m, int n, int k){
        int left = 1;
        int right = m * n + 1;
        while (left < right) {
            int mid = left + (right-left)/2;
            int cnt = helper(mid, m, n); 
            if (cnt >= k)
                right = mid;
            else
                left = mid + 1;
        }
        return right;
    }

    public int helper(int val, int m, int n){
        int cnt = 0;
        for (int i=1; i<=n; i++){
            cnt += Math.min(m, val/i);
        }
        return cnt;
    }
}

