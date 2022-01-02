package com.rainhu;

/**
 * 1010. Pairs of Songs With Total Duration Divisible by 60 (Medium)
 * 
 * You are given a list of songs where the ith song has a duration of time[i] seconds.
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.
 * Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/2
 * @apiNote
 */

public class n1010_PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] map = new int[60];
        for (int i = 0; i < time.length; i++){
            map[time[i] % 60]++;
        }
        
        int cnt = level(map[0]) + level(map[30]);
        for (int i = 1; i <= 29; i++){
            cnt += map[i] * map[60-i];
        }
        return cnt;
    }
    public int level (int n){
        return n*(n-1)/2;
    }
}
