package com.rainhu;

/**
 * 122. Best Time to Buy and Sell Stock II (Medium)
 * 
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * 
 * Find and return the maximum profit you can achieve.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021//11/10
 * @apiNote: simple loop
 */

public class n122_BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices){
        int sum = 0;
        for (int i = 1; i < prices.length; i++){
            sum += (prices[i] > prices[i-1] ? prices[i] - prices[i-1] : 0);
        }
        return sum;
    }
}
