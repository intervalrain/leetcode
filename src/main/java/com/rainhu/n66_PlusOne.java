package com.rainhu;

/**
 * 66. Plus One (Easy)
 * 
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are oredered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 */

public class n66_PlusOne {
    public int[] plusOne(int[] digits){
        int i = digits.length-1;
        digits[i] += 1;
        while(digits[i]==10){
            if(i!=0){
                digits[i] = 0;
                digits[--i] += 1;
            } else {
                int[] digits_ex = new int[digits.length+1];
                digits[i] = 0;
                digits_ex[0] = 1;
                System.arraycopy(digits, 0, digits_ex, 1, digits.length);
                return digits_ex;
            }
        }
        return digits;
    }
}
