package com.rainhu;

/**
 * 12. Integer to Roman (Medium)
 * 
 * Roman numberals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For exmaple, 2 is written as II in Roman numberal, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * 
 * Roman numbers are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII.
 * Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *     I can be placed before V and X to make 4 and 9.
 *     X can be placed before L and C to make 40 and 90.
 *     C can be placed before D and M to make 400 and 900.
 * 
 * Given an integer, convert it to a roman numeral.
 */

public class n12_IntegerToRoman {
    public String intToRoman(int num){
        
        String[] symbol = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] ary = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<ary.length; i++){
            while(num>=ary[i]){
                result.append(symbol[i]);
                num -= ary[i];
            }
        }
        return result.toString();
    }
}
