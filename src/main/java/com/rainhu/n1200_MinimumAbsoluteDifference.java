package com.rainhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of distinct integer arr,
 * find all pairs of elements with the minimum absolute difference of any two elements.
 * 
 * Return a list of pairs in ascending order(with respect to pairs),
 * each pair [a, b] follows
 *     1. a, b are from arr
 *     2. a < b
 *     3. b - a equals to the minimum of absolute difference of any two elements int arr.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/21
 * @apiNote:
 */

public class n1200_MinimumAbsoluteDifference {
    List<List<Integer>> minimumAbsDifference(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int sp = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1; i++){
            int diff;
            if ((diff = (arr[i+1] - arr[i])) < sp){
                sp = diff;
                res.clear();
                res.add(List.of(arr[i], arr[i+1]));
            } else if (diff == sp){
                res.add(List.of(arr[i], arr[i+1]));
            }
        }
        return res;
    }
}
