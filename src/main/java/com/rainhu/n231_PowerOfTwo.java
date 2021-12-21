package com.rainhu;

/**
 * 231. Power of Two (Easy)
 * 
 * Given an integer n,
 * return true if it is a power of two.
 * Otherwise, return false;
 * 
 * An integer n is a power of two,
 * if there exists an integer x such that n == 2x.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/22
 * @apiNote
 */

public class n231_PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if (n < 0) return false;
        int tmp = 1;
        while (n >= tmp && 0x40000000 > tmp){
            if (tmp == n) return true;
            tmp <<= 1;
        }
        return n == 0x40000000;
    }

    // best solution
    public boolean isPowerOfTwo2(int n){
        return (n & (n-1)) == 0 && n > 0;
    }
}