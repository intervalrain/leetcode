package com.rainhu;

import java.util.Arrays;

/**
 * 322. Coin Change (Medium)
 * 
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * 
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * 
 * You may assume that you have an infinite number of each kind of coin.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/1
 * @apiNote: dynamic programming
 */
public class n322_CoinChange {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.sort(coins);
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = coins.length - 1; i >= 0; i--){
            int coin = coins[i];
            for (int j = coin; j <= amount; j++){
                if (dp[j - coin] != -1){
                    if (dp[j] == -1) 
                        dp[j] = dp[j - coin] + 1;
                    else
                        dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                }
            }
        }
       return dp[amount];
    }

    public static void main(String[] args){
        int[] coins = new int[]{2,1,5};
        int amount = 11;
        n322_CoinChange clz = new n322_CoinChange();
        System.out.println(clz.coinChange(coins, amount));
    }
}
