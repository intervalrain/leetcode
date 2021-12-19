package com.rainhu;

/**
 * 509. Fibonacci Number (Easy)
 * 
 * The Fibonacci numbers, commonly denoted F(n) from a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
 * starting from 0 and 1.
 * That is, 
 *   F(0) = 0,
 *   F(1) = 1
 *   F(n) = F(n-1) + F(n-2) , for n > 1
 * Given n, calculate F(n)
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/12
 * @apiNote: dynamic programming
 */

public class n509_FibonacciNumber {
    public int fib(int n){
        if (n < 2) return n;
        int[] fn = new int[n+1];
        fn[0] = 0;
        fn[1] = 1;
        for (int i = 2; i <= n; i++){
            fn[i] = fn[i-1] + fn[i-2];
        }
        return fn[n];
    }
}
