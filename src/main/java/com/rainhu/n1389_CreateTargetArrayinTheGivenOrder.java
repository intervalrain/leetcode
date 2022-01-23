package com.rainhu;

/**
 * 1389. Create Target Array in the Given Order (Medium)
 * 
 * Given two arrays of integers nums and index.
 * Your task is to create target array under the following rules:
 *    + Initialy target array is empty.
 *    + From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 *    + Repeat the previous step until there are no elements to read in nums and index.
 * 
 * Return the target array
 * 
 * It is guaranteed that the insertion operations will be valid.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/23
 * @apiNote: Linked List
 */

import java.util.LinkedList;

public class n1389_CreateTargetArrayinTheGivenOrder{
    public int[] createTargetArray(int[] nums, int[] index){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i< nums.length; i++)
            list.add(index[i], nums[i]);
        int res[] = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            res[i] = list.poll();
        }
        return res;
    }

}