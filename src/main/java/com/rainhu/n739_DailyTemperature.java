package com.rainhu;

import java.util.Arrays;

/**
 * 739. Daily Temperatures (Medium)
 * 
 * Given an array of integers temperatures represents the daily temperatures, 
 * return an array answer such that answer[i] is the number of days 
 * you have to wait after the ith day to get a warmer temperature. 
 * If there is no future day for which this is possible, 
 * keep answer[i] == 0 instead.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/15
 * @apiNote: 
 */

public class n739_DailyTemperature {
    public int[] dailyTemperature(int[] temperatures){
        int n = temperatures.length;
        int hottest = 0;
        int[] answer = new int[n];

        for (int i = n-1; i>=0; i--){
            int curr = temperatures[i];
            if (curr >= hottest){
                hottest = curr;
                continue;
            }
            int days = 1;
            while (temperatures[i + days] <= curr){
                days += answer[i + days];
            }
            answer[i] = days;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] temp = new int[]{55,38,53,81,61,93,97,32,43,78};
        System.out.println(Arrays.toString(new n739_DailyTemperature().dailyTemperature(temp)));
    }
}
