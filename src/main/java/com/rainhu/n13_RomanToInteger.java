package com.rainhu;

/**
 * 13. RomanToInteger (Easy)
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
 * Given a roman numeral, convert it to an integer.
 */
public class n13_RomanToInteger {
    public int romanToInt(String s){

        int result = 0;
        for(int i=s.length()-1; 0<=i; i--){
            switch (s.charAt(i)) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    result += (result >= 500 ? -100 : 100);
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    result += (result >= 50 ? -10 : 10);
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += (result >= 5 ? -1 : 1);
                    break;
            
                default:
                    break;
            }
        }

        // String[] symbol = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        // int[] ary = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};        
        // int result = 0;
        // for(int i=0; i<ary.length; i++){
        //     while(s.length()>0 && s.length()>= symbol[i].length() && s.substring(0, symbol[i].length()).equals(symbol[i])){
        //         s = s.substring(symbol[i].length());
        //         result += ary[i];
        //     } 
        // }
        return result;
    }
}
