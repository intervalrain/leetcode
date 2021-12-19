package com.rainhu;

/**
 * 70. Climbing Stairs (Easy)
 * 
 * You are climbing a staircase.
 * It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 */

/**
 * Analysis:
 *   Fibonacci Sequence
 */
public class n70_ClimbingStairs {
    public int climbStairs(int n){
        return helper(0, 1, n);
    }
    private int helper(int n1, int n2, int n){
        if(n==1)
            return n1+n2;
        return helper(n2, n1+n2, n-1);
    }
}
