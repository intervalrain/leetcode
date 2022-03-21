package com.rainhu;

/**
 * 1007. Minimum Domino Rotations For Equal Row (Medium)
 * 
 * In a row of dominos, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino.
 * (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
 * 
 * We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.
 * 
 * Return the minimum number of roatations so that all the values in tops are the same,
 * or all the values in bottoms are the same.
 * 
 * If it cannot be done, return -1.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/20
 * @apiNote
 */

public class n1007_MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms){
        int[] cntTop = new int[7], cntBot = new int[7], same = new int[7];
        int n = tops.length;
        for (int i = 0; i < n; ++i) {
            cntTop[tops[i]]++;
            cntBot[bottoms[i]]++;
            if (tops[i] == bottoms[i])
                same[tops[i]]++;
        }
        for (int i  = 1; i < 7; ++i)
            if (cntTop[i] + cntBot[i] - same[i] == n)
                return n - Math.max(cntTop[i], cntBot[i]);
        return -1;
    }
}
