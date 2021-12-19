package com.rainhu;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 448. Find All Numbers Disappeared in an Array (Easy)
 * 
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/19
 * @apiNote: count number
 */

public class n448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearNumbers(int[] nums){
        List<Integer> res = new ArrayList<Integer>();
        int[] cnt = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            cnt[nums[i]-1]++;
        }
        for (int i=0; i<nums.length; i++){
            if (cnt[i] == 0)
                res.add(i+1);
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(new n448_FindAllNumbersDisappearedInAnArray().findDisappearNumbers(new int[]{1,1}).toArray()));
    }
}
