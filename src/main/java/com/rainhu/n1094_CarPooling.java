package com.rainhu;

/**
 * 1094. Car Pooling (Medium)
 * 
 * There is a car with "capacity" empty seats. 
 * The vehicle only drives east (i.e., it cannot turn around and drive west).
 * 
 * You are given the integer capacity and an array trips where 
 * trip[i] = [numPassengers_i, from_i, to_i] indicates that the ith trip has "numPassengers_i" passengers 
 * and the locations to pick them up and drop them off are "from_i" and "to_i" respectively. 
 * The locations are given as the number of kilometers due east from the car's initial location.
 * 
 * Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/7
 * @apiNote:
 */

public class n1094_CarPooling {
    public boolean carPooling(int[][] trips, int capacity){
        int[] loc = new int[1001];
        int farrest = 0;
        for (int[] trip : trips){
            loc[trip[1]] += trip[0];
            loc[trip[2]] -= trip[0];
            farrest = Math.max(farrest, trip[2]);
        }
        int cnt = 0;
        for (int i = 0; i <= farrest; i++){
            cnt += loc[i];
            if (cnt > capacity) return false;
        }
        return true;
    }
}
