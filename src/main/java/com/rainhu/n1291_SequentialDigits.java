package com.rainhu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1291. Sequential Digits (Medium)
 * 
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 * 
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/23
 * @apiNote: 
 */

public class n1291_SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high){
        Queue<Integer> q = new LinkedList<>();
        for (Integer i = 1; i <= 9; i++){
            q.add(i);
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()){
            int f = (int) q.poll();
            if (f <= high && f >= low){
                res.add(f);
            }
            if (f > high)
                break;
            int num = f % 10;
            if (num < 9)
                q.add(f * 10 + (num + 1));
        }
        return res;
    }

    /** Beautiful Solution */
    public List<Integer> sequentialDigits2(int low, int high){
        String digits = "123456789";
        List<Integer> item = new ArrayList<>();
        
        for (int len = 2; len <= digits.length(); len++) {
            for (int j = 0; j + len <= digits.length(); j++) {
                String sub = digits.substring(j, j + len);
                Integer num = Integer.parseInt(sub);
                if (num >= low && num <= high) {
                    item.add(num);
                }
            }
        }
        return item;
    }

    /** Brutal Solution */
    public List<Integer> sequentialDigits3(int low, int high){
        int[] sol = new int[] {12, 23, 34, 45, 56, 67, 78, 89,
                               123, 234, 345, 456, 567, 678, 789,
                               1234, 2345, 3456, 4567, 5678, 6789,
                               12345, 23456, 34567, 45678, 56789,
                               123456, 234567, 345678, 456789,
                               1234567, 2345678, 3456789,
                               12345678, 23456789,
                               123456789};
        List<Integer> res = new ArrayList<>();
        int n = sol.length;
        for (int i = 0; i < n; i++){
            if (sol[i] < low) continue;
            if (sol[i] > high) break;
            res.add(sol[i]);
        }
        return res;
    }
}
