package com.rainhu;

/**
 * 441. Arranging Coins (Easy)
 * 
 * You have n coins and you want to build a staircase with these coins.
 * The staircase consists of rows where th ith row has exactly i coins.
 * THe last row of the staircase may be incomplete.
 *
 * Given the integer n, return the number of complete row of the staircase you will build.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/6
 * @apiNote: Summation formula
 */

public class n441_ArrangingCoins{
    public int arrangeCoins(int n){
        return (int)(Math.sqrt((double)(n+1))*Math.sqrt(2)-0.5);
    }


}

