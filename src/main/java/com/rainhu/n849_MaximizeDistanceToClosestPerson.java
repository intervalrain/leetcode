package com.rainhu;

/**
 * 849. Maximize Distance to Closest Person (Medium)
 * 
 * You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, 
 * and seats[i] = 0 represents that the ith seat is empty (0-indexed).
 * 
 * There is at least one empty seat, and at least one person sitting.
 * 
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 
 * 
 * Return that maximum distance to the closest person.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/17
 * @apiNote: just math
 */

public class n849_MaximizeDistanceToClosestPerson{
    
    public int maxDistToClosest(int[] seats){
        int max = 0;
        
        int left = 0;
        int right = 0;
        int len = seats.length;
        
        // count left zeros
        int i = 0;
        int cnt = 0;
        while (seats[i] != 1){
            cnt++;
            i++;
        }
        left = cnt;
        if (left > len/2) return left;
        
        // count right zeros
        i = len - 1;
        cnt = 0;
        while (seats[i] != 1){
            cnt++;
            i--;
        }
        right = cnt;
        if (right > len/2) return right;
        
        // count mid zeros
        for (i = left; i < len - right; i++){
            if (seats[i] == 1){
                max = Math.max(cnt, max);
                cnt = 0;
            } else {
                cnt++;
            }            
        }
        
        max = Math.max(Math.max((Math.max(max, cnt) + 1) / 2, right), left);
        return max;
    }
}