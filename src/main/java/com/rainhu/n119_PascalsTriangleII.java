package com.rainhu;

import java.util.Arrays;
import java.util.List;

/**
 * 119. Pascal's Traingle II (Medium)
 * 
 * Given an integer rowIndex,
 * return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/19
 * @apiNote: dynamic programming
 */

public class n119_PascalsTriangleII {
    public List<Integer> getRow(int rowIndex){
        Integer[] res = new Integer[rowIndex+1];
        Arrays.fill(res, 1);
        for (int i = 1; i <= rowIndex; i++)
            for (int j = i-1; j > 0; j--)
                res[j] = res[j] + res[j-1];
        
        return Arrays.asList(res);
    }
}
