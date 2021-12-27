package com.rainhu;

/**
 * 476. Number Complement (Easy)
 * 
 * The cmoplement of an integer is the integer you get when you flip all the 0's to 1's
 * and all 1's to 0's in its binary representation.
 * 
 *     For example, the integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * 
 * Given an integer num, return its complement.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/27
 * @apiNote
 */

public class n476_NumberComplement{
    public int findComplement(int num){
        int len = Integer.toBinaryString(num).length();
        int tmp = (int)(Math.pow(2, len) - 1);
        return tmp - num;
    }

    public static void main(String[] args){
        n476_NumberComplement clz = new n476_NumberComplement();
        System.out.println(clz.findComplement(2147483646));
    }
}   