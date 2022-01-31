package com.rainhu;

/** 1672. Richest Customer Wealth (Easy)
 *
 *  You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
 *  Return the wealth that the richest customer has.
 *
 *  A customer's wealth is the amount of money they have in all their bank accounts.
 *  The richest customer is the customer that has the maximum wealth.
 *
 *  @author: Rain Hu
 *  @version: 1
 *  @since: 2022/2/1
 *  @apiNote: array
 *
 */

public class n1672_RichestCustomerWealth{
    public int maximumWealth(int[][] accounts){
        int max = 0;
        for (int i = 0; i < accounts.length; i++){
            int wealth = 0;
            for (int j = 0; j < accounts[0].length; j++){
                wealth += accounts[i][j];
            }
            max = max > wealth ? max : wealth;
        }
        return max;
    }
}
