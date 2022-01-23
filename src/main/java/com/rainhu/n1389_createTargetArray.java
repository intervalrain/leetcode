package com.rainhu;

import java.util.LinkedList;

public class n1389_CreateTargetArray{
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