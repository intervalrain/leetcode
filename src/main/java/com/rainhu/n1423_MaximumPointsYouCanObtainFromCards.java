package com.rainhu;

/**
 * 1423. Maximum Points You Can Obtain from Cards (Medium)
 * 
 * There are several cards arranged in a row,
 * and each card has an associated number of points.
 * The points are given in the integer array cardPoints.
 * 
 * In one step, you can take one card from the beginning or from the end of the row.
 * You have to take exactly k cards.
 * 
 * Your score is the sum of the points of the cards you have taken.
 * 
 * Given the integer array cardPoints and the integer k,
 * return the maximum score you can obtain.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/26
 * @apiNote: 
 */

public class n1423_MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k){
        int n = cardPoints.length;
        int min;
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n - k; i++){
            sum += cardPoints[i];
        }
        min = sum;
        total = sum;
        for (int i = n - k; i < n; i++){
            sum += cardPoints[i];
            sum -= cardPoints[i-n+k];
            min = Math.min(sum, min);
            total += cardPoints[i];
        }

        return total - min;
    }
}
