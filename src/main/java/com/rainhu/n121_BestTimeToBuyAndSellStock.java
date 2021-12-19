package com.rainhu;

/**
 * 121. Best Time to Buy and Sell Stock (Easy)
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from the transaction. If you cannot achieve any profit, return 0.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/9
 * @apiNote
 */

public class n121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices){
        int len = prices.length;
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < len; i++){
            if (prices[i] < min) min = prices[i];
            int curr = prices[i] - min;
            profit = Math.max(profit, curr);
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices = new int[]{7,1,5,0,3,6,0,4};
        n121_BestTimeToBuyAndSellStock clz = new n121_BestTimeToBuyAndSellStock();
        System.out.println(clz.maxProfit(prices));
    }
}
