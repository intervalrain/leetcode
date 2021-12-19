package com.rainhu;

/**
 * 461. Hamming Distance (Easy)
 * 
 * The Hamming distance between two integers is the number of positions at which the correspoinding bits are different.
 * 
 * Given two integers x and y, return the Hamming distance between them.
 */

public class n461_HammingDistance {
    public int hammingDistance(int x, int y){
        int diff = x ^ y;
        return countOne(diff);
    }   
    
    public int countOne(int num){
        int count = 0;
        while (num != 0){
            num = num & (num-1);
            count++;
        }
        return count;
    }

    /**
     * [1000001]
     * [0101000]
     * ---------
     * [1101001] - xor result
     * 
     * [1101000] - (1)
     * [1101000]
     * 
     * [1100111] - (2)
     * [1100000]
     * 
     * [1011111] - (3)
     * [1000000]
     * 
     * [0111111] - (4)
     * [0000000]
     */
}
