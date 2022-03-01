package com.rainhu;

/**
 * 338. Counting Bits (Easy)
 * 
 * Given an integer n,
 * return an array ans of length n + 1 such that for each i ( 0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/1
 * @apiNote: bit Maniputation
 */

public class n338_CountingBits {
    public int[] countBits(int n){
        int[] res = new int[n+1];
        for (int i = 0; i < n + 1; i++){
            res[i] = bitCount(i);
        }
        return res;
    }
    private static int bitCount(int i){
        i = (i & 0x55555555) + ((i >>> 1) & 0x55555555);  // 0b0101_0101_0101_0101_0101_0101_0101_0101
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);  // 0b0011_0011_0011_0011_0011_0011_0011_0011
        i = (i & 0x0f0f0f0f) + ((i >>> 4) & 0x0f0f0f0f);  // 0b0000_1111_0000_1111_0000_1111_0000_1111
        i = (i & 0x00ff00ff) + ((i >>> 8) & 0x00ff00ff);  // 0b0000_0000_1111_1111_0000_0000_1111_1111
        i = (i & 0x0000ffff) + ((i >>>16) & 0x0000ffff);  // 0b0000_0000_0000_0000_1111_1111_1111_1111
        return i;
    }

}
