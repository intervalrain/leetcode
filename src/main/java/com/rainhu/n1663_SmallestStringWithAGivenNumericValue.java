package com.rainhu;

import java.util.Arrays;

/**
 * 1663. Smallest String with A Given Numeric Value (Medium)
 * 
 * The numeric value of a lowercase character is defined as its position (1-indexed) in the alphabet,
 * so the numeric value of a is 1,
 * the numeric value of b is 2,
 * the numeric of c is 3, and so on.
 * 
 * The numeric value of string consisting of lowercase characters is defined as the sum of its characters' numeric values.
 * For example, the nuemric value of the string "abe" is equal to 1 + 2 + 5 = 8.
 * 
 * You are given two integers n and k.
 * Return the lexicographically samllest string with length equal to n and numeric value equal to k.
 * 
 * Note that a string x is lexicographically smaller than string y if x cmoes before y in dictionary order,
 * that is, either x is a prefix of y,
 * or if i is the first position such that x[i] != y[i],
 * then x[i] comes before y[i] in alphabetic order.
 * 
 * @author: Rain Hu
 * @version: 4
 * @since: 2022/3/22
 * @apiNote: Array
 */

public class n1663_SmallestStringWithAGivenNumericValue {
    public String getSmallestString(int n, int k){
        char ch[] = new char[n];
        int i = 0;
        while (i < n){
            if (26 * (n - i) >= k){
                ch[i]='a';
                i++;
                k--;
            } else {
                break;
            }
        }
        i--;
        ch[i] = (char)(k % 26 + 'a');
        i++;
        while (i < n){
            ch[i] = 'z';
            i++;
        }
        return String.valueOf(ch);
    }
    public String getSmallestString3(int n, int k) {
        char[] map = new char[n];
        if (k == 26 * n){
            Arrays.fill(map, 'z');
            return new String(map);
        }
        int p = (k - n) / 25;
        int mod = (k - n) % 25;
        Arrays.fill(map, 0, n - p - 1, 'a');
        map[n - p - 1] = (char)(mod + 'a');
        Arrays.fill(map, n - p, n, 'z');

        return new String(map);
    }
    public String getSmallestString2(int n, int k){
        char[] map = new char[n];
        int p = (k - n) / 25;
        int mod = (k - n) % 25;
        while (p > 0){
            map[n - 1] = (char)(25 + 'a');
            p--;
            n--;
        }
        if (n > 0){
            map[n - 1] = (char)(mod + 'a');
            n--;
        }
        while (n > 0){
            map[n - 1] = 'a';
            n--;
        }
        return new String(map);

    }
    public String getSmallestString1(int n, int k){
        StringBuilder sb = new StringBuilder();
        k -= n;
        while (n > 0){
            if (k > 0){
                int mod = Math.min(k, 25);
                sb.append((char)(mod + 'a'));
                k -= mod;
            } else {
                sb.append('a');
            }
            n--;
        }
        return sb.reverse().toString();
    }
}
