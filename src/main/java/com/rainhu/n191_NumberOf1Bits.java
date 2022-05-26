package com.rainhu;

/**
 * 191. Number of 1 Bits (Easy)
 * 
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming Weight).
 * 
 * Note: 
 *      + Note that in some languages, such as Java, there is no unsigned integer type.
 *        In this case, the input will be given as signed integer type.
 *        It should not affect your implementation, as the integer's internal binary representation is the same,
 *        whether it is signed or unsigned.
 *      + In Java, the compiler represents the signed integers using 2's complement notation.
 *        Therefore, in Example 3, the input represents the signed integer -3.
 */

public class n191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0){
            if ((n & 1) == 1){
                cnt++;
            }
            n >>>= 1;
        }
        return cnt;
    }
}   
