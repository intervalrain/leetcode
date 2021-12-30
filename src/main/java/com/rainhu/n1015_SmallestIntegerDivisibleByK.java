package com.rainhu;

/**
 * 1015. Smallest Integer Divisible by K (Medium)
 * 
 * Given a positive integer k,
 * you need to find the length of the smallest positive integer n such that n is divisible by k,
 * and n only contains the digit 1.
 * 
 * Return the length of n. If there is no such n, return -1.
 * 
 * Note: n may not fit in a 64-bit signed integer.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/31
 * @apiNote: dp
 */

public class n1015_SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k){
        if (k % 2 == 0 || k % 5 == 0) return -1;
        boolean[] hit = new boolean[k];
        int n = 0;
        int len = 0;
        while (true){
            len++;
            n = (n * 10 + 1) % k;
            if (n == 0) return len;
            if (hit[n]) return -1;
            hit[n] = true;
        }
    }
}
