package com.rainhu;

import java.util.Arrays;

/**
 * 1710. Maximum Units on a Truck (Easy)
 * 
 * You are assigned to put some amount of boxes onto one truck.
 * You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBox]:
 *      + numberOfBoxesi is the number of boxes of type i.
 *      + numberOfUnitsPerBoxi is the number of units in each box of the type i.
 * 
 * You are also given an integer truckSize,
 * which is the maximum number of boxes that can be put on the truck.
 * You can choose any boxes to put on th truck as long as the number of boxes does not exceed truckSize.
 * 
 * Return the maximum total number of units that can be put on the truck.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/7/2
 * @apiNote: sort
 */

public class n1710_MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] values = new int[1001];
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int[] box : boxTypes){
            values[box[1]] += box[0];
            cnt++;
            max = Math.max(box[1], max);
            min = Math.min(box[1], min);
            if (cnt == boxTypes.length) break;
        }
        int res = 0;
        for (int i = max; i >= min; i--){
            if (truckSize == 0) 
                break;
            else if (truckSize > values[i]){
                res += values[i] * i;
                truckSize -= values[i];
            } else {
                res += i * Math.min(values[i], truckSize);
                break;
            }
        }
        return res;
    }

    public int maximumUnits2(int[][] boxTypes, int truckSize){
        Arrays.sort(boxTypes, (int[] x, int[] y) -> y[1] - x[1]);
        int res = 0;
        for (int i = 0; i < boxTypes.length; i++){
            if (truckSize <= 0) break;
            int[] box = boxTypes[i];
            res += box[1] * Math.min(truckSize, box[0]);
            truckSize -= box[0];
        }
        return res;
    }
}
