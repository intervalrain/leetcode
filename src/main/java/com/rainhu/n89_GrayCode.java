package com.rainhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * 89. Gray Code (Medium)
 * 
 * An n-bit gray code sequence is a sequence of 2^n integers where:
 *   + Every integer is in the inclusive range [0, 2^n - 1],
 *   + The first integer is 0.
 *   + An integer apeears no more than once in the sequence.
 *   + The binary representation of every pair of adjacent integers differs by exactly one bit, and
 *   + The binary representation of the first and last integers differs by exactly one bit.
 * 
 * Given an integer n, return any valid n-bit gray code sequence.
 * 
 * @author: Rain Hu
 * @version: 3
 * @since: 2022/3/7
 * @apiNote: bit manipulation
 */

public class n89_GrayCode {
    /** best solution: O(nlogn) */
    static int num;
    public List<Integer> grayCode(int n){
        List<Integer> list = new ArrayList<>();
        int num = 0;
        findGrayCodes(list, n);
        return list;
    }

    private static void findGrayCodes(List<Integer> res, int n){
        if (n == 0){
            res.add(num);
        } else {
            findGrayCodes(res, n-1);
            num ^= 1 << (n-1);
            findGrayCodes(res, n-1);
        }
    }

    /** iteration revised version: also O(nlogn) */
    public List<Integer> grayCode3(int n){
        int op = (int)Math.pow(2,n)-1;
        int[] mask = new int[op];
        Arrays.fill(mask, 1);
        int start = 1;
        for (int i = 1; i < n; i++){
            int step = (int)Math.pow(2, i);
            for (int j = start; j < op; j += step){
                mask[j] <<= 1;
            }
            start += step;
        }
        List<Integer> res = new ArrayList<>();
        int curr = 0;
        for (int i = 0; i < op; i++){
            res.add(curr);
            curr ^= mask[i];
        }
        res.add(curr);
        return res;
    }

    // for utility
    public List<Integer> grayCodeUtil(int n){
        List<String> gray = gray(n);
        Map<String, Integer> binary = new HashMap<>();
        int len = (int)Math.pow(2,n);
        for (int i = 0; i < len; i++){
            binary.put(Integer.toBinaryString(i), i);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++){
            res.add(binary.get(gray.get(i)));
        }

        return res;
    }
    private static List<String> binary(int n){
        int bitNum = (int)Math.pow(2, n);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < bitNum; i++){
            res.add(Integer.toBinaryString(i));
        }
        return res;
    }

    private static List<String> gray(int n){
        int bitNum = (int)Math.pow(2, n);
        List<String> binary = binary(n);
        List<String> gray = new ArrayList<>();
        for (int i = 0; i < bitNum; i++){
            gray.add(b2g(binary.get(i)));
        }
        return gray;
    }
    
    private static String b2g(String b){
        StringBuilder sb = new StringBuilder();
        sb.append(b.charAt(0));
        for (int i = 1; i < b.length(); i++){
            sb.append((b.charAt(i) - '0') ^ (b.charAt(i - 1) - '0'));
        }
        return sb.toString();
    }
}
