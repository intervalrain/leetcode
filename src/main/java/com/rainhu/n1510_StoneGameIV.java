package com.rainhu;

/**
 * 1510. Stone Game IV (Hard)
 * 
 * Alice and Bob take turns playing a game, with Alice starting first.
 * 
 * Initially, there are n stones in a pile.
 * On each player's turn, that player makes amove consisting of removing any non-zero square number of stones in the pile.
 * 
 * Also, If a player cannot make a move, he/she loses the game.
 * 
 * Given a positive integer n, return true if and only if Alice wins the game otherwise return false,
 * assumingboth players play optimally.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/22
 * @apiNote: dynamic programming
 *           [true, false, true, true, ...]
 *           If Alice wants to win, she has to pick up stones which makes stones left in dp are "false".
 */

public class n1510_StoneGameIV {
    public boolean winnerSquareGame(int n){
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; i++){
            for (int k = 1; k * k <= i; k++){
                if (!dp[i - k * k]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
