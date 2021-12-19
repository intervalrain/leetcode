package com.rainhu;

/**
 * 902. Numbers At Most N Given Digit Set (Hard)
 * 
 * Given an array of digits which is sorted in non-decreasing order.
 * You can write numbers using each digits[i] as many times as we want.
 * For example, if digits = ['1','3','5'],
 * we may write numbers such as '13', '551', and '1351315'.
 * 
 * Return the number of positive integers that can be generated that are less than or equal to given integer n.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/18
 * @apiNote: 
 */

public class n902_NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] digits, int n){
        if (digits == null || digits.length== 0 || n == 0) return 0;
        String nStr = Integer.toString(n);
        int len = nStr.length();
        int total = 0;
        int nums = digits.length;

        for (int i = 1; i < len; i++){
            total += Math.pow(nums, i);
        }

        for (int i = 0; i < len; i++){
            boolean flag = false;
            for (String d : digits){
                if (d.charAt(0) < nStr.charAt(i)){
                    total += Math.pow(nums, len - i - 1);
                } else if (d.charAt(0) == nStr.charAt(i)){
                    flag = true;
                }
            }
            if (!flag) return total;
        }
        return total + 1;
    }

    public static void main(String[] args){
        String[] digits = new String[]{"5","7","8"};
        int n = 59;
        System.out.println(new n902_NumbersAtMostNGivenDigitSet().atMostNGivenDigitSet(digits, n));
    }
}
