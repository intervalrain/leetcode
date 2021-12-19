package com.rainhu;

/**
 * 
 * 
 * The Tribonacci sequence Tn is defined as follows:
 * T0 = 0
 * T1 = 1
 * T2 = 1
 * Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0
 * 
 * Given n, return the value Tn.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/12
 * @apiNote: Dynamic Programming
 */

public class n1137_NthTribonacciNumber {
    public int tribonacci(int n){
        if (n == 0) return 0;
        if (n < 3) return 1;
        int[] T = new int[n+1];
        T[0] = 0;
        T[1] = 1;
        T[2] = 1;
        for (int i = 3; i <= n; i++)
            T[i] = T[i-3] + T[i-2] + T[i-1];
        return T[n];
    }
    public static void main(String[] args){
        System.out.println(new n1137_NthTribonacciNumber().tribonacci(25));
    }
}
