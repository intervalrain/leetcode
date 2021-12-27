package com.rainhu;

/**
 * 1009. Complement of Base 10 Integer (Easy)
 * 
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and 
 * all the 1's to 0's in its binary representation.
 * 
 *     For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * 
 * Given an integer n, return its complement.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/27
 * @apiNote:
 */

public class n1009_ComplementOfBase10Integer {
    public int bitwiseComplement(int n){
        int len = Integer.toBinaryString(n).length();
        int tmp = (int)(Math.pow(2, len) - 1);
        return tmp - n;
    } 
}
