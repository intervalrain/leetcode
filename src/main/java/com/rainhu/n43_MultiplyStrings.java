package com.rainhu;

/**
 * 43. Multiply Strings (Medium)
 * 
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as string.
 * 
 * Note: You may not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/8
 * @apiNote: Think with gragh while calculating
 * 
 */
public class n43_MultiplyStrings {
    public String multiply(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();
        int[] pos = new int[len1 + len2];
        for (int i = len1-1; i >= 0; i--){
            for (int j = len2-1; j >= 0; j--){
                int res = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = res + pos[p2] + 10 * pos[p1];

                pos[p1] = sum / 10;
                pos[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : pos){
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}