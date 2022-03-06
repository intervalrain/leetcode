package com.rainhu;

/**
 * 799. Champagne Tower (Medium)
 * 
 * We stack glasses in a pyramid, 
 * where the first row has 1 glass, 
 * the second row has 2 glasses, 
 * and so on until the 100th row.
 * Each glass holds one cup of champagne.
 * Then, some champagne is poured into the first glass at the top.
 * When the topmost glass is full,
 * any excess liquid poured will fall equally to the glass immediately to the left and right of it.
 * When those glasses become full, 
 * any excess champagne will fall equally to the left and right of those glasses, and so on.  
 * (A glass at the bottom row has its excess champagne fall on the floor.)
 * 
 * For example, after one cup of champagne is poured,
 * the top most glass is full.
 * After two cups of champagne are poured,
 * the two glasses on the second row are half full. 
 * After three cups of champagne are poured,
 * those two cups become full - there are 3 full glasses total now. 
 * After four cups of champagne are poured,
 * the third row has the middle glass half full
 * and the two outside glasses are a quarter full.
 * 
 * Now after pouring some non-negative integer cups of champagne,
 * return how full the jth glass in the ith row is (both i and j are 0-indexed.)
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/4
 * @apiNote: recursion
 */

public class n799_ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass){
        if (query_row == 0) return poured >= 1 ? 1 : 0; 
        double[] glasses = new double[query_row + 1];
        double[] next = new double[query_row + 1];
        glasses[0] = poured;
        double res = pour(glasses, next, query_row)[query_glass];
        return res > 1 ? 1 : res;
    }

    public double[] pour(double[] glasses, double[] next, int times){
        if (times == 0) return glasses;
        for (int i = 0; i < glasses.length-1; i++){
            if (glasses[i] > 1){
                next[i]   += (glasses[i]-1)/2;
                next[i+1] += (glasses[i]-1)/2;
            }
            
        }
        return pour(next, new double[glasses.length], times - 1);
    }
}
